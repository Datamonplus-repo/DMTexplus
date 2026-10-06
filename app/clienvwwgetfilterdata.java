package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class clienvwwgetfilterdata extends GXProcedure
{
   public clienvwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( clienvwwgetfilterdata.class ), "" );
   }

   public clienvwwgetfilterdata( int remoteHandle ,
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
      clienvwwgetfilterdata.this.aP5 = new String[] {""};
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
      clienvwwgetfilterdata.this.AV46DDOName = aP0;
      clienvwwgetfilterdata.this.AV44SearchTxt = aP1;
      clienvwwgetfilterdata.this.AV45SearchTxtTo = aP2;
      clienvwwgetfilterdata.this.aP3 = aP3;
      clienvwwgetfilterdata.this.aP4 = aP4;
      clienvwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVNM2") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVNM2OPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVDOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVDOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVDM2") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVDM2OPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVPOBOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVCP") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVCPOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVCP2") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVCP2OPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVPRN") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVPRNOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVAG") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVAGOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVNMT") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVNMTOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVMAIL") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVMAILOPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLIENVFX") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIENVFXOPTIONS' */
         S241 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV50OptionsJson = AV49Options.toJSonString(false) ;
      AV53OptionsDescJson = AV52OptionsDesc.toJSonString(false) ;
      AV55OptionIndexesJson = AV54OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV57Session.getValue("CLIENVWWGridState"), "") == 0 )
      {
         AV59GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CLIENVWWGridState"), null, null);
      }
      else
      {
         AV59GridState.fromxml(AV57Session.getValue("CLIENVWWGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV60GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV62FilterFullText = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVLIN") == 0 )
         {
            AV14TFCliEnvLin = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliEnvLin_To = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNOM") == 0 )
         {
            AV16TFCliEnvNom = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNOM_SEL") == 0 )
         {
            AV17TFCliEnvNom_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNM2") == 0 )
         {
            AV18TFCliEnvNm2 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNM2_SEL") == 0 )
         {
            AV19TFCliEnvNm2_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDOM") == 0 )
         {
            AV20TFCliEnvDom = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDOM_SEL") == 0 )
         {
            AV21TFCliEnvDom_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDM2") == 0 )
         {
            AV22TFCliEnvDm2 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDM2_SEL") == 0 )
         {
            AV23TFCliEnvDm2_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPOB") == 0 )
         {
            AV24TFCliEnvPob = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPOB_SEL") == 0 )
         {
            AV25TFCliEnvPob_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP") == 0 )
         {
            AV26TFCliEnvCp = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP_SEL") == 0 )
         {
            AV27TFCliEnvCp_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP2") == 0 )
         {
            AV28TFCliEnvCp2 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP2_SEL") == 0 )
         {
            AV29TFCliEnvCp2_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPRV") == 0 )
         {
            AV30TFCliEnvPrv = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFCliEnvPrv_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPRN") == 0 )
         {
            AV32TFCliEnvPrn = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPRN_SEL") == 0 )
         {
            AV33TFCliEnvPrn_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVAG") == 0 )
         {
            AV34TFCliEnvAg = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVAG_SEL") == 0 )
         {
            AV35TFCliEnvAg_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVTP") == 0 )
         {
            AV36TFCliEnvTp = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliEnvTp_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNMT") == 0 )
         {
            AV38TFCliEnvNmt = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNMT_SEL") == 0 )
         {
            AV39TFCliEnvNmt_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVMAIL") == 0 )
         {
            AV40TFCliEnvMail = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVMAIL_SEL") == 0 )
         {
            AV41TFCliEnvMail_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVFX") == 0 )
         {
            AV42TFCliEnvFx = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVFX_SEL") == 0 )
         {
            AV43TFCliEnvFx_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV44SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV2 */
      pr_default.execute(0, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9LV2 = false ;
         A10052CliEnvFx = P09LV2_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV2_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV2_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV2_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV2_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV2_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV2_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV2_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV2_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV2_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV2_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV2_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV2_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV2_A266CliEnvLin[0] ;
         A252CliCod = P09LV2_A252CliCod[0] ;
         A723CliEnvTp = P09LV2_A723CliEnvTp[0] ;
         A396EmprCod = P09LV2_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV2_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV2_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char5[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char5[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09LV2_A396EmprCod[0], A396EmprCod) == 0 ) )
                  {
                     brk9LV2 = false ;
                     A266CliEnvLin = P09LV2_A266CliEnvLin[0] ;
                     A252CliCod = P09LV2_A252CliCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV2 = true ;
                     pr_default.readNext(0);
                  }
                  if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
                  {
                     AV48Option = A396EmprCod ;
                     AV51OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
                     AV49Options.add(AV48Option, 0);
                     AV52OptionsDesc.add(AV51OptionDesc, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV2 )
         {
            brk9LV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLIENVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliEnvNom = AV44SearchTxt ;
      AV17TFCliEnvNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV3 */
      pr_default.execute(1, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9LV4 = false ;
         A267CliEnvNom = P09LV3_A267CliEnvNom[0] ;
         A10052CliEnvFx = P09LV3_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV3_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV3_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV3_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV3_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV3_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV3_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV3_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV3_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV3_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV3_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV3_A5531CliEnvNm2[0] ;
         A266CliEnvLin = P09LV3_A266CliEnvLin[0] ;
         A252CliCod = P09LV3_A252CliCod[0] ;
         A723CliEnvTp = P09LV3_A723CliEnvTp[0] ;
         A396EmprCod = P09LV3_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV3_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV3_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09LV3_A267CliEnvNom[0], A267CliEnvNom) == 0 ) )
                  {
                     brk9LV4 = false ;
                     A266CliEnvLin = P09LV3_A266CliEnvLin[0] ;
                     A252CliCod = P09LV3_A252CliCod[0] ;
                     A396EmprCod = P09LV3_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV4 = true ;
                     pr_default.readNext(1);
                  }
                  if ( ! (GXutil.strcmp("", A267CliEnvNom)==0) )
                  {
                     AV48Option = A267CliEnvNom ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV4 )
         {
            brk9LV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLIENVNM2OPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliEnvNm2 = AV44SearchTxt ;
      AV19TFCliEnvNm2_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV4 */
      pr_default.execute(2, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9LV6 = false ;
         A5531CliEnvNm2 = P09LV4_A5531CliEnvNm2[0] ;
         A10052CliEnvFx = P09LV4_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV4_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV4_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV4_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV4_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV4_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV4_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV4_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV4_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV4_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV4_A265CliEnvDom[0] ;
         A267CliEnvNom = P09LV4_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV4_A266CliEnvLin[0] ;
         A252CliCod = P09LV4_A252CliCod[0] ;
         A723CliEnvTp = P09LV4_A723CliEnvTp[0] ;
         A396EmprCod = P09LV4_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV4_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV4_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09LV4_A5531CliEnvNm2[0], A5531CliEnvNm2) == 0 ) )
                  {
                     brk9LV6 = false ;
                     A266CliEnvLin = P09LV4_A266CliEnvLin[0] ;
                     A252CliCod = P09LV4_A252CliCod[0] ;
                     A396EmprCod = P09LV4_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV6 = true ;
                     pr_default.readNext(2);
                  }
                  if ( ! (GXutil.strcmp("", A5531CliEnvNm2)==0) )
                  {
                     AV48Option = A5531CliEnvNm2 ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV6 )
         {
            brk9LV6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCLIENVDOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliEnvDom = AV44SearchTxt ;
      AV21TFCliEnvDom_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV5 */
      pr_default.execute(3, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9LV8 = false ;
         A265CliEnvDom = P09LV5_A265CliEnvDom[0] ;
         A10052CliEnvFx = P09LV5_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV5_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV5_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV5_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV5_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV5_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV5_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV5_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV5_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV5_A5530CliEnvDm2[0] ;
         A5531CliEnvNm2 = P09LV5_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV5_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV5_A266CliEnvLin[0] ;
         A252CliCod = P09LV5_A252CliCod[0] ;
         A723CliEnvTp = P09LV5_A723CliEnvTp[0] ;
         A396EmprCod = P09LV5_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV5_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV5_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09LV5_A265CliEnvDom[0], A265CliEnvDom) == 0 ) )
                  {
                     brk9LV8 = false ;
                     A266CliEnvLin = P09LV5_A266CliEnvLin[0] ;
                     A252CliCod = P09LV5_A252CliCod[0] ;
                     A396EmprCod = P09LV5_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV8 = true ;
                     pr_default.readNext(3);
                  }
                  if ( ! (GXutil.strcmp("", A265CliEnvDom)==0) )
                  {
                     AV48Option = A265CliEnvDom ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV8 )
         {
            brk9LV8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCLIENVDM2OPTIONS' Routine */
      returnInSub = false ;
      AV22TFCliEnvDm2 = AV44SearchTxt ;
      AV23TFCliEnvDm2_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV6 */
      pr_default.execute(4, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9LV10 = false ;
         A5530CliEnvDm2 = P09LV6_A5530CliEnvDm2[0] ;
         A10052CliEnvFx = P09LV6_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV6_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV6_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV6_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV6_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV6_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV6_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV6_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV6_A268CliEnvPob[0] ;
         A265CliEnvDom = P09LV6_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV6_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV6_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV6_A266CliEnvLin[0] ;
         A252CliCod = P09LV6_A252CliCod[0] ;
         A723CliEnvTp = P09LV6_A723CliEnvTp[0] ;
         A396EmprCod = P09LV6_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV6_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV6_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09LV6_A5530CliEnvDm2[0], A5530CliEnvDm2) == 0 ) )
                  {
                     brk9LV10 = false ;
                     A266CliEnvLin = P09LV6_A266CliEnvLin[0] ;
                     A252CliCod = P09LV6_A252CliCod[0] ;
                     A396EmprCod = P09LV6_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV10 = true ;
                     pr_default.readNext(4);
                  }
                  if ( ! (GXutil.strcmp("", A5530CliEnvDm2)==0) )
                  {
                     AV48Option = A5530CliEnvDm2 ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV10 )
         {
            brk9LV10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADCLIENVPOBOPTIONS' Routine */
      returnInSub = false ;
      AV24TFCliEnvPob = AV44SearchTxt ;
      AV25TFCliEnvPob_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV7 */
      pr_default.execute(5, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9LV12 = false ;
         A268CliEnvPob = P09LV7_A268CliEnvPob[0] ;
         A10052CliEnvFx = P09LV7_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV7_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV7_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV7_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV7_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV7_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV7_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV7_A264CliEnvCp[0] ;
         A5530CliEnvDm2 = P09LV7_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV7_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV7_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV7_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV7_A266CliEnvLin[0] ;
         A252CliCod = P09LV7_A252CliCod[0] ;
         A723CliEnvTp = P09LV7_A723CliEnvTp[0] ;
         A396EmprCod = P09LV7_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV7_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV7_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09LV7_A268CliEnvPob[0], A268CliEnvPob) == 0 ) )
                  {
                     brk9LV12 = false ;
                     A266CliEnvLin = P09LV7_A266CliEnvLin[0] ;
                     A252CliCod = P09LV7_A252CliCod[0] ;
                     A396EmprCod = P09LV7_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV12 = true ;
                     pr_default.readNext(5);
                  }
                  if ( ! (GXutil.strcmp("", A268CliEnvPob)==0) )
                  {
                     AV48Option = A268CliEnvPob ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV12 )
         {
            brk9LV12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADCLIENVCPOPTIONS' Routine */
      returnInSub = false ;
      AV26TFCliEnvCp = AV44SearchTxt ;
      AV27TFCliEnvCp_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV8 */
      pr_default.execute(6, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9LV14 = false ;
         A264CliEnvCp = P09LV8_A264CliEnvCp[0] ;
         A10052CliEnvFx = P09LV8_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV8_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV8_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV8_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV8_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV8_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV8_A10775CliEnvCp2[0] ;
         A268CliEnvPob = P09LV8_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV8_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV8_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV8_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV8_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV8_A266CliEnvLin[0] ;
         A252CliCod = P09LV8_A252CliCod[0] ;
         A723CliEnvTp = P09LV8_A723CliEnvTp[0] ;
         A396EmprCod = P09LV8_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV8_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV8_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09LV8_A264CliEnvCp[0], A264CliEnvCp) == 0 ) )
                  {
                     brk9LV14 = false ;
                     A266CliEnvLin = P09LV8_A266CliEnvLin[0] ;
                     A252CliCod = P09LV8_A252CliCod[0] ;
                     A396EmprCod = P09LV8_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV14 = true ;
                     pr_default.readNext(6);
                  }
                  if ( ! (GXutil.strcmp("", A264CliEnvCp)==0) )
                  {
                     AV48Option = A264CliEnvCp ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV14 )
         {
            brk9LV14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADCLIENVCP2OPTIONS' Routine */
      returnInSub = false ;
      AV28TFCliEnvCp2 = AV44SearchTxt ;
      AV29TFCliEnvCp2_Sel = "" ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV9 */
      pr_default.execute(7, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9LV16 = false ;
         A10775CliEnvCp2 = P09LV9_A10775CliEnvCp2[0] ;
         A10052CliEnvFx = P09LV9_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV9_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV9_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV9_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV9_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV9_A270CliEnvPrv[0] ;
         A264CliEnvCp = P09LV9_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV9_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV9_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV9_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV9_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV9_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV9_A266CliEnvLin[0] ;
         A252CliCod = P09LV9_A252CliCod[0] ;
         A723CliEnvTp = P09LV9_A723CliEnvTp[0] ;
         A396EmprCod = P09LV9_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV9_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV9_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09LV9_A10775CliEnvCp2[0], A10775CliEnvCp2) == 0 ) )
                  {
                     brk9LV16 = false ;
                     A266CliEnvLin = P09LV9_A266CliEnvLin[0] ;
                     A252CliCod = P09LV9_A252CliCod[0] ;
                     A396EmprCod = P09LV9_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV16 = true ;
                     pr_default.readNext(7);
                  }
                  if ( ! (GXutil.strcmp("", A10775CliEnvCp2)==0) )
                  {
                     AV48Option = A10775CliEnvCp2 ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV16 )
         {
            brk9LV16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADCLIENVPRNOPTIONS' Routine */
      returnInSub = false ;
      AV32TFCliEnvPrn = AV44SearchTxt ;
      AV33TFCliEnvPrn_Sel = "" ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV10 */
      pr_default.execute(8, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk9LV18 = false ;
         A270CliEnvPrv = P09LV10_A270CliEnvPrv[0] ;
         A10052CliEnvFx = P09LV10_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV10_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV10_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV10_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV10_n269CliEnvPrn[0] ;
         A10775CliEnvCp2 = P09LV10_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV10_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV10_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV10_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV10_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV10_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV10_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV10_A266CliEnvLin[0] ;
         A252CliCod = P09LV10_A252CliCod[0] ;
         A723CliEnvTp = P09LV10_A723CliEnvTp[0] ;
         A396EmprCod = P09LV10_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV10_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV10_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(8) != 101) && ( P09LV10_A270CliEnvPrv[0] == A270CliEnvPrv ) )
                  {
                     brk9LV18 = false ;
                     A266CliEnvLin = P09LV10_A266CliEnvLin[0] ;
                     A252CliCod = P09LV10_A252CliCod[0] ;
                     A396EmprCod = P09LV10_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV18 = true ;
                     pr_default.readNext(8);
                  }
                  if ( ! (GXutil.strcmp("", A269CliEnvPrn)==0) )
                  {
                     AV48Option = A269CliEnvPrn ;
                     AV51OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A269CliEnvPrn, "@!"))) ;
                     AV47InsertIndex = 1 ;
                     while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV52OptionsDesc.elementAt(-1+AV47InsertIndex), AV51OptionDesc) < 0 ) )
                     {
                        AV47InsertIndex = (int)(AV47InsertIndex+1) ;
                     }
                     AV49Options.add(AV48Option, AV47InsertIndex);
                     AV52OptionsDesc.add(AV51OptionDesc, AV47InsertIndex);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV18 )
         {
            brk9LV18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADCLIENVAGOPTIONS' Routine */
      returnInSub = false ;
      AV34TFCliEnvAg = AV44SearchTxt ;
      AV35TFCliEnvAg_Sel = "" ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV11 */
      pr_default.execute(9, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk9LV20 = false ;
         A689CliEnvAg = P09LV11_A689CliEnvAg[0] ;
         A10052CliEnvFx = P09LV11_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV11_A10051CliEnvMail[0] ;
         A269CliEnvPrn = P09LV11_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV11_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV11_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV11_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV11_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV11_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV11_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV11_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV11_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV11_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV11_A266CliEnvLin[0] ;
         A252CliCod = P09LV11_A252CliCod[0] ;
         A723CliEnvTp = P09LV11_A723CliEnvTp[0] ;
         A396EmprCod = P09LV11_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV11_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV11_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P09LV11_A689CliEnvAg[0], A689CliEnvAg) == 0 ) )
                  {
                     brk9LV20 = false ;
                     A266CliEnvLin = P09LV11_A266CliEnvLin[0] ;
                     A252CliCod = P09LV11_A252CliCod[0] ;
                     A396EmprCod = P09LV11_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV20 = true ;
                     pr_default.readNext(9);
                  }
                  if ( ! (GXutil.strcmp("", A689CliEnvAg)==0) )
                  {
                     AV48Option = A689CliEnvAg ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV20 )
         {
            brk9LV20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADCLIENVNMTOPTIONS' Routine */
      returnInSub = false ;
      AV38TFCliEnvNmt = AV44SearchTxt ;
      AV39TFCliEnvNmt_Sel = "" ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV12 */
      pr_default.execute(10, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A10052CliEnvFx = P09LV12_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV12_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV12_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV12_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV12_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV12_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV12_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV12_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV12_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV12_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV12_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV12_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV12_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV12_A266CliEnvLin[0] ;
         A252CliCod = P09LV12_A252CliCod[0] ;
         A723CliEnvTp = P09LV12_A723CliEnvTp[0] ;
         A396EmprCod = P09LV12_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV12_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV12_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A693CliEnvNmt)==0) )
                  {
                     AV48Option = A693CliEnvNmt ;
                     AV47InsertIndex = 1 ;
                     while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) < 0 ) )
                     {
                        AV47InsertIndex = (int)(AV47InsertIndex+1) ;
                     }
                     if ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) == 0 ) )
                     {
                        AV56count = GXutil.lval( (String)AV54OptionIndexes.elementAt(-1+AV47InsertIndex)) ;
                        AV56count = (long)(AV56count+1) ;
                        AV54OptionIndexes.removeItem(AV47InsertIndex);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
                     }
                     else
                     {
                        AV49Options.add(AV48Option, AV47InsertIndex);
                        AV54OptionIndexes.add("1", AV47InsertIndex);
                     }
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADCLIENVMAILOPTIONS' Routine */
      returnInSub = false ;
      AV40TFCliEnvMail = AV44SearchTxt ;
      AV41TFCliEnvMail_Sel = "" ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV13 */
      pr_default.execute(11, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(11) != 101) )
      {
         brk9LV23 = false ;
         A10051CliEnvMail = P09LV13_A10051CliEnvMail[0] ;
         A10052CliEnvFx = P09LV13_A10052CliEnvFx[0] ;
         A689CliEnvAg = P09LV13_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV13_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV13_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV13_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV13_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV13_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV13_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV13_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV13_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV13_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV13_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV13_A266CliEnvLin[0] ;
         A252CliCod = P09LV13_A252CliCod[0] ;
         A723CliEnvTp = P09LV13_A723CliEnvTp[0] ;
         A396EmprCod = P09LV13_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV13_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV13_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(P09LV13_A10051CliEnvMail[0], A10051CliEnvMail) == 0 ) )
                  {
                     brk9LV23 = false ;
                     A266CliEnvLin = P09LV13_A266CliEnvLin[0] ;
                     A252CliCod = P09LV13_A252CliCod[0] ;
                     A396EmprCod = P09LV13_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV23 = true ;
                     pr_default.readNext(11);
                  }
                  if ( ! (GXutil.strcmp("", A10051CliEnvMail)==0) )
                  {
                     AV48Option = A10051CliEnvMail ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV23 )
         {
            brk9LV23 = true ;
            pr_default.readNext(11);
         }
      }
      pr_default.close(11);
   }

   public void S241( )
   {
      /* 'LOADCLIENVFXOPTIONS' Routine */
      returnInSub = false ;
      AV42TFCliEnvFx = AV44SearchTxt ;
      AV43TFCliEnvFx_Sel = "" ;
      pr_default.dynParam(12, new Object[]{ new Object[]{
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           Byte.valueOf(AV14TFCliEnvLin) ,
                                           Byte.valueOf(AV15TFCliEnvLin_To) ,
                                           AV17TFCliEnvNom_Sel ,
                                           AV16TFCliEnvNom ,
                                           AV19TFCliEnvNm2_Sel ,
                                           AV18TFCliEnvNm2 ,
                                           AV21TFCliEnvDom_Sel ,
                                           AV20TFCliEnvDom ,
                                           AV23TFCliEnvDm2_Sel ,
                                           AV22TFCliEnvDm2 ,
                                           AV25TFCliEnvPob_Sel ,
                                           AV24TFCliEnvPob ,
                                           AV27TFCliEnvCp_Sel ,
                                           AV26TFCliEnvCp ,
                                           AV29TFCliEnvCp2_Sel ,
                                           AV28TFCliEnvCp2 ,
                                           Short.valueOf(AV30TFCliEnvPrv) ,
                                           Short.valueOf(AV31TFCliEnvPrv_To) ,
                                           AV33TFCliEnvPrn_Sel ,
                                           AV32TFCliEnvPrn ,
                                           AV35TFCliEnvAg_Sel ,
                                           AV34TFCliEnvAg ,
                                           Short.valueOf(AV36TFCliEnvTp) ,
                                           Short.valueOf(AV37TFCliEnvTp_To) ,
                                           AV41TFCliEnvMail_Sel ,
                                           AV40TFCliEnvMail ,
                                           AV43TFCliEnvFx_Sel ,
                                           AV42TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           AV62FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV39TFCliEnvNmt_Sel ,
                                           AV38TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV16TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV16TFCliEnvNom), 30, "%") ;
      lV18TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV18TFCliEnvNm2), 30, "%") ;
      lV20TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV20TFCliEnvDom), 34, "%") ;
      lV22TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV22TFCliEnvDm2), 34, "%") ;
      lV24TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV24TFCliEnvPob), 30, "%") ;
      lV26TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV26TFCliEnvCp), 6, "%") ;
      lV28TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV28TFCliEnvCp2), 6, "%") ;
      lV32TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV32TFCliEnvPrn), 30, "%") ;
      lV34TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV34TFCliEnvAg), 1, "%") ;
      lV40TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV40TFCliEnvMail), 40, "%") ;
      lV42TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV42TFCliEnvFx), 20, "%") ;
      /* Using cursor P09LV14 */
      pr_default.execute(12, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), Byte.valueOf(AV14TFCliEnvLin), Byte.valueOf(AV15TFCliEnvLin_To), lV16TFCliEnvNom, AV17TFCliEnvNom_Sel, lV18TFCliEnvNm2, AV19TFCliEnvNm2_Sel, lV20TFCliEnvDom, AV21TFCliEnvDom_Sel, lV22TFCliEnvDm2, AV23TFCliEnvDm2_Sel, lV24TFCliEnvPob, AV25TFCliEnvPob_Sel, lV26TFCliEnvCp, AV27TFCliEnvCp_Sel, lV28TFCliEnvCp2, AV29TFCliEnvCp2_Sel, Short.valueOf(AV30TFCliEnvPrv), Short.valueOf(AV31TFCliEnvPrv_To), lV32TFCliEnvPrn, AV33TFCliEnvPrn_Sel, lV34TFCliEnvAg, AV35TFCliEnvAg_Sel, Short.valueOf(AV36TFCliEnvTp), Short.valueOf(AV37TFCliEnvTp_To), lV40TFCliEnvMail, AV41TFCliEnvMail_Sel, lV42TFCliEnvFx, AV43TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(12) != 101) )
      {
         brk9LV25 = false ;
         A10052CliEnvFx = P09LV14_A10052CliEnvFx[0] ;
         A10051CliEnvMail = P09LV14_A10051CliEnvMail[0] ;
         A689CliEnvAg = P09LV14_A689CliEnvAg[0] ;
         A269CliEnvPrn = P09LV14_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV14_n269CliEnvPrn[0] ;
         A270CliEnvPrv = P09LV14_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = P09LV14_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P09LV14_A264CliEnvCp[0] ;
         A268CliEnvPob = P09LV14_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = P09LV14_A5530CliEnvDm2[0] ;
         A265CliEnvDom = P09LV14_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = P09LV14_A5531CliEnvNm2[0] ;
         A267CliEnvNom = P09LV14_A267CliEnvNom[0] ;
         A266CliEnvLin = P09LV14_A266CliEnvLin[0] ;
         A252CliCod = P09LV14_A252CliCod[0] ;
         A723CliEnvTp = P09LV14_A723CliEnvTp[0] ;
         A396EmprCod = P09LV14_A396EmprCod[0] ;
         A269CliEnvPrn = P09LV14_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P09LV14_n269CliEnvPrn[0] ;
         GXt_char2 = A693CliEnvNmt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char2 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         clienvwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         clienvwwgetfilterdata.this.A723CliEnvTp = GXv_int4[0] ;
         clienvwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A693CliEnvNmt = GXt_char2 ;
         if ( (GXutil.strcmp("", AV62FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV62FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV62FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV38TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV39TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV39TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  AV56count = 0 ;
                  while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(P09LV14_A10052CliEnvFx[0], A10052CliEnvFx) == 0 ) )
                  {
                     brk9LV25 = false ;
                     A266CliEnvLin = P09LV14_A266CliEnvLin[0] ;
                     A252CliCod = P09LV14_A252CliCod[0] ;
                     A396EmprCod = P09LV14_A396EmprCod[0] ;
                     AV56count = (long)(AV56count+1) ;
                     brk9LV25 = true ;
                     pr_default.readNext(12);
                  }
                  if ( ! (GXutil.strcmp("", A10052CliEnvFx)==0) )
                  {
                     AV48Option = A10052CliEnvFx ;
                     AV49Options.add(AV48Option, 0);
                     AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV49Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9LV25 )
         {
            brk9LV25 = true ;
            pr_default.readNext(12);
         }
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP3[0] = clienvwwgetfilterdata.this.AV50OptionsJson;
      this.aP4[0] = clienvwwgetfilterdata.this.AV53OptionsDescJson;
      this.aP5[0] = clienvwwgetfilterdata.this.AV55OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV50OptionsJson = "" ;
      AV53OptionsDescJson = "" ;
      AV55OptionIndexesJson = "" ;
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57Session = httpContext.getWebSession();
      AV59GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV60GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV16TFCliEnvNom = "" ;
      AV17TFCliEnvNom_Sel = "" ;
      AV18TFCliEnvNm2 = "" ;
      AV19TFCliEnvNm2_Sel = "" ;
      AV20TFCliEnvDom = "" ;
      AV21TFCliEnvDom_Sel = "" ;
      AV22TFCliEnvDm2 = "" ;
      AV23TFCliEnvDm2_Sel = "" ;
      AV24TFCliEnvPob = "" ;
      AV25TFCliEnvPob_Sel = "" ;
      AV26TFCliEnvCp = "" ;
      AV27TFCliEnvCp_Sel = "" ;
      AV28TFCliEnvCp2 = "" ;
      AV29TFCliEnvCp2_Sel = "" ;
      AV32TFCliEnvPrn = "" ;
      AV33TFCliEnvPrn_Sel = "" ;
      AV34TFCliEnvAg = "" ;
      AV35TFCliEnvAg_Sel = "" ;
      AV38TFCliEnvNmt = "" ;
      AV39TFCliEnvNmt_Sel = "" ;
      AV40TFCliEnvMail = "" ;
      AV41TFCliEnvMail_Sel = "" ;
      AV42TFCliEnvFx = "" ;
      AV43TFCliEnvFx_Sel = "" ;
      lV62FilterFullText = "" ;
      scmdbuf = "" ;
      lV10TFEmprCod = "" ;
      lV16TFCliEnvNom = "" ;
      lV18TFCliEnvNm2 = "" ;
      lV20TFCliEnvDom = "" ;
      lV22TFCliEnvDm2 = "" ;
      lV24TFCliEnvPob = "" ;
      lV26TFCliEnvCp = "" ;
      lV28TFCliEnvCp2 = "" ;
      lV32TFCliEnvPrn = "" ;
      lV34TFCliEnvAg = "" ;
      lV40TFCliEnvMail = "" ;
      lV42TFCliEnvFx = "" ;
      A396EmprCod = "" ;
      A267CliEnvNom = "" ;
      A5531CliEnvNm2 = "" ;
      A265CliEnvDom = "" ;
      A5530CliEnvDm2 = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A269CliEnvPrn = "" ;
      A689CliEnvAg = "" ;
      A10051CliEnvMail = "" ;
      A10052CliEnvFx = "" ;
      A693CliEnvNmt = "" ;
      P09LV2_A10052CliEnvFx = new String[] {""} ;
      P09LV2_A10051CliEnvMail = new String[] {""} ;
      P09LV2_A689CliEnvAg = new String[] {""} ;
      P09LV2_A269CliEnvPrn = new String[] {""} ;
      P09LV2_n269CliEnvPrn = new boolean[] {false} ;
      P09LV2_A270CliEnvPrv = new short[1] ;
      P09LV2_A10775CliEnvCp2 = new String[] {""} ;
      P09LV2_A264CliEnvCp = new String[] {""} ;
      P09LV2_A268CliEnvPob = new String[] {""} ;
      P09LV2_A5530CliEnvDm2 = new String[] {""} ;
      P09LV2_A265CliEnvDom = new String[] {""} ;
      P09LV2_A5531CliEnvNm2 = new String[] {""} ;
      P09LV2_A267CliEnvNom = new String[] {""} ;
      P09LV2_A266CliEnvLin = new byte[1] ;
      P09LV2_A252CliCod = new int[1] ;
      P09LV2_A723CliEnvTp = new short[1] ;
      P09LV2_A396EmprCod = new String[] {""} ;
      AV48Option = "" ;
      AV51OptionDesc = "" ;
      P09LV3_A267CliEnvNom = new String[] {""} ;
      P09LV3_A10052CliEnvFx = new String[] {""} ;
      P09LV3_A10051CliEnvMail = new String[] {""} ;
      P09LV3_A689CliEnvAg = new String[] {""} ;
      P09LV3_A269CliEnvPrn = new String[] {""} ;
      P09LV3_n269CliEnvPrn = new boolean[] {false} ;
      P09LV3_A270CliEnvPrv = new short[1] ;
      P09LV3_A10775CliEnvCp2 = new String[] {""} ;
      P09LV3_A264CliEnvCp = new String[] {""} ;
      P09LV3_A268CliEnvPob = new String[] {""} ;
      P09LV3_A5530CliEnvDm2 = new String[] {""} ;
      P09LV3_A265CliEnvDom = new String[] {""} ;
      P09LV3_A5531CliEnvNm2 = new String[] {""} ;
      P09LV3_A266CliEnvLin = new byte[1] ;
      P09LV3_A252CliCod = new int[1] ;
      P09LV3_A723CliEnvTp = new short[1] ;
      P09LV3_A396EmprCod = new String[] {""} ;
      P09LV4_A5531CliEnvNm2 = new String[] {""} ;
      P09LV4_A10052CliEnvFx = new String[] {""} ;
      P09LV4_A10051CliEnvMail = new String[] {""} ;
      P09LV4_A689CliEnvAg = new String[] {""} ;
      P09LV4_A269CliEnvPrn = new String[] {""} ;
      P09LV4_n269CliEnvPrn = new boolean[] {false} ;
      P09LV4_A270CliEnvPrv = new short[1] ;
      P09LV4_A10775CliEnvCp2 = new String[] {""} ;
      P09LV4_A264CliEnvCp = new String[] {""} ;
      P09LV4_A268CliEnvPob = new String[] {""} ;
      P09LV4_A5530CliEnvDm2 = new String[] {""} ;
      P09LV4_A265CliEnvDom = new String[] {""} ;
      P09LV4_A267CliEnvNom = new String[] {""} ;
      P09LV4_A266CliEnvLin = new byte[1] ;
      P09LV4_A252CliCod = new int[1] ;
      P09LV4_A723CliEnvTp = new short[1] ;
      P09LV4_A396EmprCod = new String[] {""} ;
      P09LV5_A265CliEnvDom = new String[] {""} ;
      P09LV5_A10052CliEnvFx = new String[] {""} ;
      P09LV5_A10051CliEnvMail = new String[] {""} ;
      P09LV5_A689CliEnvAg = new String[] {""} ;
      P09LV5_A269CliEnvPrn = new String[] {""} ;
      P09LV5_n269CliEnvPrn = new boolean[] {false} ;
      P09LV5_A270CliEnvPrv = new short[1] ;
      P09LV5_A10775CliEnvCp2 = new String[] {""} ;
      P09LV5_A264CliEnvCp = new String[] {""} ;
      P09LV5_A268CliEnvPob = new String[] {""} ;
      P09LV5_A5530CliEnvDm2 = new String[] {""} ;
      P09LV5_A5531CliEnvNm2 = new String[] {""} ;
      P09LV5_A267CliEnvNom = new String[] {""} ;
      P09LV5_A266CliEnvLin = new byte[1] ;
      P09LV5_A252CliCod = new int[1] ;
      P09LV5_A723CliEnvTp = new short[1] ;
      P09LV5_A396EmprCod = new String[] {""} ;
      P09LV6_A5530CliEnvDm2 = new String[] {""} ;
      P09LV6_A10052CliEnvFx = new String[] {""} ;
      P09LV6_A10051CliEnvMail = new String[] {""} ;
      P09LV6_A689CliEnvAg = new String[] {""} ;
      P09LV6_A269CliEnvPrn = new String[] {""} ;
      P09LV6_n269CliEnvPrn = new boolean[] {false} ;
      P09LV6_A270CliEnvPrv = new short[1] ;
      P09LV6_A10775CliEnvCp2 = new String[] {""} ;
      P09LV6_A264CliEnvCp = new String[] {""} ;
      P09LV6_A268CliEnvPob = new String[] {""} ;
      P09LV6_A265CliEnvDom = new String[] {""} ;
      P09LV6_A5531CliEnvNm2 = new String[] {""} ;
      P09LV6_A267CliEnvNom = new String[] {""} ;
      P09LV6_A266CliEnvLin = new byte[1] ;
      P09LV6_A252CliCod = new int[1] ;
      P09LV6_A723CliEnvTp = new short[1] ;
      P09LV6_A396EmprCod = new String[] {""} ;
      P09LV7_A268CliEnvPob = new String[] {""} ;
      P09LV7_A10052CliEnvFx = new String[] {""} ;
      P09LV7_A10051CliEnvMail = new String[] {""} ;
      P09LV7_A689CliEnvAg = new String[] {""} ;
      P09LV7_A269CliEnvPrn = new String[] {""} ;
      P09LV7_n269CliEnvPrn = new boolean[] {false} ;
      P09LV7_A270CliEnvPrv = new short[1] ;
      P09LV7_A10775CliEnvCp2 = new String[] {""} ;
      P09LV7_A264CliEnvCp = new String[] {""} ;
      P09LV7_A5530CliEnvDm2 = new String[] {""} ;
      P09LV7_A265CliEnvDom = new String[] {""} ;
      P09LV7_A5531CliEnvNm2 = new String[] {""} ;
      P09LV7_A267CliEnvNom = new String[] {""} ;
      P09LV7_A266CliEnvLin = new byte[1] ;
      P09LV7_A252CliCod = new int[1] ;
      P09LV7_A723CliEnvTp = new short[1] ;
      P09LV7_A396EmprCod = new String[] {""} ;
      P09LV8_A264CliEnvCp = new String[] {""} ;
      P09LV8_A10052CliEnvFx = new String[] {""} ;
      P09LV8_A10051CliEnvMail = new String[] {""} ;
      P09LV8_A689CliEnvAg = new String[] {""} ;
      P09LV8_A269CliEnvPrn = new String[] {""} ;
      P09LV8_n269CliEnvPrn = new boolean[] {false} ;
      P09LV8_A270CliEnvPrv = new short[1] ;
      P09LV8_A10775CliEnvCp2 = new String[] {""} ;
      P09LV8_A268CliEnvPob = new String[] {""} ;
      P09LV8_A5530CliEnvDm2 = new String[] {""} ;
      P09LV8_A265CliEnvDom = new String[] {""} ;
      P09LV8_A5531CliEnvNm2 = new String[] {""} ;
      P09LV8_A267CliEnvNom = new String[] {""} ;
      P09LV8_A266CliEnvLin = new byte[1] ;
      P09LV8_A252CliCod = new int[1] ;
      P09LV8_A723CliEnvTp = new short[1] ;
      P09LV8_A396EmprCod = new String[] {""} ;
      P09LV9_A10775CliEnvCp2 = new String[] {""} ;
      P09LV9_A10052CliEnvFx = new String[] {""} ;
      P09LV9_A10051CliEnvMail = new String[] {""} ;
      P09LV9_A689CliEnvAg = new String[] {""} ;
      P09LV9_A269CliEnvPrn = new String[] {""} ;
      P09LV9_n269CliEnvPrn = new boolean[] {false} ;
      P09LV9_A270CliEnvPrv = new short[1] ;
      P09LV9_A264CliEnvCp = new String[] {""} ;
      P09LV9_A268CliEnvPob = new String[] {""} ;
      P09LV9_A5530CliEnvDm2 = new String[] {""} ;
      P09LV9_A265CliEnvDom = new String[] {""} ;
      P09LV9_A5531CliEnvNm2 = new String[] {""} ;
      P09LV9_A267CliEnvNom = new String[] {""} ;
      P09LV9_A266CliEnvLin = new byte[1] ;
      P09LV9_A252CliCod = new int[1] ;
      P09LV9_A723CliEnvTp = new short[1] ;
      P09LV9_A396EmprCod = new String[] {""} ;
      P09LV10_A270CliEnvPrv = new short[1] ;
      P09LV10_A10052CliEnvFx = new String[] {""} ;
      P09LV10_A10051CliEnvMail = new String[] {""} ;
      P09LV10_A689CliEnvAg = new String[] {""} ;
      P09LV10_A269CliEnvPrn = new String[] {""} ;
      P09LV10_n269CliEnvPrn = new boolean[] {false} ;
      P09LV10_A10775CliEnvCp2 = new String[] {""} ;
      P09LV10_A264CliEnvCp = new String[] {""} ;
      P09LV10_A268CliEnvPob = new String[] {""} ;
      P09LV10_A5530CliEnvDm2 = new String[] {""} ;
      P09LV10_A265CliEnvDom = new String[] {""} ;
      P09LV10_A5531CliEnvNm2 = new String[] {""} ;
      P09LV10_A267CliEnvNom = new String[] {""} ;
      P09LV10_A266CliEnvLin = new byte[1] ;
      P09LV10_A252CliCod = new int[1] ;
      P09LV10_A723CliEnvTp = new short[1] ;
      P09LV10_A396EmprCod = new String[] {""} ;
      P09LV11_A689CliEnvAg = new String[] {""} ;
      P09LV11_A10052CliEnvFx = new String[] {""} ;
      P09LV11_A10051CliEnvMail = new String[] {""} ;
      P09LV11_A269CliEnvPrn = new String[] {""} ;
      P09LV11_n269CliEnvPrn = new boolean[] {false} ;
      P09LV11_A270CliEnvPrv = new short[1] ;
      P09LV11_A10775CliEnvCp2 = new String[] {""} ;
      P09LV11_A264CliEnvCp = new String[] {""} ;
      P09LV11_A268CliEnvPob = new String[] {""} ;
      P09LV11_A5530CliEnvDm2 = new String[] {""} ;
      P09LV11_A265CliEnvDom = new String[] {""} ;
      P09LV11_A5531CliEnvNm2 = new String[] {""} ;
      P09LV11_A267CliEnvNom = new String[] {""} ;
      P09LV11_A266CliEnvLin = new byte[1] ;
      P09LV11_A252CliCod = new int[1] ;
      P09LV11_A723CliEnvTp = new short[1] ;
      P09LV11_A396EmprCod = new String[] {""} ;
      P09LV12_A10052CliEnvFx = new String[] {""} ;
      P09LV12_A10051CliEnvMail = new String[] {""} ;
      P09LV12_A689CliEnvAg = new String[] {""} ;
      P09LV12_A269CliEnvPrn = new String[] {""} ;
      P09LV12_n269CliEnvPrn = new boolean[] {false} ;
      P09LV12_A270CliEnvPrv = new short[1] ;
      P09LV12_A10775CliEnvCp2 = new String[] {""} ;
      P09LV12_A264CliEnvCp = new String[] {""} ;
      P09LV12_A268CliEnvPob = new String[] {""} ;
      P09LV12_A5530CliEnvDm2 = new String[] {""} ;
      P09LV12_A265CliEnvDom = new String[] {""} ;
      P09LV12_A5531CliEnvNm2 = new String[] {""} ;
      P09LV12_A267CliEnvNom = new String[] {""} ;
      P09LV12_A266CliEnvLin = new byte[1] ;
      P09LV12_A252CliCod = new int[1] ;
      P09LV12_A723CliEnvTp = new short[1] ;
      P09LV12_A396EmprCod = new String[] {""} ;
      P09LV13_A10051CliEnvMail = new String[] {""} ;
      P09LV13_A10052CliEnvFx = new String[] {""} ;
      P09LV13_A689CliEnvAg = new String[] {""} ;
      P09LV13_A269CliEnvPrn = new String[] {""} ;
      P09LV13_n269CliEnvPrn = new boolean[] {false} ;
      P09LV13_A270CliEnvPrv = new short[1] ;
      P09LV13_A10775CliEnvCp2 = new String[] {""} ;
      P09LV13_A264CliEnvCp = new String[] {""} ;
      P09LV13_A268CliEnvPob = new String[] {""} ;
      P09LV13_A5530CliEnvDm2 = new String[] {""} ;
      P09LV13_A265CliEnvDom = new String[] {""} ;
      P09LV13_A5531CliEnvNm2 = new String[] {""} ;
      P09LV13_A267CliEnvNom = new String[] {""} ;
      P09LV13_A266CliEnvLin = new byte[1] ;
      P09LV13_A252CliCod = new int[1] ;
      P09LV13_A723CliEnvTp = new short[1] ;
      P09LV13_A396EmprCod = new String[] {""} ;
      P09LV14_A10052CliEnvFx = new String[] {""} ;
      P09LV14_A10051CliEnvMail = new String[] {""} ;
      P09LV14_A689CliEnvAg = new String[] {""} ;
      P09LV14_A269CliEnvPrn = new String[] {""} ;
      P09LV14_n269CliEnvPrn = new boolean[] {false} ;
      P09LV14_A270CliEnvPrv = new short[1] ;
      P09LV14_A10775CliEnvCp2 = new String[] {""} ;
      P09LV14_A264CliEnvCp = new String[] {""} ;
      P09LV14_A268CliEnvPob = new String[] {""} ;
      P09LV14_A5530CliEnvDm2 = new String[] {""} ;
      P09LV14_A265CliEnvDom = new String[] {""} ;
      P09LV14_A5531CliEnvNm2 = new String[] {""} ;
      P09LV14_A267CliEnvNom = new String[] {""} ;
      P09LV14_A266CliEnvLin = new byte[1] ;
      P09LV14_A252CliCod = new int[1] ;
      P09LV14_A723CliEnvTp = new short[1] ;
      P09LV14_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.clienvwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LV2_A10052CliEnvFx, P09LV2_A10051CliEnvMail, P09LV2_A689CliEnvAg, P09LV2_A269CliEnvPrn, P09LV2_n269CliEnvPrn, P09LV2_A270CliEnvPrv, P09LV2_A10775CliEnvCp2, P09LV2_A264CliEnvCp, P09LV2_A268CliEnvPob, P09LV2_A5530CliEnvDm2,
            P09LV2_A265CliEnvDom, P09LV2_A5531CliEnvNm2, P09LV2_A267CliEnvNom, P09LV2_A266CliEnvLin, P09LV2_A252CliCod, P09LV2_A723CliEnvTp, P09LV2_A396EmprCod
            }
            , new Object[] {
            P09LV3_A267CliEnvNom, P09LV3_A10052CliEnvFx, P09LV3_A10051CliEnvMail, P09LV3_A689CliEnvAg, P09LV3_A269CliEnvPrn, P09LV3_n269CliEnvPrn, P09LV3_A270CliEnvPrv, P09LV3_A10775CliEnvCp2, P09LV3_A264CliEnvCp, P09LV3_A268CliEnvPob,
            P09LV3_A5530CliEnvDm2, P09LV3_A265CliEnvDom, P09LV3_A5531CliEnvNm2, P09LV3_A266CliEnvLin, P09LV3_A252CliCod, P09LV3_A723CliEnvTp, P09LV3_A396EmprCod
            }
            , new Object[] {
            P09LV4_A5531CliEnvNm2, P09LV4_A10052CliEnvFx, P09LV4_A10051CliEnvMail, P09LV4_A689CliEnvAg, P09LV4_A269CliEnvPrn, P09LV4_n269CliEnvPrn, P09LV4_A270CliEnvPrv, P09LV4_A10775CliEnvCp2, P09LV4_A264CliEnvCp, P09LV4_A268CliEnvPob,
            P09LV4_A5530CliEnvDm2, P09LV4_A265CliEnvDom, P09LV4_A267CliEnvNom, P09LV4_A266CliEnvLin, P09LV4_A252CliCod, P09LV4_A723CliEnvTp, P09LV4_A396EmprCod
            }
            , new Object[] {
            P09LV5_A265CliEnvDom, P09LV5_A10052CliEnvFx, P09LV5_A10051CliEnvMail, P09LV5_A689CliEnvAg, P09LV5_A269CliEnvPrn, P09LV5_n269CliEnvPrn, P09LV5_A270CliEnvPrv, P09LV5_A10775CliEnvCp2, P09LV5_A264CliEnvCp, P09LV5_A268CliEnvPob,
            P09LV5_A5530CliEnvDm2, P09LV5_A5531CliEnvNm2, P09LV5_A267CliEnvNom, P09LV5_A266CliEnvLin, P09LV5_A252CliCod, P09LV5_A723CliEnvTp, P09LV5_A396EmprCod
            }
            , new Object[] {
            P09LV6_A5530CliEnvDm2, P09LV6_A10052CliEnvFx, P09LV6_A10051CliEnvMail, P09LV6_A689CliEnvAg, P09LV6_A269CliEnvPrn, P09LV6_n269CliEnvPrn, P09LV6_A270CliEnvPrv, P09LV6_A10775CliEnvCp2, P09LV6_A264CliEnvCp, P09LV6_A268CliEnvPob,
            P09LV6_A265CliEnvDom, P09LV6_A5531CliEnvNm2, P09LV6_A267CliEnvNom, P09LV6_A266CliEnvLin, P09LV6_A252CliCod, P09LV6_A723CliEnvTp, P09LV6_A396EmprCod
            }
            , new Object[] {
            P09LV7_A268CliEnvPob, P09LV7_A10052CliEnvFx, P09LV7_A10051CliEnvMail, P09LV7_A689CliEnvAg, P09LV7_A269CliEnvPrn, P09LV7_n269CliEnvPrn, P09LV7_A270CliEnvPrv, P09LV7_A10775CliEnvCp2, P09LV7_A264CliEnvCp, P09LV7_A5530CliEnvDm2,
            P09LV7_A265CliEnvDom, P09LV7_A5531CliEnvNm2, P09LV7_A267CliEnvNom, P09LV7_A266CliEnvLin, P09LV7_A252CliCod, P09LV7_A723CliEnvTp, P09LV7_A396EmprCod
            }
            , new Object[] {
            P09LV8_A264CliEnvCp, P09LV8_A10052CliEnvFx, P09LV8_A10051CliEnvMail, P09LV8_A689CliEnvAg, P09LV8_A269CliEnvPrn, P09LV8_n269CliEnvPrn, P09LV8_A270CliEnvPrv, P09LV8_A10775CliEnvCp2, P09LV8_A268CliEnvPob, P09LV8_A5530CliEnvDm2,
            P09LV8_A265CliEnvDom, P09LV8_A5531CliEnvNm2, P09LV8_A267CliEnvNom, P09LV8_A266CliEnvLin, P09LV8_A252CliCod, P09LV8_A723CliEnvTp, P09LV8_A396EmprCod
            }
            , new Object[] {
            P09LV9_A10775CliEnvCp2, P09LV9_A10052CliEnvFx, P09LV9_A10051CliEnvMail, P09LV9_A689CliEnvAg, P09LV9_A269CliEnvPrn, P09LV9_n269CliEnvPrn, P09LV9_A270CliEnvPrv, P09LV9_A264CliEnvCp, P09LV9_A268CliEnvPob, P09LV9_A5530CliEnvDm2,
            P09LV9_A265CliEnvDom, P09LV9_A5531CliEnvNm2, P09LV9_A267CliEnvNom, P09LV9_A266CliEnvLin, P09LV9_A252CliCod, P09LV9_A723CliEnvTp, P09LV9_A396EmprCod
            }
            , new Object[] {
            P09LV10_A270CliEnvPrv, P09LV10_A10052CliEnvFx, P09LV10_A10051CliEnvMail, P09LV10_A689CliEnvAg, P09LV10_A269CliEnvPrn, P09LV10_n269CliEnvPrn, P09LV10_A10775CliEnvCp2, P09LV10_A264CliEnvCp, P09LV10_A268CliEnvPob, P09LV10_A5530CliEnvDm2,
            P09LV10_A265CliEnvDom, P09LV10_A5531CliEnvNm2, P09LV10_A267CliEnvNom, P09LV10_A266CliEnvLin, P09LV10_A252CliCod, P09LV10_A723CliEnvTp, P09LV10_A396EmprCod
            }
            , new Object[] {
            P09LV11_A689CliEnvAg, P09LV11_A10052CliEnvFx, P09LV11_A10051CliEnvMail, P09LV11_A269CliEnvPrn, P09LV11_n269CliEnvPrn, P09LV11_A270CliEnvPrv, P09LV11_A10775CliEnvCp2, P09LV11_A264CliEnvCp, P09LV11_A268CliEnvPob, P09LV11_A5530CliEnvDm2,
            P09LV11_A265CliEnvDom, P09LV11_A5531CliEnvNm2, P09LV11_A267CliEnvNom, P09LV11_A266CliEnvLin, P09LV11_A252CliCod, P09LV11_A723CliEnvTp, P09LV11_A396EmprCod
            }
            , new Object[] {
            P09LV12_A10052CliEnvFx, P09LV12_A10051CliEnvMail, P09LV12_A689CliEnvAg, P09LV12_A269CliEnvPrn, P09LV12_n269CliEnvPrn, P09LV12_A270CliEnvPrv, P09LV12_A10775CliEnvCp2, P09LV12_A264CliEnvCp, P09LV12_A268CliEnvPob, P09LV12_A5530CliEnvDm2,
            P09LV12_A265CliEnvDom, P09LV12_A5531CliEnvNm2, P09LV12_A267CliEnvNom, P09LV12_A266CliEnvLin, P09LV12_A252CliCod, P09LV12_A723CliEnvTp, P09LV12_A396EmprCod
            }
            , new Object[] {
            P09LV13_A10051CliEnvMail, P09LV13_A10052CliEnvFx, P09LV13_A689CliEnvAg, P09LV13_A269CliEnvPrn, P09LV13_n269CliEnvPrn, P09LV13_A270CliEnvPrv, P09LV13_A10775CliEnvCp2, P09LV13_A264CliEnvCp, P09LV13_A268CliEnvPob, P09LV13_A5530CliEnvDm2,
            P09LV13_A265CliEnvDom, P09LV13_A5531CliEnvNm2, P09LV13_A267CliEnvNom, P09LV13_A266CliEnvLin, P09LV13_A252CliCod, P09LV13_A723CliEnvTp, P09LV13_A396EmprCod
            }
            , new Object[] {
            P09LV14_A10052CliEnvFx, P09LV14_A10051CliEnvMail, P09LV14_A689CliEnvAg, P09LV14_A269CliEnvPrn, P09LV14_n269CliEnvPrn, P09LV14_A270CliEnvPrv, P09LV14_A10775CliEnvCp2, P09LV14_A264CliEnvCp, P09LV14_A268CliEnvPob, P09LV14_A5530CliEnvDm2,
            P09LV14_A265CliEnvDom, P09LV14_A5531CliEnvNm2, P09LV14_A267CliEnvNom, P09LV14_A266CliEnvLin, P09LV14_A252CliCod, P09LV14_A723CliEnvTp, P09LV14_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFCliEnvLin ;
   private byte AV15TFCliEnvLin_To ;
   private byte A266CliEnvLin ;
   private short AV30TFCliEnvPrv ;
   private short AV31TFCliEnvPrv_To ;
   private short AV36TFCliEnvTp ;
   private short AV37TFCliEnvTp_To ;
   private short A270CliEnvPrv ;
   private short A723CliEnvTp ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int A252CliCod ;
   private int AV47InsertIndex ;
   private long AV56count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV16TFCliEnvNom ;
   private String AV17TFCliEnvNom_Sel ;
   private String AV18TFCliEnvNm2 ;
   private String AV19TFCliEnvNm2_Sel ;
   private String AV20TFCliEnvDom ;
   private String AV21TFCliEnvDom_Sel ;
   private String AV22TFCliEnvDm2 ;
   private String AV23TFCliEnvDm2_Sel ;
   private String AV24TFCliEnvPob ;
   private String AV25TFCliEnvPob_Sel ;
   private String AV26TFCliEnvCp ;
   private String AV27TFCliEnvCp_Sel ;
   private String AV28TFCliEnvCp2 ;
   private String AV29TFCliEnvCp2_Sel ;
   private String AV32TFCliEnvPrn ;
   private String AV33TFCliEnvPrn_Sel ;
   private String AV34TFCliEnvAg ;
   private String AV35TFCliEnvAg_Sel ;
   private String AV38TFCliEnvNmt ;
   private String AV39TFCliEnvNmt_Sel ;
   private String AV40TFCliEnvMail ;
   private String AV41TFCliEnvMail_Sel ;
   private String AV42TFCliEnvFx ;
   private String AV43TFCliEnvFx_Sel ;
   private String scmdbuf ;
   private String lV10TFEmprCod ;
   private String lV16TFCliEnvNom ;
   private String lV18TFCliEnvNm2 ;
   private String lV20TFCliEnvDom ;
   private String lV22TFCliEnvDm2 ;
   private String lV24TFCliEnvPob ;
   private String lV26TFCliEnvCp ;
   private String lV28TFCliEnvCp2 ;
   private String lV32TFCliEnvPrn ;
   private String lV34TFCliEnvAg ;
   private String lV40TFCliEnvMail ;
   private String lV42TFCliEnvFx ;
   private String A396EmprCod ;
   private String A267CliEnvNom ;
   private String A5531CliEnvNm2 ;
   private String A265CliEnvDom ;
   private String A5530CliEnvDm2 ;
   private String A268CliEnvPob ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A269CliEnvPrn ;
   private String A689CliEnvAg ;
   private String A10051CliEnvMail ;
   private String A10052CliEnvFx ;
   private String A693CliEnvNmt ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brk9LV2 ;
   private boolean n269CliEnvPrn ;
   private boolean brk9LV4 ;
   private boolean brk9LV6 ;
   private boolean brk9LV8 ;
   private boolean brk9LV10 ;
   private boolean brk9LV12 ;
   private boolean brk9LV14 ;
   private boolean brk9LV16 ;
   private boolean brk9LV18 ;
   private boolean brk9LV20 ;
   private boolean brk9LV23 ;
   private boolean brk9LV25 ;
   private String AV50OptionsJson ;
   private String AV53OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV46DDOName ;
   private String AV44SearchTxt ;
   private String AV45SearchTxtTo ;
   private String AV62FilterFullText ;
   private String lV62FilterFullText ;
   private String AV48Option ;
   private String AV51OptionDesc ;
   private com.genexus.webpanels.WebSession AV57Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LV2_A10052CliEnvFx ;
   private String[] P09LV2_A10051CliEnvMail ;
   private String[] P09LV2_A689CliEnvAg ;
   private String[] P09LV2_A269CliEnvPrn ;
   private boolean[] P09LV2_n269CliEnvPrn ;
   private short[] P09LV2_A270CliEnvPrv ;
   private String[] P09LV2_A10775CliEnvCp2 ;
   private String[] P09LV2_A264CliEnvCp ;
   private String[] P09LV2_A268CliEnvPob ;
   private String[] P09LV2_A5530CliEnvDm2 ;
   private String[] P09LV2_A265CliEnvDom ;
   private String[] P09LV2_A5531CliEnvNm2 ;
   private String[] P09LV2_A267CliEnvNom ;
   private byte[] P09LV2_A266CliEnvLin ;
   private int[] P09LV2_A252CliCod ;
   private short[] P09LV2_A723CliEnvTp ;
   private String[] P09LV2_A396EmprCod ;
   private String[] P09LV3_A267CliEnvNom ;
   private String[] P09LV3_A10052CliEnvFx ;
   private String[] P09LV3_A10051CliEnvMail ;
   private String[] P09LV3_A689CliEnvAg ;
   private String[] P09LV3_A269CliEnvPrn ;
   private boolean[] P09LV3_n269CliEnvPrn ;
   private short[] P09LV3_A270CliEnvPrv ;
   private String[] P09LV3_A10775CliEnvCp2 ;
   private String[] P09LV3_A264CliEnvCp ;
   private String[] P09LV3_A268CliEnvPob ;
   private String[] P09LV3_A5530CliEnvDm2 ;
   private String[] P09LV3_A265CliEnvDom ;
   private String[] P09LV3_A5531CliEnvNm2 ;
   private byte[] P09LV3_A266CliEnvLin ;
   private int[] P09LV3_A252CliCod ;
   private short[] P09LV3_A723CliEnvTp ;
   private String[] P09LV3_A396EmprCod ;
   private String[] P09LV4_A5531CliEnvNm2 ;
   private String[] P09LV4_A10052CliEnvFx ;
   private String[] P09LV4_A10051CliEnvMail ;
   private String[] P09LV4_A689CliEnvAg ;
   private String[] P09LV4_A269CliEnvPrn ;
   private boolean[] P09LV4_n269CliEnvPrn ;
   private short[] P09LV4_A270CliEnvPrv ;
   private String[] P09LV4_A10775CliEnvCp2 ;
   private String[] P09LV4_A264CliEnvCp ;
   private String[] P09LV4_A268CliEnvPob ;
   private String[] P09LV4_A5530CliEnvDm2 ;
   private String[] P09LV4_A265CliEnvDom ;
   private String[] P09LV4_A267CliEnvNom ;
   private byte[] P09LV4_A266CliEnvLin ;
   private int[] P09LV4_A252CliCod ;
   private short[] P09LV4_A723CliEnvTp ;
   private String[] P09LV4_A396EmprCod ;
   private String[] P09LV5_A265CliEnvDom ;
   private String[] P09LV5_A10052CliEnvFx ;
   private String[] P09LV5_A10051CliEnvMail ;
   private String[] P09LV5_A689CliEnvAg ;
   private String[] P09LV5_A269CliEnvPrn ;
   private boolean[] P09LV5_n269CliEnvPrn ;
   private short[] P09LV5_A270CliEnvPrv ;
   private String[] P09LV5_A10775CliEnvCp2 ;
   private String[] P09LV5_A264CliEnvCp ;
   private String[] P09LV5_A268CliEnvPob ;
   private String[] P09LV5_A5530CliEnvDm2 ;
   private String[] P09LV5_A5531CliEnvNm2 ;
   private String[] P09LV5_A267CliEnvNom ;
   private byte[] P09LV5_A266CliEnvLin ;
   private int[] P09LV5_A252CliCod ;
   private short[] P09LV5_A723CliEnvTp ;
   private String[] P09LV5_A396EmprCod ;
   private String[] P09LV6_A5530CliEnvDm2 ;
   private String[] P09LV6_A10052CliEnvFx ;
   private String[] P09LV6_A10051CliEnvMail ;
   private String[] P09LV6_A689CliEnvAg ;
   private String[] P09LV6_A269CliEnvPrn ;
   private boolean[] P09LV6_n269CliEnvPrn ;
   private short[] P09LV6_A270CliEnvPrv ;
   private String[] P09LV6_A10775CliEnvCp2 ;
   private String[] P09LV6_A264CliEnvCp ;
   private String[] P09LV6_A268CliEnvPob ;
   private String[] P09LV6_A265CliEnvDom ;
   private String[] P09LV6_A5531CliEnvNm2 ;
   private String[] P09LV6_A267CliEnvNom ;
   private byte[] P09LV6_A266CliEnvLin ;
   private int[] P09LV6_A252CliCod ;
   private short[] P09LV6_A723CliEnvTp ;
   private String[] P09LV6_A396EmprCod ;
   private String[] P09LV7_A268CliEnvPob ;
   private String[] P09LV7_A10052CliEnvFx ;
   private String[] P09LV7_A10051CliEnvMail ;
   private String[] P09LV7_A689CliEnvAg ;
   private String[] P09LV7_A269CliEnvPrn ;
   private boolean[] P09LV7_n269CliEnvPrn ;
   private short[] P09LV7_A270CliEnvPrv ;
   private String[] P09LV7_A10775CliEnvCp2 ;
   private String[] P09LV7_A264CliEnvCp ;
   private String[] P09LV7_A5530CliEnvDm2 ;
   private String[] P09LV7_A265CliEnvDom ;
   private String[] P09LV7_A5531CliEnvNm2 ;
   private String[] P09LV7_A267CliEnvNom ;
   private byte[] P09LV7_A266CliEnvLin ;
   private int[] P09LV7_A252CliCod ;
   private short[] P09LV7_A723CliEnvTp ;
   private String[] P09LV7_A396EmprCod ;
   private String[] P09LV8_A264CliEnvCp ;
   private String[] P09LV8_A10052CliEnvFx ;
   private String[] P09LV8_A10051CliEnvMail ;
   private String[] P09LV8_A689CliEnvAg ;
   private String[] P09LV8_A269CliEnvPrn ;
   private boolean[] P09LV8_n269CliEnvPrn ;
   private short[] P09LV8_A270CliEnvPrv ;
   private String[] P09LV8_A10775CliEnvCp2 ;
   private String[] P09LV8_A268CliEnvPob ;
   private String[] P09LV8_A5530CliEnvDm2 ;
   private String[] P09LV8_A265CliEnvDom ;
   private String[] P09LV8_A5531CliEnvNm2 ;
   private String[] P09LV8_A267CliEnvNom ;
   private byte[] P09LV8_A266CliEnvLin ;
   private int[] P09LV8_A252CliCod ;
   private short[] P09LV8_A723CliEnvTp ;
   private String[] P09LV8_A396EmprCod ;
   private String[] P09LV9_A10775CliEnvCp2 ;
   private String[] P09LV9_A10052CliEnvFx ;
   private String[] P09LV9_A10051CliEnvMail ;
   private String[] P09LV9_A689CliEnvAg ;
   private String[] P09LV9_A269CliEnvPrn ;
   private boolean[] P09LV9_n269CliEnvPrn ;
   private short[] P09LV9_A270CliEnvPrv ;
   private String[] P09LV9_A264CliEnvCp ;
   private String[] P09LV9_A268CliEnvPob ;
   private String[] P09LV9_A5530CliEnvDm2 ;
   private String[] P09LV9_A265CliEnvDom ;
   private String[] P09LV9_A5531CliEnvNm2 ;
   private String[] P09LV9_A267CliEnvNom ;
   private byte[] P09LV9_A266CliEnvLin ;
   private int[] P09LV9_A252CliCod ;
   private short[] P09LV9_A723CliEnvTp ;
   private String[] P09LV9_A396EmprCod ;
   private short[] P09LV10_A270CliEnvPrv ;
   private String[] P09LV10_A10052CliEnvFx ;
   private String[] P09LV10_A10051CliEnvMail ;
   private String[] P09LV10_A689CliEnvAg ;
   private String[] P09LV10_A269CliEnvPrn ;
   private boolean[] P09LV10_n269CliEnvPrn ;
   private String[] P09LV10_A10775CliEnvCp2 ;
   private String[] P09LV10_A264CliEnvCp ;
   private String[] P09LV10_A268CliEnvPob ;
   private String[] P09LV10_A5530CliEnvDm2 ;
   private String[] P09LV10_A265CliEnvDom ;
   private String[] P09LV10_A5531CliEnvNm2 ;
   private String[] P09LV10_A267CliEnvNom ;
   private byte[] P09LV10_A266CliEnvLin ;
   private int[] P09LV10_A252CliCod ;
   private short[] P09LV10_A723CliEnvTp ;
   private String[] P09LV10_A396EmprCod ;
   private String[] P09LV11_A689CliEnvAg ;
   private String[] P09LV11_A10052CliEnvFx ;
   private String[] P09LV11_A10051CliEnvMail ;
   private String[] P09LV11_A269CliEnvPrn ;
   private boolean[] P09LV11_n269CliEnvPrn ;
   private short[] P09LV11_A270CliEnvPrv ;
   private String[] P09LV11_A10775CliEnvCp2 ;
   private String[] P09LV11_A264CliEnvCp ;
   private String[] P09LV11_A268CliEnvPob ;
   private String[] P09LV11_A5530CliEnvDm2 ;
   private String[] P09LV11_A265CliEnvDom ;
   private String[] P09LV11_A5531CliEnvNm2 ;
   private String[] P09LV11_A267CliEnvNom ;
   private byte[] P09LV11_A266CliEnvLin ;
   private int[] P09LV11_A252CliCod ;
   private short[] P09LV11_A723CliEnvTp ;
   private String[] P09LV11_A396EmprCod ;
   private String[] P09LV12_A10052CliEnvFx ;
   private String[] P09LV12_A10051CliEnvMail ;
   private String[] P09LV12_A689CliEnvAg ;
   private String[] P09LV12_A269CliEnvPrn ;
   private boolean[] P09LV12_n269CliEnvPrn ;
   private short[] P09LV12_A270CliEnvPrv ;
   private String[] P09LV12_A10775CliEnvCp2 ;
   private String[] P09LV12_A264CliEnvCp ;
   private String[] P09LV12_A268CliEnvPob ;
   private String[] P09LV12_A5530CliEnvDm2 ;
   private String[] P09LV12_A265CliEnvDom ;
   private String[] P09LV12_A5531CliEnvNm2 ;
   private String[] P09LV12_A267CliEnvNom ;
   private byte[] P09LV12_A266CliEnvLin ;
   private int[] P09LV12_A252CliCod ;
   private short[] P09LV12_A723CliEnvTp ;
   private String[] P09LV12_A396EmprCod ;
   private String[] P09LV13_A10051CliEnvMail ;
   private String[] P09LV13_A10052CliEnvFx ;
   private String[] P09LV13_A689CliEnvAg ;
   private String[] P09LV13_A269CliEnvPrn ;
   private boolean[] P09LV13_n269CliEnvPrn ;
   private short[] P09LV13_A270CliEnvPrv ;
   private String[] P09LV13_A10775CliEnvCp2 ;
   private String[] P09LV13_A264CliEnvCp ;
   private String[] P09LV13_A268CliEnvPob ;
   private String[] P09LV13_A5530CliEnvDm2 ;
   private String[] P09LV13_A265CliEnvDom ;
   private String[] P09LV13_A5531CliEnvNm2 ;
   private String[] P09LV13_A267CliEnvNom ;
   private byte[] P09LV13_A266CliEnvLin ;
   private int[] P09LV13_A252CliCod ;
   private short[] P09LV13_A723CliEnvTp ;
   private String[] P09LV13_A396EmprCod ;
   private String[] P09LV14_A10052CliEnvFx ;
   private String[] P09LV14_A10051CliEnvMail ;
   private String[] P09LV14_A689CliEnvAg ;
   private String[] P09LV14_A269CliEnvPrn ;
   private boolean[] P09LV14_n269CliEnvPrn ;
   private short[] P09LV14_A270CliEnvPrv ;
   private String[] P09LV14_A10775CliEnvCp2 ;
   private String[] P09LV14_A264CliEnvCp ;
   private String[] P09LV14_A268CliEnvPob ;
   private String[] P09LV14_A5530CliEnvDm2 ;
   private String[] P09LV14_A265CliEnvDom ;
   private String[] P09LV14_A5531CliEnvNm2 ;
   private String[] P09LV14_A267CliEnvNom ;
   private byte[] P09LV14_A266CliEnvLin ;
   private int[] P09LV14_A252CliCod ;
   private short[] P09LV14_A723CliEnvTp ;
   private String[] P09LV14_A396EmprCod ;
   private GXSimpleCollection<String> AV49Options ;
   private GXSimpleCollection<String> AV52OptionsDesc ;
   private GXSimpleCollection<String> AV54OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV59GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV60GridStateFilterValue ;
}

final  class clienvwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09LV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvNom, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2," ;
      scmdbuf += " T1.CliEnvDom, T1.CliEnvNm2, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09LV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[32];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvNm2, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2," ;
      scmdbuf += " T1.CliEnvDom, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvNm2" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09LV5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[32];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvDom, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvDom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09LV6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[32];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvDm2, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvDm2" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09LV7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[32];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvPob, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvPob" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P09LV8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[32];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvCp, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvCp" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P09LV9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          int AV12TFCliCod ,
                                          int AV13TFCliCod_To ,
                                          byte AV14TFCliEnvLin ,
                                          byte AV15TFCliEnvLin_To ,
                                          String AV17TFCliEnvNom_Sel ,
                                          String AV16TFCliEnvNom ,
                                          String AV19TFCliEnvNm2_Sel ,
                                          String AV18TFCliEnvNm2 ,
                                          String AV21TFCliEnvDom_Sel ,
                                          String AV20TFCliEnvDom ,
                                          String AV23TFCliEnvDm2_Sel ,
                                          String AV22TFCliEnvDm2 ,
                                          String AV25TFCliEnvPob_Sel ,
                                          String AV24TFCliEnvPob ,
                                          String AV27TFCliEnvCp_Sel ,
                                          String AV26TFCliEnvCp ,
                                          String AV29TFCliEnvCp2_Sel ,
                                          String AV28TFCliEnvCp2 ,
                                          short AV30TFCliEnvPrv ,
                                          short AV31TFCliEnvPrv_To ,
                                          String AV33TFCliEnvPrn_Sel ,
                                          String AV32TFCliEnvPrn ,
                                          String AV35TFCliEnvAg_Sel ,
                                          String AV34TFCliEnvAg ,
                                          short AV36TFCliEnvTp ,
                                          short AV37TFCliEnvTp_To ,
                                          String AV41TFCliEnvMail_Sel ,
                                          String AV40TFCliEnvMail ,
                                          String AV43TFCliEnvFx_Sel ,
                                          String AV42TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          String AV62FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV39TFCliEnvNmt_Sel ,
                                          String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[32];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvCp2, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvCp2" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09LV10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV11TFEmprCod_Sel ,
                                           String AV10TFEmprCod ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           byte AV14TFCliEnvLin ,
                                           byte AV15TFCliEnvLin_To ,
                                           String AV17TFCliEnvNom_Sel ,
                                           String AV16TFCliEnvNom ,
                                           String AV19TFCliEnvNm2_Sel ,
                                           String AV18TFCliEnvNm2 ,
                                           String AV21TFCliEnvDom_Sel ,
                                           String AV20TFCliEnvDom ,
                                           String AV23TFCliEnvDm2_Sel ,
                                           String AV22TFCliEnvDm2 ,
                                           String AV25TFCliEnvPob_Sel ,
                                           String AV24TFCliEnvPob ,
                                           String AV27TFCliEnvCp_Sel ,
                                           String AV26TFCliEnvCp ,
                                           String AV29TFCliEnvCp2_Sel ,
                                           String AV28TFCliEnvCp2 ,
                                           short AV30TFCliEnvPrv ,
                                           short AV31TFCliEnvPrv_To ,
                                           String AV33TFCliEnvPrn_Sel ,
                                           String AV32TFCliEnvPrn ,
                                           String AV35TFCliEnvAg_Sel ,
                                           String AV34TFCliEnvAg ,
                                           short AV36TFCliEnvTp ,
                                           short AV37TFCliEnvTp_To ,
                                           String AV41TFCliEnvMail_Sel ,
                                           String AV40TFCliEnvMail ,
                                           String AV43TFCliEnvFx_Sel ,
                                           String AV42TFCliEnvFx ,
                                           String A396EmprCod ,
                                           int A252CliCod ,
                                           byte A266CliEnvLin ,
                                           String A267CliEnvNom ,
                                           String A5531CliEnvNm2 ,
                                           String A265CliEnvDom ,
                                           String A5530CliEnvDm2 ,
                                           String A268CliEnvPob ,
                                           String A264CliEnvCp ,
                                           String A10775CliEnvCp2 ,
                                           short A270CliEnvPrv ,
                                           String A269CliEnvPrn ,
                                           String A689CliEnvAg ,
                                           short A723CliEnvTp ,
                                           String A10051CliEnvMail ,
                                           String A10052CliEnvFx ,
                                           String AV62FilterFullText ,
                                           String A693CliEnvNmt ,
                                           String AV39TFCliEnvNmt_Sel ,
                                           String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[32];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvPrv" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P09LV11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV11TFEmprCod_Sel ,
                                           String AV10TFEmprCod ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           byte AV14TFCliEnvLin ,
                                           byte AV15TFCliEnvLin_To ,
                                           String AV17TFCliEnvNom_Sel ,
                                           String AV16TFCliEnvNom ,
                                           String AV19TFCliEnvNm2_Sel ,
                                           String AV18TFCliEnvNm2 ,
                                           String AV21TFCliEnvDom_Sel ,
                                           String AV20TFCliEnvDom ,
                                           String AV23TFCliEnvDm2_Sel ,
                                           String AV22TFCliEnvDm2 ,
                                           String AV25TFCliEnvPob_Sel ,
                                           String AV24TFCliEnvPob ,
                                           String AV27TFCliEnvCp_Sel ,
                                           String AV26TFCliEnvCp ,
                                           String AV29TFCliEnvCp2_Sel ,
                                           String AV28TFCliEnvCp2 ,
                                           short AV30TFCliEnvPrv ,
                                           short AV31TFCliEnvPrv_To ,
                                           String AV33TFCliEnvPrn_Sel ,
                                           String AV32TFCliEnvPrn ,
                                           String AV35TFCliEnvAg_Sel ,
                                           String AV34TFCliEnvAg ,
                                           short AV36TFCliEnvTp ,
                                           short AV37TFCliEnvTp_To ,
                                           String AV41TFCliEnvMail_Sel ,
                                           String AV40TFCliEnvMail ,
                                           String AV43TFCliEnvFx_Sel ,
                                           String AV42TFCliEnvFx ,
                                           String A396EmprCod ,
                                           int A252CliCod ,
                                           byte A266CliEnvLin ,
                                           String A267CliEnvNom ,
                                           String A5531CliEnvNm2 ,
                                           String A265CliEnvDom ,
                                           String A5530CliEnvDm2 ,
                                           String A268CliEnvPob ,
                                           String A264CliEnvCp ,
                                           String A10775CliEnvCp2 ,
                                           short A270CliEnvPrv ,
                                           String A269CliEnvPrn ,
                                           String A689CliEnvAg ,
                                           short A723CliEnvTp ,
                                           String A10051CliEnvMail ,
                                           String A10052CliEnvFx ,
                                           String AV62FilterFullText ,
                                           String A693CliEnvNmt ,
                                           String AV39TFCliEnvNmt_Sel ,
                                           String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[32];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvAg, T1.CliEnvFx, T1.CliEnvMail, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvAg" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_P09LV12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV11TFEmprCod_Sel ,
                                           String AV10TFEmprCod ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           byte AV14TFCliEnvLin ,
                                           byte AV15TFCliEnvLin_To ,
                                           String AV17TFCliEnvNom_Sel ,
                                           String AV16TFCliEnvNom ,
                                           String AV19TFCliEnvNm2_Sel ,
                                           String AV18TFCliEnvNm2 ,
                                           String AV21TFCliEnvDom_Sel ,
                                           String AV20TFCliEnvDom ,
                                           String AV23TFCliEnvDm2_Sel ,
                                           String AV22TFCliEnvDm2 ,
                                           String AV25TFCliEnvPob_Sel ,
                                           String AV24TFCliEnvPob ,
                                           String AV27TFCliEnvCp_Sel ,
                                           String AV26TFCliEnvCp ,
                                           String AV29TFCliEnvCp2_Sel ,
                                           String AV28TFCliEnvCp2 ,
                                           short AV30TFCliEnvPrv ,
                                           short AV31TFCliEnvPrv_To ,
                                           String AV33TFCliEnvPrn_Sel ,
                                           String AV32TFCliEnvPrn ,
                                           String AV35TFCliEnvAg_Sel ,
                                           String AV34TFCliEnvAg ,
                                           short AV36TFCliEnvTp ,
                                           short AV37TFCliEnvTp_To ,
                                           String AV41TFCliEnvMail_Sel ,
                                           String AV40TFCliEnvMail ,
                                           String AV43TFCliEnvFx_Sel ,
                                           String AV42TFCliEnvFx ,
                                           String A396EmprCod ,
                                           int A252CliCod ,
                                           byte A266CliEnvLin ,
                                           String A267CliEnvNom ,
                                           String A5531CliEnvNm2 ,
                                           String A265CliEnvDom ,
                                           String A5530CliEnvDm2 ,
                                           String A268CliEnvPob ,
                                           String A264CliEnvCp ,
                                           String A10775CliEnvCp2 ,
                                           short A270CliEnvPrv ,
                                           String A269CliEnvPrn ,
                                           String A689CliEnvAg ,
                                           short A723CliEnvTp ,
                                           String A10051CliEnvMail ,
                                           String A10052CliEnvFx ,
                                           String AV62FilterFullText ,
                                           String A693CliEnvNmt ,
                                           String AV39TFCliEnvNmt_Sel ,
                                           String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[32];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.CliEnvLin" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P09LV13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV11TFEmprCod_Sel ,
                                           String AV10TFEmprCod ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           byte AV14TFCliEnvLin ,
                                           byte AV15TFCliEnvLin_To ,
                                           String AV17TFCliEnvNom_Sel ,
                                           String AV16TFCliEnvNom ,
                                           String AV19TFCliEnvNm2_Sel ,
                                           String AV18TFCliEnvNm2 ,
                                           String AV21TFCliEnvDom_Sel ,
                                           String AV20TFCliEnvDom ,
                                           String AV23TFCliEnvDm2_Sel ,
                                           String AV22TFCliEnvDm2 ,
                                           String AV25TFCliEnvPob_Sel ,
                                           String AV24TFCliEnvPob ,
                                           String AV27TFCliEnvCp_Sel ,
                                           String AV26TFCliEnvCp ,
                                           String AV29TFCliEnvCp2_Sel ,
                                           String AV28TFCliEnvCp2 ,
                                           short AV30TFCliEnvPrv ,
                                           short AV31TFCliEnvPrv_To ,
                                           String AV33TFCliEnvPrn_Sel ,
                                           String AV32TFCliEnvPrn ,
                                           String AV35TFCliEnvAg_Sel ,
                                           String AV34TFCliEnvAg ,
                                           short AV36TFCliEnvTp ,
                                           short AV37TFCliEnvTp_To ,
                                           String AV41TFCliEnvMail_Sel ,
                                           String AV40TFCliEnvMail ,
                                           String AV43TFCliEnvFx_Sel ,
                                           String AV42TFCliEnvFx ,
                                           String A396EmprCod ,
                                           int A252CliCod ,
                                           byte A266CliEnvLin ,
                                           String A267CliEnvNom ,
                                           String A5531CliEnvNm2 ,
                                           String A265CliEnvDom ,
                                           String A5530CliEnvDm2 ,
                                           String A268CliEnvPob ,
                                           String A264CliEnvCp ,
                                           String A10775CliEnvCp2 ,
                                           short A270CliEnvPrv ,
                                           String A269CliEnvPrn ,
                                           String A689CliEnvAg ,
                                           short A723CliEnvTp ,
                                           String A10051CliEnvMail ,
                                           String A10052CliEnvFx ,
                                           String AV62FilterFullText ,
                                           String A693CliEnvNmt ,
                                           String AV39TFCliEnvNmt_Sel ,
                                           String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[32];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvMail, T1.CliEnvFx, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int28[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvMail" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_P09LV14( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV11TFEmprCod_Sel ,
                                           String AV10TFEmprCod ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           byte AV14TFCliEnvLin ,
                                           byte AV15TFCliEnvLin_To ,
                                           String AV17TFCliEnvNom_Sel ,
                                           String AV16TFCliEnvNom ,
                                           String AV19TFCliEnvNm2_Sel ,
                                           String AV18TFCliEnvNm2 ,
                                           String AV21TFCliEnvDom_Sel ,
                                           String AV20TFCliEnvDom ,
                                           String AV23TFCliEnvDm2_Sel ,
                                           String AV22TFCliEnvDm2 ,
                                           String AV25TFCliEnvPob_Sel ,
                                           String AV24TFCliEnvPob ,
                                           String AV27TFCliEnvCp_Sel ,
                                           String AV26TFCliEnvCp ,
                                           String AV29TFCliEnvCp2_Sel ,
                                           String AV28TFCliEnvCp2 ,
                                           short AV30TFCliEnvPrv ,
                                           short AV31TFCliEnvPrv_To ,
                                           String AV33TFCliEnvPrn_Sel ,
                                           String AV32TFCliEnvPrn ,
                                           String AV35TFCliEnvAg_Sel ,
                                           String AV34TFCliEnvAg ,
                                           short AV36TFCliEnvTp ,
                                           short AV37TFCliEnvTp_To ,
                                           String AV41TFCliEnvMail_Sel ,
                                           String AV40TFCliEnvMail ,
                                           String AV43TFCliEnvFx_Sel ,
                                           String AV42TFCliEnvFx ,
                                           String A396EmprCod ,
                                           int A252CliCod ,
                                           byte A266CliEnvLin ,
                                           String A267CliEnvNom ,
                                           String A5531CliEnvNm2 ,
                                           String A265CliEnvDom ,
                                           String A5530CliEnvDm2 ,
                                           String A268CliEnvPob ,
                                           String A264CliEnvCp ,
                                           String A10775CliEnvCp2 ,
                                           short A270CliEnvPrv ,
                                           String A269CliEnvPrn ,
                                           String A689CliEnvAg ,
                                           short A723CliEnvTp ,
                                           String A10051CliEnvMail ,
                                           String A10052CliEnvFx ,
                                           String AV62FilterFullText ,
                                           String A693CliEnvNmt ,
                                           String AV39TFCliEnvNmt_Sel ,
                                           String AV38TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[32];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int30[1] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[2] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int30[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( ! (0==AV36TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliEnvFx" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_P09LV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 1 :
                  return conditional_P09LV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 2 :
                  return conditional_P09LV4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 3 :
                  return conditional_P09LV5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 4 :
                  return conditional_P09LV6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 5 :
                  return conditional_P09LV7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 6 :
                  return conditional_P09LV8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 7 :
                  return conditional_P09LV9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 8 :
                  return conditional_P09LV10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 9 :
                  return conditional_P09LV11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 10 :
                  return conditional_P09LV12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 11 :
                  return conditional_P09LV13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 12 :
                  return conditional_P09LV14(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LV14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 34);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 34);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 12 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
      }
   }

}

