package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaran__wwgetfilterdata extends GXProcedure
{
   public albaran__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaran__wwgetfilterdata.class ), "" );
   }

   public albaran__wwgetfilterdata( int remoteHandle ,
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
      albaran__wwgetfilterdata.this.aP5 = new String[] {""};
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
      albaran__wwgetfilterdata.this.AV40DDOName = aP0;
      albaran__wwgetfilterdata.this.AV41SearchTxt = aP1;
      albaran__wwgetfilterdata.this.AV42SearchTxtTo = aP2;
      albaran__wwgetfilterdata.this.aP3 = aP3;
      albaran__wwgetfilterdata.this.aP4 = aP4;
      albaran__wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_ALBPROPRI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROPRIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_GUIREMCLN") == 0 )
      {
         /* Execute user subroutine: 'LOADGUIREMCLNOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_ALBLIC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBLICOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_ALBPDATCUD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPDATCUDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV43OptionsJson = AV30Options.toJSonString(false) ;
      AV44OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV33OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("Albaranes.Albaran__WWGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Albaranes.Albaran__WWGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("Albaranes.Albaran__WWGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV49AlbProfch = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV50AlbProfch_To = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV10TFAlbProCod = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFAlbProCod_To = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV12TFAlbProPri = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV13TFAlbProPri_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV14TFAlbProfch = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV16TFGuiRemCli = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFGuiRemCli_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV18TFGuiRemCln = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV19TFGuiRemCln_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV20TFAlbProEst_SelsJson = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV21TFAlbProEst_Sels.fromJSonString(AV20TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV51TFAlbMarca_SelsJson = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV52TFAlbMarca_Sels.fromJSonString(AV51TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV24TFAlbLic = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV25TFAlbLic_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD") == 0 )
         {
            AV26TFAlbPdATCUD = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD_SEL") == 0 )
         {
            AV27TFAlbPdATCUD_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBPROPRIOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbProPri = AV41SearchTxt ;
      AV13TFAlbProPri_Sel = "" ;
      AV57Albaranes_albaran__wwds_1_filterfulltext = AV48FilterFullText ;
      AV58Albaranes_albaran__wwds_2_albprofch = AV49AlbProfch ;
      AV59Albaranes_albaran__wwds_3_albprofch_to = AV50AlbProfch_To ;
      AV60Albaranes_albaran__wwds_4_tfalbprocod = AV10TFAlbProCod ;
      AV61Albaranes_albaran__wwds_5_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV62Albaranes_albaran__wwds_6_tfalbpropri = AV12TFAlbProPri ;
      AV63Albaranes_albaran__wwds_7_tfalbpropri_sel = AV13TFAlbProPri_Sel ;
      AV64Albaranes_albaran__wwds_8_tfalbprofch = AV14TFAlbProfch ;
      AV65Albaranes_albaran__wwds_9_tfguiremcli = AV16TFGuiRemCli ;
      AV66Albaranes_albaran__wwds_10_tfguiremcli_to = AV17TFGuiRemCli_To ;
      AV67Albaranes_albaran__wwds_11_tfguiremcln = AV18TFGuiRemCln ;
      AV68Albaranes_albaran__wwds_12_tfguiremcln_sel = AV19TFGuiRemCln_Sel ;
      AV69Albaranes_albaran__wwds_13_tfalbproest_sels = AV21TFAlbProEst_Sels ;
      AV70Albaranes_albaran__wwds_14_tfalbmarca_sels = AV52TFAlbMarca_Sels ;
      AV71Albaranes_albaran__wwds_15_tfalblic = AV24TFAlbLic ;
      AV72Albaranes_albaran__wwds_16_tfalblic_sel = AV25TFAlbLic_Sel ;
      AV73Albaranes_albaran__wwds_17_tfalbpdatcud = AV26TFAlbPdATCUD ;
      AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV27TFAlbPdATCUD_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                           AV58Albaranes_albaran__wwds_2_albprofch ,
                                           AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                           Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod) ,
                                           Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to) ,
                                           AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                           AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                           AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                           Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli) ,
                                           Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to) ,
                                           AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                           AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                           Integer.valueOf(AV69Albaranes_albaran__wwds_13_tfalbproest_sels.size()) ,
                                           Integer.valueOf(AV70Albaranes_albaran__wwds_14_tfalbmarca_sels.size()) ,
                                           AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                           AV71Albaranes_albaran__wwds_15_tfalblic ,
                                           AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                           AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                           Boolean.valueOf(AV46isAnulado) ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Albaranes_albaran__wwds_6_tfalbpropri = GXutil.padr( GXutil.rtrim( AV62Albaranes_albaran__wwds_6_tfalbpropri), 1, "%") ;
      lV67Albaranes_albaran__wwds_11_tfguiremcln = GXutil.padr( GXutil.rtrim( AV67Albaranes_albaran__wwds_11_tfguiremcln), 30, "%") ;
      lV71Albaranes_albaran__wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV71Albaranes_albaran__wwds_15_tfalblic), 20, "%") ;
      lV73Albaranes_albaran__wwds_17_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV73Albaranes_albaran__wwds_17_tfalbpdatcud), 20, "%") ;
      /* Using cursor P09UU2 */
      pr_default.execute(0, new Object[] {AV47EmprCod, AV58Albaranes_albaran__wwds_2_albprofch, AV59Albaranes_albaran__wwds_3_albprofch_to, Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod), Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to), lV62Albaranes_albaran__wwds_6_tfalbpropri, AV63Albaranes_albaran__wwds_7_tfalbpropri_sel, AV64Albaranes_albaran__wwds_8_tfalbprofch, Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli), Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to), lV67Albaranes_albaran__wwds_11_tfguiremcln, AV68Albaranes_albaran__wwds_12_tfguiremcln_sel, lV71Albaranes_albaran__wwds_15_tfalblic, AV72Albaranes_albaran__wwds_16_tfalblic_sel, lV73Albaranes_albaran__wwds_17_tfalbpdatcud, AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9UU2 = false ;
         A1253EmprGuiRem = P09UU2_A1253EmprGuiRem[0] ;
         A396EmprCod = P09UU2_A396EmprCod[0] ;
         A39AlbProPri = P09UU2_A39AlbProPri[0] ;
         A14069AlbPdATCUD = P09UU2_A14069AlbPdATCUD[0] ;
         A7101AlbLic = P09UU2_A7101AlbLic[0] ;
         A33AlbProEst = P09UU2_A33AlbProEst[0] ;
         A1244GuiRemCln = P09UU2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P09UU2_A1243GuiRemCli[0] ;
         A30AlbProCod = P09UU2_A30AlbProCod[0] ;
         A34AlbProfch = P09UU2_A34AlbProfch[0] ;
         A5140AlbMarca = P09UU2_A5140AlbMarca[0] ;
         A1244GuiRemCln = P09UU2_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV57Albaranes_albaran__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14069AlbPdATCUD) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV34count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09UU2_A39AlbProPri[0], A39AlbProPri) == 0 ) )
            {
               brk9UU2 = false ;
               A396EmprCod = P09UU2_A396EmprCod[0] ;
               A30AlbProCod = P09UU2_A30AlbProCod[0] ;
               AV34count = (long)(AV34count+1) ;
               brk9UU2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A39AlbProPri)==0) )
            {
               AV29Option = A39AlbProPri ;
               AV31OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A39AlbProPri, "9"))) ;
               AV30Options.add(AV29Option, 0);
               AV32OptionsDesc.add(AV31OptionDesc, 0);
               AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV30Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9UU2 )
         {
            brk9UU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADGUIREMCLNOPTIONS' Routine */
      returnInSub = false ;
      AV18TFGuiRemCln = AV41SearchTxt ;
      AV19TFGuiRemCln_Sel = "" ;
      AV57Albaranes_albaran__wwds_1_filterfulltext = AV48FilterFullText ;
      AV58Albaranes_albaran__wwds_2_albprofch = AV49AlbProfch ;
      AV59Albaranes_albaran__wwds_3_albprofch_to = AV50AlbProfch_To ;
      AV60Albaranes_albaran__wwds_4_tfalbprocod = AV10TFAlbProCod ;
      AV61Albaranes_albaran__wwds_5_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV62Albaranes_albaran__wwds_6_tfalbpropri = AV12TFAlbProPri ;
      AV63Albaranes_albaran__wwds_7_tfalbpropri_sel = AV13TFAlbProPri_Sel ;
      AV64Albaranes_albaran__wwds_8_tfalbprofch = AV14TFAlbProfch ;
      AV65Albaranes_albaran__wwds_9_tfguiremcli = AV16TFGuiRemCli ;
      AV66Albaranes_albaran__wwds_10_tfguiremcli_to = AV17TFGuiRemCli_To ;
      AV67Albaranes_albaran__wwds_11_tfguiremcln = AV18TFGuiRemCln ;
      AV68Albaranes_albaran__wwds_12_tfguiremcln_sel = AV19TFGuiRemCln_Sel ;
      AV69Albaranes_albaran__wwds_13_tfalbproest_sels = AV21TFAlbProEst_Sels ;
      AV70Albaranes_albaran__wwds_14_tfalbmarca_sels = AV52TFAlbMarca_Sels ;
      AV71Albaranes_albaran__wwds_15_tfalblic = AV24TFAlbLic ;
      AV72Albaranes_albaran__wwds_16_tfalblic_sel = AV25TFAlbLic_Sel ;
      AV73Albaranes_albaran__wwds_17_tfalbpdatcud = AV26TFAlbPdATCUD ;
      AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV27TFAlbPdATCUD_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                           AV58Albaranes_albaran__wwds_2_albprofch ,
                                           AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                           Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod) ,
                                           Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to) ,
                                           AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                           AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                           AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                           Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli) ,
                                           Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to) ,
                                           AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                           AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                           Integer.valueOf(AV69Albaranes_albaran__wwds_13_tfalbproest_sels.size()) ,
                                           Integer.valueOf(AV70Albaranes_albaran__wwds_14_tfalbmarca_sels.size()) ,
                                           AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                           AV71Albaranes_albaran__wwds_15_tfalblic ,
                                           AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                           AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                           Boolean.valueOf(AV46isAnulado) ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Albaranes_albaran__wwds_6_tfalbpropri = GXutil.padr( GXutil.rtrim( AV62Albaranes_albaran__wwds_6_tfalbpropri), 1, "%") ;
      lV67Albaranes_albaran__wwds_11_tfguiremcln = GXutil.padr( GXutil.rtrim( AV67Albaranes_albaran__wwds_11_tfguiremcln), 30, "%") ;
      lV71Albaranes_albaran__wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV71Albaranes_albaran__wwds_15_tfalblic), 20, "%") ;
      lV73Albaranes_albaran__wwds_17_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV73Albaranes_albaran__wwds_17_tfalbpdatcud), 20, "%") ;
      /* Using cursor P09UU3 */
      pr_default.execute(1, new Object[] {AV47EmprCod, AV58Albaranes_albaran__wwds_2_albprofch, AV59Albaranes_albaran__wwds_3_albprofch_to, Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod), Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to), lV62Albaranes_albaran__wwds_6_tfalbpropri, AV63Albaranes_albaran__wwds_7_tfalbpropri_sel, AV64Albaranes_albaran__wwds_8_tfalbprofch, Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli), Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to), lV67Albaranes_albaran__wwds_11_tfguiremcln, AV68Albaranes_albaran__wwds_12_tfguiremcln_sel, lV71Albaranes_albaran__wwds_15_tfalblic, AV72Albaranes_albaran__wwds_16_tfalblic_sel, lV73Albaranes_albaran__wwds_17_tfalbpdatcud, AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9UU4 = false ;
         A1253EmprGuiRem = P09UU3_A1253EmprGuiRem[0] ;
         A396EmprCod = P09UU3_A396EmprCod[0] ;
         A1244GuiRemCln = P09UU3_A1244GuiRemCln[0] ;
         A14069AlbPdATCUD = P09UU3_A14069AlbPdATCUD[0] ;
         A7101AlbLic = P09UU3_A7101AlbLic[0] ;
         A33AlbProEst = P09UU3_A33AlbProEst[0] ;
         A1243GuiRemCli = P09UU3_A1243GuiRemCli[0] ;
         A39AlbProPri = P09UU3_A39AlbProPri[0] ;
         A30AlbProCod = P09UU3_A30AlbProCod[0] ;
         A34AlbProfch = P09UU3_A34AlbProfch[0] ;
         A5140AlbMarca = P09UU3_A5140AlbMarca[0] ;
         A1244GuiRemCln = P09UU3_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV57Albaranes_albaran__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14069AlbPdATCUD) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV34count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09UU3_A1244GuiRemCln[0], A1244GuiRemCln) == 0 ) )
            {
               brk9UU4 = false ;
               A1253EmprGuiRem = P09UU3_A1253EmprGuiRem[0] ;
               A396EmprCod = P09UU3_A396EmprCod[0] ;
               A1243GuiRemCli = P09UU3_A1243GuiRemCli[0] ;
               A30AlbProCod = P09UU3_A30AlbProCod[0] ;
               AV34count = (long)(AV34count+1) ;
               brk9UU4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A1244GuiRemCln)==0) )
            {
               AV29Option = A1244GuiRemCln ;
               AV30Options.add(AV29Option, 0);
               AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV30Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9UU4 )
         {
            brk9UU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBLICOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbLic = AV41SearchTxt ;
      AV25TFAlbLic_Sel = "" ;
      AV57Albaranes_albaran__wwds_1_filterfulltext = AV48FilterFullText ;
      AV58Albaranes_albaran__wwds_2_albprofch = AV49AlbProfch ;
      AV59Albaranes_albaran__wwds_3_albprofch_to = AV50AlbProfch_To ;
      AV60Albaranes_albaran__wwds_4_tfalbprocod = AV10TFAlbProCod ;
      AV61Albaranes_albaran__wwds_5_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV62Albaranes_albaran__wwds_6_tfalbpropri = AV12TFAlbProPri ;
      AV63Albaranes_albaran__wwds_7_tfalbpropri_sel = AV13TFAlbProPri_Sel ;
      AV64Albaranes_albaran__wwds_8_tfalbprofch = AV14TFAlbProfch ;
      AV65Albaranes_albaran__wwds_9_tfguiremcli = AV16TFGuiRemCli ;
      AV66Albaranes_albaran__wwds_10_tfguiremcli_to = AV17TFGuiRemCli_To ;
      AV67Albaranes_albaran__wwds_11_tfguiremcln = AV18TFGuiRemCln ;
      AV68Albaranes_albaran__wwds_12_tfguiremcln_sel = AV19TFGuiRemCln_Sel ;
      AV69Albaranes_albaran__wwds_13_tfalbproest_sels = AV21TFAlbProEst_Sels ;
      AV70Albaranes_albaran__wwds_14_tfalbmarca_sels = AV52TFAlbMarca_Sels ;
      AV71Albaranes_albaran__wwds_15_tfalblic = AV24TFAlbLic ;
      AV72Albaranes_albaran__wwds_16_tfalblic_sel = AV25TFAlbLic_Sel ;
      AV73Albaranes_albaran__wwds_17_tfalbpdatcud = AV26TFAlbPdATCUD ;
      AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV27TFAlbPdATCUD_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                           AV58Albaranes_albaran__wwds_2_albprofch ,
                                           AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                           Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod) ,
                                           Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to) ,
                                           AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                           AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                           AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                           Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli) ,
                                           Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to) ,
                                           AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                           AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                           Integer.valueOf(AV69Albaranes_albaran__wwds_13_tfalbproest_sels.size()) ,
                                           Integer.valueOf(AV70Albaranes_albaran__wwds_14_tfalbmarca_sels.size()) ,
                                           AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                           AV71Albaranes_albaran__wwds_15_tfalblic ,
                                           AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                           AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                           Boolean.valueOf(AV46isAnulado) ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Albaranes_albaran__wwds_6_tfalbpropri = GXutil.padr( GXutil.rtrim( AV62Albaranes_albaran__wwds_6_tfalbpropri), 1, "%") ;
      lV67Albaranes_albaran__wwds_11_tfguiremcln = GXutil.padr( GXutil.rtrim( AV67Albaranes_albaran__wwds_11_tfguiremcln), 30, "%") ;
      lV71Albaranes_albaran__wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV71Albaranes_albaran__wwds_15_tfalblic), 20, "%") ;
      lV73Albaranes_albaran__wwds_17_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV73Albaranes_albaran__wwds_17_tfalbpdatcud), 20, "%") ;
      /* Using cursor P09UU4 */
      pr_default.execute(2, new Object[] {AV47EmprCod, AV58Albaranes_albaran__wwds_2_albprofch, AV59Albaranes_albaran__wwds_3_albprofch_to, Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod), Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to), lV62Albaranes_albaran__wwds_6_tfalbpropri, AV63Albaranes_albaran__wwds_7_tfalbpropri_sel, AV64Albaranes_albaran__wwds_8_tfalbprofch, Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli), Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to), lV67Albaranes_albaran__wwds_11_tfguiremcln, AV68Albaranes_albaran__wwds_12_tfguiremcln_sel, lV71Albaranes_albaran__wwds_15_tfalblic, AV72Albaranes_albaran__wwds_16_tfalblic_sel, lV73Albaranes_albaran__wwds_17_tfalbpdatcud, AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9UU6 = false ;
         A1253EmprGuiRem = P09UU4_A1253EmprGuiRem[0] ;
         A396EmprCod = P09UU4_A396EmprCod[0] ;
         A7101AlbLic = P09UU4_A7101AlbLic[0] ;
         A14069AlbPdATCUD = P09UU4_A14069AlbPdATCUD[0] ;
         A33AlbProEst = P09UU4_A33AlbProEst[0] ;
         A1244GuiRemCln = P09UU4_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P09UU4_A1243GuiRemCli[0] ;
         A39AlbProPri = P09UU4_A39AlbProPri[0] ;
         A30AlbProCod = P09UU4_A30AlbProCod[0] ;
         A34AlbProfch = P09UU4_A34AlbProfch[0] ;
         A5140AlbMarca = P09UU4_A5140AlbMarca[0] ;
         A1244GuiRemCln = P09UU4_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV57Albaranes_albaran__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14069AlbPdATCUD) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV34count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09UU4_A7101AlbLic[0], A7101AlbLic) == 0 ) )
            {
               brk9UU6 = false ;
               A396EmprCod = P09UU4_A396EmprCod[0] ;
               A30AlbProCod = P09UU4_A30AlbProCod[0] ;
               AV34count = (long)(AV34count+1) ;
               brk9UU6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A7101AlbLic)==0) )
            {
               AV29Option = A7101AlbLic ;
               AV30Options.add(AV29Option, 0);
               AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV30Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9UU6 )
         {
            brk9UU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBPDATCUDOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbPdATCUD = AV41SearchTxt ;
      AV27TFAlbPdATCUD_Sel = "" ;
      AV57Albaranes_albaran__wwds_1_filterfulltext = AV48FilterFullText ;
      AV58Albaranes_albaran__wwds_2_albprofch = AV49AlbProfch ;
      AV59Albaranes_albaran__wwds_3_albprofch_to = AV50AlbProfch_To ;
      AV60Albaranes_albaran__wwds_4_tfalbprocod = AV10TFAlbProCod ;
      AV61Albaranes_albaran__wwds_5_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV62Albaranes_albaran__wwds_6_tfalbpropri = AV12TFAlbProPri ;
      AV63Albaranes_albaran__wwds_7_tfalbpropri_sel = AV13TFAlbProPri_Sel ;
      AV64Albaranes_albaran__wwds_8_tfalbprofch = AV14TFAlbProfch ;
      AV65Albaranes_albaran__wwds_9_tfguiremcli = AV16TFGuiRemCli ;
      AV66Albaranes_albaran__wwds_10_tfguiremcli_to = AV17TFGuiRemCli_To ;
      AV67Albaranes_albaran__wwds_11_tfguiremcln = AV18TFGuiRemCln ;
      AV68Albaranes_albaran__wwds_12_tfguiremcln_sel = AV19TFGuiRemCln_Sel ;
      AV69Albaranes_albaran__wwds_13_tfalbproest_sels = AV21TFAlbProEst_Sels ;
      AV70Albaranes_albaran__wwds_14_tfalbmarca_sels = AV52TFAlbMarca_Sels ;
      AV71Albaranes_albaran__wwds_15_tfalblic = AV24TFAlbLic ;
      AV72Albaranes_albaran__wwds_16_tfalblic_sel = AV25TFAlbLic_Sel ;
      AV73Albaranes_albaran__wwds_17_tfalbpdatcud = AV26TFAlbPdATCUD ;
      AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV27TFAlbPdATCUD_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                           AV58Albaranes_albaran__wwds_2_albprofch ,
                                           AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                           Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod) ,
                                           Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to) ,
                                           AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                           AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                           AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                           Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli) ,
                                           Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to) ,
                                           AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                           AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                           Integer.valueOf(AV69Albaranes_albaran__wwds_13_tfalbproest_sels.size()) ,
                                           Integer.valueOf(AV70Albaranes_albaran__wwds_14_tfalbmarca_sels.size()) ,
                                           AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                           AV71Albaranes_albaran__wwds_15_tfalblic ,
                                           AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                           AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                           Boolean.valueOf(AV46isAnulado) ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Albaranes_albaran__wwds_6_tfalbpropri = GXutil.padr( GXutil.rtrim( AV62Albaranes_albaran__wwds_6_tfalbpropri), 1, "%") ;
      lV67Albaranes_albaran__wwds_11_tfguiremcln = GXutil.padr( GXutil.rtrim( AV67Albaranes_albaran__wwds_11_tfguiremcln), 30, "%") ;
      lV71Albaranes_albaran__wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV71Albaranes_albaran__wwds_15_tfalblic), 20, "%") ;
      lV73Albaranes_albaran__wwds_17_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV73Albaranes_albaran__wwds_17_tfalbpdatcud), 20, "%") ;
      /* Using cursor P09UU5 */
      pr_default.execute(3, new Object[] {AV47EmprCod, AV58Albaranes_albaran__wwds_2_albprofch, AV59Albaranes_albaran__wwds_3_albprofch_to, Long.valueOf(AV60Albaranes_albaran__wwds_4_tfalbprocod), Long.valueOf(AV61Albaranes_albaran__wwds_5_tfalbprocod_to), lV62Albaranes_albaran__wwds_6_tfalbpropri, AV63Albaranes_albaran__wwds_7_tfalbpropri_sel, AV64Albaranes_albaran__wwds_8_tfalbprofch, Integer.valueOf(AV65Albaranes_albaran__wwds_9_tfguiremcli), Integer.valueOf(AV66Albaranes_albaran__wwds_10_tfguiremcli_to), lV67Albaranes_albaran__wwds_11_tfguiremcln, AV68Albaranes_albaran__wwds_12_tfguiremcln_sel, lV71Albaranes_albaran__wwds_15_tfalblic, AV72Albaranes_albaran__wwds_16_tfalblic_sel, lV73Albaranes_albaran__wwds_17_tfalbpdatcud, AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9UU8 = false ;
         A1253EmprGuiRem = P09UU5_A1253EmprGuiRem[0] ;
         A396EmprCod = P09UU5_A396EmprCod[0] ;
         A14069AlbPdATCUD = P09UU5_A14069AlbPdATCUD[0] ;
         A7101AlbLic = P09UU5_A7101AlbLic[0] ;
         A33AlbProEst = P09UU5_A33AlbProEst[0] ;
         A1244GuiRemCln = P09UU5_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P09UU5_A1243GuiRemCli[0] ;
         A39AlbProPri = P09UU5_A39AlbProPri[0] ;
         A30AlbProCod = P09UU5_A30AlbProCod[0] ;
         A34AlbProfch = P09UU5_A34AlbProfch[0] ;
         A5140AlbMarca = P09UU5_A5140AlbMarca[0] ;
         A1244GuiRemCln = P09UU5_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV57Albaranes_albaran__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV57Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14069AlbPdATCUD) , GXutil.padr( "%" + GXutil.upper( AV57Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV34count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09UU5_A14069AlbPdATCUD[0], A14069AlbPdATCUD) == 0 ) )
            {
               brk9UU8 = false ;
               A396EmprCod = P09UU5_A396EmprCod[0] ;
               A30AlbProCod = P09UU5_A30AlbProCod[0] ;
               AV34count = (long)(AV34count+1) ;
               brk9UU8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A14069AlbPdATCUD)==0) )
            {
               AV29Option = A14069AlbPdATCUD ;
               AV30Options.add(AV29Option, 0);
               AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV30Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9UU8 )
         {
            brk9UU8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = albaran__wwgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = albaran__wwgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = albaran__wwgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43OptionsJson = "" ;
      AV44OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV49AlbProfch = GXutil.nullDate() ;
      AV50AlbProfch_To = GXutil.nullDate() ;
      AV12TFAlbProPri = "" ;
      AV13TFAlbProPri_Sel = "" ;
      AV14TFAlbProfch = GXutil.nullDate() ;
      AV18TFGuiRemCln = "" ;
      AV19TFGuiRemCln_Sel = "" ;
      AV20TFAlbProEst_SelsJson = "" ;
      AV21TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV51TFAlbMarca_SelsJson = "" ;
      AV52TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24TFAlbLic = "" ;
      AV25TFAlbLic_Sel = "" ;
      AV26TFAlbPdATCUD = "" ;
      AV27TFAlbPdATCUD_Sel = "" ;
      A39AlbProPri = "" ;
      AV57Albaranes_albaran__wwds_1_filterfulltext = "" ;
      AV58Albaranes_albaran__wwds_2_albprofch = GXutil.nullDate() ;
      AV59Albaranes_albaran__wwds_3_albprofch_to = GXutil.nullDate() ;
      AV62Albaranes_albaran__wwds_6_tfalbpropri = "" ;
      AV63Albaranes_albaran__wwds_7_tfalbpropri_sel = "" ;
      AV64Albaranes_albaran__wwds_8_tfalbprofch = GXutil.nullDate() ;
      AV67Albaranes_albaran__wwds_11_tfguiremcln = "" ;
      AV68Albaranes_albaran__wwds_12_tfguiremcln_sel = "" ;
      AV69Albaranes_albaran__wwds_13_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV70Albaranes_albaran__wwds_14_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV71Albaranes_albaran__wwds_15_tfalblic = "" ;
      AV72Albaranes_albaran__wwds_16_tfalblic_sel = "" ;
      AV73Albaranes_albaran__wwds_17_tfalbpdatcud = "" ;
      AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel = "" ;
      lV57Albaranes_albaran__wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV62Albaranes_albaran__wwds_6_tfalbpropri = "" ;
      lV67Albaranes_albaran__wwds_11_tfguiremcln = "" ;
      lV71Albaranes_albaran__wwds_15_tfalblic = "" ;
      lV73Albaranes_albaran__wwds_17_tfalbpdatcud = "" ;
      A5140AlbMarca = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A7101AlbLic = "" ;
      A14069AlbPdATCUD = "" ;
      A396EmprCod = "" ;
      AV47EmprCod = "" ;
      P09UU2_A1253EmprGuiRem = new String[] {""} ;
      P09UU2_A396EmprCod = new String[] {""} ;
      P09UU2_A39AlbProPri = new String[] {""} ;
      P09UU2_A14069AlbPdATCUD = new String[] {""} ;
      P09UU2_A7101AlbLic = new String[] {""} ;
      P09UU2_A33AlbProEst = new byte[1] ;
      P09UU2_A1244GuiRemCln = new String[] {""} ;
      P09UU2_A1243GuiRemCli = new int[1] ;
      P09UU2_A30AlbProCod = new long[1] ;
      P09UU2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09UU2_A5140AlbMarca = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      AV29Option = "" ;
      AV31OptionDesc = "" ;
      P09UU3_A1253EmprGuiRem = new String[] {""} ;
      P09UU3_A396EmprCod = new String[] {""} ;
      P09UU3_A1244GuiRemCln = new String[] {""} ;
      P09UU3_A14069AlbPdATCUD = new String[] {""} ;
      P09UU3_A7101AlbLic = new String[] {""} ;
      P09UU3_A33AlbProEst = new byte[1] ;
      P09UU3_A1243GuiRemCli = new int[1] ;
      P09UU3_A39AlbProPri = new String[] {""} ;
      P09UU3_A30AlbProCod = new long[1] ;
      P09UU3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09UU3_A5140AlbMarca = new String[] {""} ;
      P09UU4_A1253EmprGuiRem = new String[] {""} ;
      P09UU4_A396EmprCod = new String[] {""} ;
      P09UU4_A7101AlbLic = new String[] {""} ;
      P09UU4_A14069AlbPdATCUD = new String[] {""} ;
      P09UU4_A33AlbProEst = new byte[1] ;
      P09UU4_A1244GuiRemCln = new String[] {""} ;
      P09UU4_A1243GuiRemCli = new int[1] ;
      P09UU4_A39AlbProPri = new String[] {""} ;
      P09UU4_A30AlbProCod = new long[1] ;
      P09UU4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09UU4_A5140AlbMarca = new String[] {""} ;
      P09UU5_A1253EmprGuiRem = new String[] {""} ;
      P09UU5_A396EmprCod = new String[] {""} ;
      P09UU5_A14069AlbPdATCUD = new String[] {""} ;
      P09UU5_A7101AlbLic = new String[] {""} ;
      P09UU5_A33AlbProEst = new byte[1] ;
      P09UU5_A1244GuiRemCln = new String[] {""} ;
      P09UU5_A1243GuiRemCli = new int[1] ;
      P09UU5_A39AlbProPri = new String[] {""} ;
      P09UU5_A30AlbProCod = new long[1] ;
      P09UU5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09UU5_A5140AlbMarca = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09UU2_A1253EmprGuiRem, P09UU2_A396EmprCod, P09UU2_A39AlbProPri, P09UU2_A14069AlbPdATCUD, P09UU2_A7101AlbLic, P09UU2_A33AlbProEst, P09UU2_A1244GuiRemCln, P09UU2_A1243GuiRemCli, P09UU2_A30AlbProCod, P09UU2_A34AlbProfch,
            P09UU2_A5140AlbMarca
            }
            , new Object[] {
            P09UU3_A1253EmprGuiRem, P09UU3_A396EmprCod, P09UU3_A1244GuiRemCln, P09UU3_A14069AlbPdATCUD, P09UU3_A7101AlbLic, P09UU3_A33AlbProEst, P09UU3_A1243GuiRemCli, P09UU3_A39AlbProPri, P09UU3_A30AlbProCod, P09UU3_A34AlbProfch,
            P09UU3_A5140AlbMarca
            }
            , new Object[] {
            P09UU4_A1253EmprGuiRem, P09UU4_A396EmprCod, P09UU4_A7101AlbLic, P09UU4_A14069AlbPdATCUD, P09UU4_A33AlbProEst, P09UU4_A1244GuiRemCln, P09UU4_A1243GuiRemCli, P09UU4_A39AlbProPri, P09UU4_A30AlbProCod, P09UU4_A34AlbProfch,
            P09UU4_A5140AlbMarca
            }
            , new Object[] {
            P09UU5_A1253EmprGuiRem, P09UU5_A396EmprCod, P09UU5_A14069AlbPdATCUD, P09UU5_A7101AlbLic, P09UU5_A33AlbProEst, P09UU5_A1244GuiRemCln, P09UU5_A1243GuiRemCli, P09UU5_A39AlbProPri, P09UU5_A30AlbProCod, P09UU5_A34AlbProfch,
            P09UU5_A5140AlbMarca
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV16TFGuiRemCli ;
   private int AV17TFGuiRemCli_To ;
   private int AV65Albaranes_albaran__wwds_9_tfguiremcli ;
   private int AV66Albaranes_albaran__wwds_10_tfguiremcli_to ;
   private int AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size ;
   private int AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size ;
   private int A1243GuiRemCli ;
   private long AV10TFAlbProCod ;
   private long AV11TFAlbProCod_To ;
   private long AV60Albaranes_albaran__wwds_4_tfalbprocod ;
   private long AV61Albaranes_albaran__wwds_5_tfalbprocod_to ;
   private long A30AlbProCod ;
   private long AV34count ;
   private String AV12TFAlbProPri ;
   private String AV13TFAlbProPri_Sel ;
   private String AV18TFGuiRemCln ;
   private String AV19TFGuiRemCln_Sel ;
   private String AV24TFAlbLic ;
   private String AV25TFAlbLic_Sel ;
   private String AV26TFAlbPdATCUD ;
   private String AV27TFAlbPdATCUD_Sel ;
   private String A39AlbProPri ;
   private String AV62Albaranes_albaran__wwds_6_tfalbpropri ;
   private String AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ;
   private String AV67Albaranes_albaran__wwds_11_tfguiremcln ;
   private String AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ;
   private String AV71Albaranes_albaran__wwds_15_tfalblic ;
   private String AV72Albaranes_albaran__wwds_16_tfalblic_sel ;
   private String AV73Albaranes_albaran__wwds_17_tfalbpdatcud ;
   private String AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ;
   private String scmdbuf ;
   private String lV62Albaranes_albaran__wwds_6_tfalbpropri ;
   private String lV67Albaranes_albaran__wwds_11_tfguiremcln ;
   private String lV71Albaranes_albaran__wwds_15_tfalblic ;
   private String lV73Albaranes_albaran__wwds_17_tfalbpdatcud ;
   private String A5140AlbMarca ;
   private String A1244GuiRemCln ;
   private String A7101AlbLic ;
   private String A14069AlbPdATCUD ;
   private String A396EmprCod ;
   private String AV47EmprCod ;
   private String A1253EmprGuiRem ;
   private java.util.Date AV49AlbProfch ;
   private java.util.Date AV50AlbProfch_To ;
   private java.util.Date AV14TFAlbProfch ;
   private java.util.Date AV58Albaranes_albaran__wwds_2_albprofch ;
   private java.util.Date AV59Albaranes_albaran__wwds_3_albprofch_to ;
   private java.util.Date AV64Albaranes_albaran__wwds_8_tfalbprofch ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean AV46isAnulado ;
   private boolean brk9UU2 ;
   private boolean brk9UU4 ;
   private boolean brk9UU6 ;
   private boolean brk9UU8 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV20TFAlbProEst_SelsJson ;
   private String AV51TFAlbMarca_SelsJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV57Albaranes_albaran__wwds_1_filterfulltext ;
   private String lV57Albaranes_albaran__wwds_1_filterfulltext ;
   private String AV29Option ;
   private String AV31OptionDesc ;
   private GXSimpleCollection<Byte> AV21TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV69Albaranes_albaran__wwds_13_tfalbproest_sels ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09UU2_A1253EmprGuiRem ;
   private String[] P09UU2_A396EmprCod ;
   private String[] P09UU2_A39AlbProPri ;
   private String[] P09UU2_A14069AlbPdATCUD ;
   private String[] P09UU2_A7101AlbLic ;
   private byte[] P09UU2_A33AlbProEst ;
   private String[] P09UU2_A1244GuiRemCln ;
   private int[] P09UU2_A1243GuiRemCli ;
   private long[] P09UU2_A30AlbProCod ;
   private java.util.Date[] P09UU2_A34AlbProfch ;
   private String[] P09UU2_A5140AlbMarca ;
   private String[] P09UU3_A1253EmprGuiRem ;
   private String[] P09UU3_A396EmprCod ;
   private String[] P09UU3_A1244GuiRemCln ;
   private String[] P09UU3_A14069AlbPdATCUD ;
   private String[] P09UU3_A7101AlbLic ;
   private byte[] P09UU3_A33AlbProEst ;
   private int[] P09UU3_A1243GuiRemCli ;
   private String[] P09UU3_A39AlbProPri ;
   private long[] P09UU3_A30AlbProCod ;
   private java.util.Date[] P09UU3_A34AlbProfch ;
   private String[] P09UU3_A5140AlbMarca ;
   private String[] P09UU4_A1253EmprGuiRem ;
   private String[] P09UU4_A396EmprCod ;
   private String[] P09UU4_A7101AlbLic ;
   private String[] P09UU4_A14069AlbPdATCUD ;
   private byte[] P09UU4_A33AlbProEst ;
   private String[] P09UU4_A1244GuiRemCln ;
   private int[] P09UU4_A1243GuiRemCli ;
   private String[] P09UU4_A39AlbProPri ;
   private long[] P09UU4_A30AlbProCod ;
   private java.util.Date[] P09UU4_A34AlbProfch ;
   private String[] P09UU4_A5140AlbMarca ;
   private String[] P09UU5_A1253EmprGuiRem ;
   private String[] P09UU5_A396EmprCod ;
   private String[] P09UU5_A14069AlbPdATCUD ;
   private String[] P09UU5_A7101AlbLic ;
   private byte[] P09UU5_A33AlbProEst ;
   private String[] P09UU5_A1244GuiRemCln ;
   private int[] P09UU5_A1243GuiRemCli ;
   private String[] P09UU5_A39AlbProPri ;
   private long[] P09UU5_A30AlbProCod ;
   private java.util.Date[] P09UU5_A34AlbProfch ;
   private String[] P09UU5_A5140AlbMarca ;
   private GXSimpleCollection<String> AV52TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class albaran__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                          java.util.Date AV58Albaranes_albaran__wwds_2_albprofch ,
                                          java.util.Date AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                          long AV60Albaranes_albaran__wwds_4_tfalbprocod ,
                                          long AV61Albaranes_albaran__wwds_5_tfalbprocod_to ,
                                          String AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                          String AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                          java.util.Date AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                          int AV65Albaranes_albaran__wwds_9_tfguiremcli ,
                                          int AV66Albaranes_albaran__wwds_10_tfguiremcli_to ,
                                          String AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                          String AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                          int AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size ,
                                          int AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size ,
                                          String AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                          String AV71Albaranes_albaran__wwds_15_tfalblic ,
                                          String AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                          String AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                          boolean AV46isAnulado ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          String AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T1.AlbPdATCUD, T1.AlbLic, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod," ;
      scmdbuf += " T1.AlbProfch, T1.AlbMarca FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Albaranes_albaran__wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Albaranes_albaran__wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV60Albaranes_albaran__wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV61Albaranes_albaran__wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV62Albaranes_albaran__wwds_6_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Albaranes_albaran__wwds_8_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Albaranes_albaran__wwds_9_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Albaranes_albaran__wwds_10_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV67Albaranes_albaran__wwds_11_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Albaranes_albaran__wwds_13_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Albaranes_albaran__wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV71Albaranes_albaran__wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV73Albaranes_albaran__wwds_17_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( AV46isAnulado )
      {
         addWhere(sWhereString, "(T1.AlbMarca = 'A')");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbProPri" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09UU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                          java.util.Date AV58Albaranes_albaran__wwds_2_albprofch ,
                                          java.util.Date AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                          long AV60Albaranes_albaran__wwds_4_tfalbprocod ,
                                          long AV61Albaranes_albaran__wwds_5_tfalbprocod_to ,
                                          String AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                          String AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                          java.util.Date AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                          int AV65Albaranes_albaran__wwds_9_tfguiremcli ,
                                          int AV66Albaranes_albaran__wwds_10_tfguiremcli_to ,
                                          String AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                          String AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                          int AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size ,
                                          int AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size ,
                                          String AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                          String AV71Albaranes_albaran__wwds_15_tfalblic ,
                                          String AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                          String AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                          boolean AV46isAnulado ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          String AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[16];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T2.CliNom AS GuiRemCln, T1.AlbPdATCUD, T1.AlbLic, T1.AlbProEst, T1.GuiRemCli AS GuiRemCli, T1.AlbProPri, T1.AlbProCod," ;
      scmdbuf += " T1.AlbProfch, T1.AlbMarca FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Albaranes_albaran__wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Albaranes_albaran__wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV60Albaranes_albaran__wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV61Albaranes_albaran__wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV62Albaranes_albaran__wwds_6_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Albaranes_albaran__wwds_8_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Albaranes_albaran__wwds_9_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Albaranes_albaran__wwds_10_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV67Albaranes_albaran__wwds_11_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Albaranes_albaran__wwds_13_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Albaranes_albaran__wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV71Albaranes_albaran__wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV73Albaranes_albaran__wwds_17_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( AV46isAnulado )
      {
         addWhere(sWhereString, "(T1.AlbMarca = 'A')");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09UU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                          java.util.Date AV58Albaranes_albaran__wwds_2_albprofch ,
                                          java.util.Date AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                          long AV60Albaranes_albaran__wwds_4_tfalbprocod ,
                                          long AV61Albaranes_albaran__wwds_5_tfalbprocod_to ,
                                          String AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                          String AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                          java.util.Date AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                          int AV65Albaranes_albaran__wwds_9_tfguiremcli ,
                                          int AV66Albaranes_albaran__wwds_10_tfguiremcli_to ,
                                          String AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                          String AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                          int AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size ,
                                          int AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size ,
                                          String AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                          String AV71Albaranes_albaran__wwds_15_tfalblic ,
                                          String AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                          String AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                          boolean AV46isAnulado ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          String AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[16];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbLic, T1.AlbPdATCUD, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProPri, T1.AlbProCod," ;
      scmdbuf += " T1.AlbProfch, T1.AlbMarca FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Albaranes_albaran__wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Albaranes_albaran__wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV60Albaranes_albaran__wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV61Albaranes_albaran__wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV62Albaranes_albaran__wwds_6_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Albaranes_albaran__wwds_8_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Albaranes_albaran__wwds_9_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Albaranes_albaran__wwds_10_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV67Albaranes_albaran__wwds_11_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Albaranes_albaran__wwds_13_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Albaranes_albaran__wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV71Albaranes_albaran__wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV73Albaranes_albaran__wwds_17_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( AV46isAnulado )
      {
         addWhere(sWhereString, "(T1.AlbMarca = 'A')");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbLic" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09UU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV69Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV70Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                          java.util.Date AV58Albaranes_albaran__wwds_2_albprofch ,
                                          java.util.Date AV59Albaranes_albaran__wwds_3_albprofch_to ,
                                          long AV60Albaranes_albaran__wwds_4_tfalbprocod ,
                                          long AV61Albaranes_albaran__wwds_5_tfalbprocod_to ,
                                          String AV63Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                          String AV62Albaranes_albaran__wwds_6_tfalbpropri ,
                                          java.util.Date AV64Albaranes_albaran__wwds_8_tfalbprofch ,
                                          int AV65Albaranes_albaran__wwds_9_tfguiremcli ,
                                          int AV66Albaranes_albaran__wwds_10_tfguiremcli_to ,
                                          String AV68Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                          String AV67Albaranes_albaran__wwds_11_tfguiremcln ,
                                          int AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size ,
                                          int AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size ,
                                          String AV72Albaranes_albaran__wwds_16_tfalblic_sel ,
                                          String AV71Albaranes_albaran__wwds_15_tfalblic ,
                                          String AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                          String AV73Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                          boolean AV46isAnulado ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          String AV57Albaranes_albaran__wwds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[16];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbPdATCUD, T1.AlbLic, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProPri, T1.AlbProCod," ;
      scmdbuf += " T1.AlbProfch, T1.AlbMarca FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Albaranes_albaran__wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Albaranes_albaran__wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV60Albaranes_albaran__wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV61Albaranes_albaran__wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV62Albaranes_albaran__wwds_6_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Albaranes_albaran__wwds_8_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Albaranes_albaran__wwds_9_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Albaranes_albaran__wwds_10_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV67Albaranes_albaran__wwds_11_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( AV69Albaranes_albaran__wwds_13_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Albaranes_albaran__wwds_13_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( AV70Albaranes_albaran__wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Albaranes_albaran__wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV71Albaranes_albaran__wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Albaranes_albaran__wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV73Albaranes_albaran__wwds_17_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( AV46isAnulado )
      {
         addWhere(sWhereString, "(T1.AlbMarca = 'A')");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbPdATCUD" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P09UU2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Boolean) dynConstraints[21]).booleanValue() , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 1 :
                  return conditional_P09UU3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Boolean) dynConstraints[21]).booleanValue() , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 2 :
                  return conditional_P09UU4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Boolean) dynConstraints[21]).booleanValue() , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 3 :
                  return conditional_P09UU5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Boolean) dynConstraints[21]).booleanValue() , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               return;
      }
   }

}

