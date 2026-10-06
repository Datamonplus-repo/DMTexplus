package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn06wwgetfilterdata extends GXProcedure
{
   public ttrn06wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn06wwgetfilterdata.class ), "" );
   }

   public ttrn06wwgetfilterdata( int remoteHandle ,
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
      ttrn06wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn06wwgetfilterdata.this.AV26DDOName = aP0;
      ttrn06wwgetfilterdata.this.AV24SearchTxt = aP1;
      ttrn06wwgetfilterdata.this.AV25SearchTxtTo = aP2;
      ttrn06wwgetfilterdata.this.aP3 = aP3;
      ttrn06wwgetfilterdata.this.aP4 = aP4;
      ttrn06wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBPROPRI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_GUIREMCLN") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBLIC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBFMD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBFMDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("TTrn06WWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn06WWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TTrn06WWGridState"), null, null);
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROPRI") == 0 )
         {
            AV46AlbProPri = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV42AlbProFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV43AlbProFch_To = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV59FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV10TFAlbProCod = GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFAlbProCod_To = GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV47TFAlbProPri = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV48TFAlbProPri_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV12TFAlbProfch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV14TFGuiRemCli = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFGuiRemCli_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV16TFGuiRemCln = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV17TFGuiRemCln_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV57TFAlbMarca_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV58TFAlbMarca_Sels.fromJSonString(AV57TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV20TFAlbLic = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV21TFAlbLic_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROAT_SEL") == 0 )
         {
            AV44TFAlbProAT_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFAlbProAT_Sels.fromJSonString(AV44TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV51TFAlbProEst_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV52TFAlbProEst_Sels.fromJSonString(AV51TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD") == 0 )
         {
            AV53TFAlbFmd = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD_SEL") == 0 )
         {
            AV54TFAlbFmd_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBPROPRIOPTIONS' Routine */
      returnInSub = false ;
      AV47TFAlbProPri = AV24SearchTxt ;
      AV48TFAlbProPri_Sel = "" ;
      AV64Ttrn06wwds_1_albpropri = AV46AlbProPri ;
      AV65Ttrn06wwds_2_albprofch = AV42AlbProFch ;
      AV66Ttrn06wwds_3_albprofch_to = AV43AlbProFch_To ;
      AV67Ttrn06wwds_4_filterfulltext = AV59FilterFullText ;
      AV68Ttrn06wwds_5_tfalbprocod = AV10TFAlbProCod ;
      AV69Ttrn06wwds_6_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV70Ttrn06wwds_7_tfalbpropri = AV47TFAlbProPri ;
      AV71Ttrn06wwds_8_tfalbpropri_sel = AV48TFAlbProPri_Sel ;
      AV72Ttrn06wwds_9_tfalbprofch = AV12TFAlbProfch ;
      AV73Ttrn06wwds_10_tfguiremcli = AV14TFGuiRemCli ;
      AV74Ttrn06wwds_11_tfguiremcli_to = AV15TFGuiRemCli_To ;
      AV75Ttrn06wwds_12_tfguiremcln = AV16TFGuiRemCln ;
      AV76Ttrn06wwds_13_tfguiremcln_sel = AV17TFGuiRemCln_Sel ;
      AV77Ttrn06wwds_14_tfalbmarca_sels = AV58TFAlbMarca_Sels ;
      AV78Ttrn06wwds_15_tfalblic = AV20TFAlbLic ;
      AV79Ttrn06wwds_16_tfalblic_sel = AV21TFAlbLic_Sel ;
      AV80Ttrn06wwds_17_tfalbproat_sels = AV45TFAlbProAT_Sels ;
      AV81Ttrn06wwds_18_tfalbproest_sels = AV52TFAlbProEst_Sels ;
      AV82Ttrn06wwds_19_tfalbfmd = AV53TFAlbFmd ;
      AV83Ttrn06wwds_20_tfalbfmd_sel = AV54TFAlbFmd_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5140AlbMarca ,
                                           AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                           A10765AlbProAT ,
                                           AV80Ttrn06wwds_17_tfalbproat_sels ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV81Ttrn06wwds_18_tfalbproest_sels ,
                                           AV65Ttrn06wwds_2_albprofch ,
                                           AV66Ttrn06wwds_3_albprofch_to ,
                                           Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod) ,
                                           Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to) ,
                                           AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                           AV70Ttrn06wwds_7_tfalbpropri ,
                                           AV72Ttrn06wwds_9_tfalbprofch ,
                                           Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli) ,
                                           Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to) ,
                                           AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                           AV75Ttrn06wwds_12_tfguiremcln ,
                                           Integer.valueOf(AV77Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                           AV79Ttrn06wwds_16_tfalblic_sel ,
                                           AV78Ttrn06wwds_15_tfalblic ,
                                           Integer.valueOf(AV80Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                           Integer.valueOf(AV81Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                           AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                           AV82Ttrn06wwds_19_tfalbfmd ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A10017AlbFmd ,
                                           AV67Ttrn06wwds_4_filterfulltext ,
                                           AV64Ttrn06wwds_1_albpropri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV70Ttrn06wwds_7_tfalbpropri), 1, "%") ;
      lV75Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV75Ttrn06wwds_12_tfguiremcln), 30, "%") ;
      lV78Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV78Ttrn06wwds_15_tfalblic), 20, "%") ;
      lV82Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV82Ttrn06wwds_19_tfalbfmd), "%", "") ;
      /* Using cursor P08DU2 */
      pr_default.execute(0, new Object[] {AV64Ttrn06wwds_1_albpropri, AV65Ttrn06wwds_2_albprofch, AV66Ttrn06wwds_3_albprofch_to, Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to), lV70Ttrn06wwds_7_tfalbpropri, AV71Ttrn06wwds_8_tfalbpropri_sel, AV72Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to), lV75Ttrn06wwds_12_tfguiremcln, AV76Ttrn06wwds_13_tfguiremcln_sel, lV78Ttrn06wwds_15_tfalblic, AV79Ttrn06wwds_16_tfalblic_sel, lV82Ttrn06wwds_19_tfalbfmd, AV83Ttrn06wwds_20_tfalbfmd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8DU2 = false ;
         A1253EmprGuiRem = P08DU2_A1253EmprGuiRem[0] ;
         A39AlbProPri = P08DU2_A39AlbProPri[0] ;
         A10017AlbFmd = P08DU2_A10017AlbFmd[0] ;
         n10017AlbFmd = P08DU2_n10017AlbFmd[0] ;
         A33AlbProEst = P08DU2_A33AlbProEst[0] ;
         A7101AlbLic = P08DU2_A7101AlbLic[0] ;
         A1244GuiRemCln = P08DU2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08DU2_A1243GuiRemCli[0] ;
         A30AlbProCod = P08DU2_A30AlbProCod[0] ;
         A10765AlbProAT = P08DU2_A10765AlbProAT[0] ;
         A5140AlbMarca = P08DU2_A5140AlbMarca[0] ;
         A34AlbProfch = P08DU2_A34AlbProfch[0] ;
         A396EmprCod = P08DU2_A396EmprCod[0] ;
         A1244GuiRemCln = P08DU2_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV67Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automatico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s/d", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08DU2_A39AlbProPri[0], A39AlbProPri) == 0 ) )
            {
               brk8DU2 = false ;
               A30AlbProCod = P08DU2_A30AlbProCod[0] ;
               A396EmprCod = P08DU2_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk8DU2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A39AlbProPri)==0) )
            {
               AV28Option = A39AlbProPri ;
               AV31OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A39AlbProPri, "9"))) ;
               AV29Options.add(AV28Option, 0);
               AV32OptionsDesc.add(AV31OptionDesc, 0);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV29Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8DU2 )
         {
            brk8DU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADGUIREMCLNOPTIONS' Routine */
      returnInSub = false ;
      AV16TFGuiRemCln = AV24SearchTxt ;
      AV17TFGuiRemCln_Sel = "" ;
      AV64Ttrn06wwds_1_albpropri = AV46AlbProPri ;
      AV65Ttrn06wwds_2_albprofch = AV42AlbProFch ;
      AV66Ttrn06wwds_3_albprofch_to = AV43AlbProFch_To ;
      AV67Ttrn06wwds_4_filterfulltext = AV59FilterFullText ;
      AV68Ttrn06wwds_5_tfalbprocod = AV10TFAlbProCod ;
      AV69Ttrn06wwds_6_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV70Ttrn06wwds_7_tfalbpropri = AV47TFAlbProPri ;
      AV71Ttrn06wwds_8_tfalbpropri_sel = AV48TFAlbProPri_Sel ;
      AV72Ttrn06wwds_9_tfalbprofch = AV12TFAlbProfch ;
      AV73Ttrn06wwds_10_tfguiremcli = AV14TFGuiRemCli ;
      AV74Ttrn06wwds_11_tfguiremcli_to = AV15TFGuiRemCli_To ;
      AV75Ttrn06wwds_12_tfguiremcln = AV16TFGuiRemCln ;
      AV76Ttrn06wwds_13_tfguiremcln_sel = AV17TFGuiRemCln_Sel ;
      AV77Ttrn06wwds_14_tfalbmarca_sels = AV58TFAlbMarca_Sels ;
      AV78Ttrn06wwds_15_tfalblic = AV20TFAlbLic ;
      AV79Ttrn06wwds_16_tfalblic_sel = AV21TFAlbLic_Sel ;
      AV80Ttrn06wwds_17_tfalbproat_sels = AV45TFAlbProAT_Sels ;
      AV81Ttrn06wwds_18_tfalbproest_sels = AV52TFAlbProEst_Sels ;
      AV82Ttrn06wwds_19_tfalbfmd = AV53TFAlbFmd ;
      AV83Ttrn06wwds_20_tfalbfmd_sel = AV54TFAlbFmd_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A5140AlbMarca ,
                                           AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                           A10765AlbProAT ,
                                           AV80Ttrn06wwds_17_tfalbproat_sels ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV81Ttrn06wwds_18_tfalbproest_sels ,
                                           AV65Ttrn06wwds_2_albprofch ,
                                           AV66Ttrn06wwds_3_albprofch_to ,
                                           Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod) ,
                                           Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to) ,
                                           AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                           AV70Ttrn06wwds_7_tfalbpropri ,
                                           AV72Ttrn06wwds_9_tfalbprofch ,
                                           Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli) ,
                                           Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to) ,
                                           AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                           AV75Ttrn06wwds_12_tfguiremcln ,
                                           Integer.valueOf(AV77Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                           AV79Ttrn06wwds_16_tfalblic_sel ,
                                           AV78Ttrn06wwds_15_tfalblic ,
                                           Integer.valueOf(AV80Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                           Integer.valueOf(AV81Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                           AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                           AV82Ttrn06wwds_19_tfalbfmd ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A10017AlbFmd ,
                                           AV67Ttrn06wwds_4_filterfulltext ,
                                           AV64Ttrn06wwds_1_albpropri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV70Ttrn06wwds_7_tfalbpropri), 1, "%") ;
      lV75Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV75Ttrn06wwds_12_tfguiremcln), 30, "%") ;
      lV78Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV78Ttrn06wwds_15_tfalblic), 20, "%") ;
      lV82Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV82Ttrn06wwds_19_tfalbfmd), "%", "") ;
      /* Using cursor P08DU3 */
      pr_default.execute(1, new Object[] {AV64Ttrn06wwds_1_albpropri, AV65Ttrn06wwds_2_albprofch, AV66Ttrn06wwds_3_albprofch_to, Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to), lV70Ttrn06wwds_7_tfalbpropri, AV71Ttrn06wwds_8_tfalbpropri_sel, AV72Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to), lV75Ttrn06wwds_12_tfguiremcln, AV76Ttrn06wwds_13_tfguiremcln_sel, lV78Ttrn06wwds_15_tfalblic, AV79Ttrn06wwds_16_tfalblic_sel, lV82Ttrn06wwds_19_tfalbfmd, AV83Ttrn06wwds_20_tfalbfmd_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8DU4 = false ;
         A1253EmprGuiRem = P08DU3_A1253EmprGuiRem[0] ;
         A39AlbProPri = P08DU3_A39AlbProPri[0] ;
         A1244GuiRemCln = P08DU3_A1244GuiRemCln[0] ;
         A10017AlbFmd = P08DU3_A10017AlbFmd[0] ;
         n10017AlbFmd = P08DU3_n10017AlbFmd[0] ;
         A33AlbProEst = P08DU3_A33AlbProEst[0] ;
         A7101AlbLic = P08DU3_A7101AlbLic[0] ;
         A1243GuiRemCli = P08DU3_A1243GuiRemCli[0] ;
         A30AlbProCod = P08DU3_A30AlbProCod[0] ;
         A10765AlbProAT = P08DU3_A10765AlbProAT[0] ;
         A5140AlbMarca = P08DU3_A5140AlbMarca[0] ;
         A34AlbProfch = P08DU3_A34AlbProfch[0] ;
         A396EmprCod = P08DU3_A396EmprCod[0] ;
         A1244GuiRemCln = P08DU3_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV67Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automatico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s/d", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08DU3_A1244GuiRemCln[0], A1244GuiRemCln) == 0 ) )
            {
               brk8DU4 = false ;
               A1253EmprGuiRem = P08DU3_A1253EmprGuiRem[0] ;
               A1243GuiRemCli = P08DU3_A1243GuiRemCli[0] ;
               A30AlbProCod = P08DU3_A30AlbProCod[0] ;
               A396EmprCod = P08DU3_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk8DU4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A1244GuiRemCln)==0) )
            {
               AV28Option = A1244GuiRemCln ;
               AV29Options.add(AV28Option, 0);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV29Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8DU4 )
         {
            brk8DU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBLICOPTIONS' Routine */
      returnInSub = false ;
      AV20TFAlbLic = AV24SearchTxt ;
      AV21TFAlbLic_Sel = "" ;
      AV64Ttrn06wwds_1_albpropri = AV46AlbProPri ;
      AV65Ttrn06wwds_2_albprofch = AV42AlbProFch ;
      AV66Ttrn06wwds_3_albprofch_to = AV43AlbProFch_To ;
      AV67Ttrn06wwds_4_filterfulltext = AV59FilterFullText ;
      AV68Ttrn06wwds_5_tfalbprocod = AV10TFAlbProCod ;
      AV69Ttrn06wwds_6_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV70Ttrn06wwds_7_tfalbpropri = AV47TFAlbProPri ;
      AV71Ttrn06wwds_8_tfalbpropri_sel = AV48TFAlbProPri_Sel ;
      AV72Ttrn06wwds_9_tfalbprofch = AV12TFAlbProfch ;
      AV73Ttrn06wwds_10_tfguiremcli = AV14TFGuiRemCli ;
      AV74Ttrn06wwds_11_tfguiremcli_to = AV15TFGuiRemCli_To ;
      AV75Ttrn06wwds_12_tfguiremcln = AV16TFGuiRemCln ;
      AV76Ttrn06wwds_13_tfguiremcln_sel = AV17TFGuiRemCln_Sel ;
      AV77Ttrn06wwds_14_tfalbmarca_sels = AV58TFAlbMarca_Sels ;
      AV78Ttrn06wwds_15_tfalblic = AV20TFAlbLic ;
      AV79Ttrn06wwds_16_tfalblic_sel = AV21TFAlbLic_Sel ;
      AV80Ttrn06wwds_17_tfalbproat_sels = AV45TFAlbProAT_Sels ;
      AV81Ttrn06wwds_18_tfalbproest_sels = AV52TFAlbProEst_Sels ;
      AV82Ttrn06wwds_19_tfalbfmd = AV53TFAlbFmd ;
      AV83Ttrn06wwds_20_tfalbfmd_sel = AV54TFAlbFmd_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A5140AlbMarca ,
                                           AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                           A10765AlbProAT ,
                                           AV80Ttrn06wwds_17_tfalbproat_sels ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV81Ttrn06wwds_18_tfalbproest_sels ,
                                           AV65Ttrn06wwds_2_albprofch ,
                                           AV66Ttrn06wwds_3_albprofch_to ,
                                           Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod) ,
                                           Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to) ,
                                           AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                           AV70Ttrn06wwds_7_tfalbpropri ,
                                           AV72Ttrn06wwds_9_tfalbprofch ,
                                           Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli) ,
                                           Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to) ,
                                           AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                           AV75Ttrn06wwds_12_tfguiremcln ,
                                           Integer.valueOf(AV77Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                           AV79Ttrn06wwds_16_tfalblic_sel ,
                                           AV78Ttrn06wwds_15_tfalblic ,
                                           Integer.valueOf(AV80Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                           Integer.valueOf(AV81Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                           AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                           AV82Ttrn06wwds_19_tfalbfmd ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A10017AlbFmd ,
                                           AV67Ttrn06wwds_4_filterfulltext ,
                                           AV64Ttrn06wwds_1_albpropri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV70Ttrn06wwds_7_tfalbpropri), 1, "%") ;
      lV75Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV75Ttrn06wwds_12_tfguiremcln), 30, "%") ;
      lV78Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV78Ttrn06wwds_15_tfalblic), 20, "%") ;
      lV82Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV82Ttrn06wwds_19_tfalbfmd), "%", "") ;
      /* Using cursor P08DU4 */
      pr_default.execute(2, new Object[] {AV64Ttrn06wwds_1_albpropri, AV65Ttrn06wwds_2_albprofch, AV66Ttrn06wwds_3_albprofch_to, Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to), lV70Ttrn06wwds_7_tfalbpropri, AV71Ttrn06wwds_8_tfalbpropri_sel, AV72Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to), lV75Ttrn06wwds_12_tfguiremcln, AV76Ttrn06wwds_13_tfguiremcln_sel, lV78Ttrn06wwds_15_tfalblic, AV79Ttrn06wwds_16_tfalblic_sel, lV82Ttrn06wwds_19_tfalbfmd, AV83Ttrn06wwds_20_tfalbfmd_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8DU6 = false ;
         A1253EmprGuiRem = P08DU4_A1253EmprGuiRem[0] ;
         A39AlbProPri = P08DU4_A39AlbProPri[0] ;
         A7101AlbLic = P08DU4_A7101AlbLic[0] ;
         A10017AlbFmd = P08DU4_A10017AlbFmd[0] ;
         n10017AlbFmd = P08DU4_n10017AlbFmd[0] ;
         A33AlbProEst = P08DU4_A33AlbProEst[0] ;
         A1244GuiRemCln = P08DU4_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08DU4_A1243GuiRemCli[0] ;
         A30AlbProCod = P08DU4_A30AlbProCod[0] ;
         A10765AlbProAT = P08DU4_A10765AlbProAT[0] ;
         A5140AlbMarca = P08DU4_A5140AlbMarca[0] ;
         A34AlbProfch = P08DU4_A34AlbProfch[0] ;
         A396EmprCod = P08DU4_A396EmprCod[0] ;
         A1244GuiRemCln = P08DU4_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV67Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automatico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s/d", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08DU4_A7101AlbLic[0], A7101AlbLic) == 0 ) )
            {
               brk8DU6 = false ;
               A30AlbProCod = P08DU4_A30AlbProCod[0] ;
               A396EmprCod = P08DU4_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk8DU6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A7101AlbLic)==0) )
            {
               AV28Option = A7101AlbLic ;
               AV29Options.add(AV28Option, 0);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV29Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8DU6 )
         {
            brk8DU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBFMDOPTIONS' Routine */
      returnInSub = false ;
      AV53TFAlbFmd = AV24SearchTxt ;
      AV54TFAlbFmd_Sel = "" ;
      AV64Ttrn06wwds_1_albpropri = AV46AlbProPri ;
      AV65Ttrn06wwds_2_albprofch = AV42AlbProFch ;
      AV66Ttrn06wwds_3_albprofch_to = AV43AlbProFch_To ;
      AV67Ttrn06wwds_4_filterfulltext = AV59FilterFullText ;
      AV68Ttrn06wwds_5_tfalbprocod = AV10TFAlbProCod ;
      AV69Ttrn06wwds_6_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV70Ttrn06wwds_7_tfalbpropri = AV47TFAlbProPri ;
      AV71Ttrn06wwds_8_tfalbpropri_sel = AV48TFAlbProPri_Sel ;
      AV72Ttrn06wwds_9_tfalbprofch = AV12TFAlbProfch ;
      AV73Ttrn06wwds_10_tfguiremcli = AV14TFGuiRemCli ;
      AV74Ttrn06wwds_11_tfguiremcli_to = AV15TFGuiRemCli_To ;
      AV75Ttrn06wwds_12_tfguiremcln = AV16TFGuiRemCln ;
      AV76Ttrn06wwds_13_tfguiremcln_sel = AV17TFGuiRemCln_Sel ;
      AV77Ttrn06wwds_14_tfalbmarca_sels = AV58TFAlbMarca_Sels ;
      AV78Ttrn06wwds_15_tfalblic = AV20TFAlbLic ;
      AV79Ttrn06wwds_16_tfalblic_sel = AV21TFAlbLic_Sel ;
      AV80Ttrn06wwds_17_tfalbproat_sels = AV45TFAlbProAT_Sels ;
      AV81Ttrn06wwds_18_tfalbproest_sels = AV52TFAlbProEst_Sels ;
      AV82Ttrn06wwds_19_tfalbfmd = AV53TFAlbFmd ;
      AV83Ttrn06wwds_20_tfalbfmd_sel = AV54TFAlbFmd_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A5140AlbMarca ,
                                           AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                           A10765AlbProAT ,
                                           AV80Ttrn06wwds_17_tfalbproat_sels ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV81Ttrn06wwds_18_tfalbproest_sels ,
                                           AV65Ttrn06wwds_2_albprofch ,
                                           AV66Ttrn06wwds_3_albprofch_to ,
                                           Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod) ,
                                           Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to) ,
                                           AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                           AV70Ttrn06wwds_7_tfalbpropri ,
                                           AV72Ttrn06wwds_9_tfalbprofch ,
                                           Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli) ,
                                           Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to) ,
                                           AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                           AV75Ttrn06wwds_12_tfguiremcln ,
                                           Integer.valueOf(AV77Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                           AV79Ttrn06wwds_16_tfalblic_sel ,
                                           AV78Ttrn06wwds_15_tfalblic ,
                                           Integer.valueOf(AV80Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                           Integer.valueOf(AV81Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                           AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                           AV82Ttrn06wwds_19_tfalbfmd ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A10017AlbFmd ,
                                           AV67Ttrn06wwds_4_filterfulltext ,
                                           AV64Ttrn06wwds_1_albpropri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV70Ttrn06wwds_7_tfalbpropri), 1, "%") ;
      lV75Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV75Ttrn06wwds_12_tfguiremcln), 30, "%") ;
      lV78Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV78Ttrn06wwds_15_tfalblic), 20, "%") ;
      lV82Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV82Ttrn06wwds_19_tfalbfmd), "%", "") ;
      /* Using cursor P08DU5 */
      pr_default.execute(3, new Object[] {AV64Ttrn06wwds_1_albpropri, AV65Ttrn06wwds_2_albprofch, AV66Ttrn06wwds_3_albprofch_to, Long.valueOf(AV68Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV69Ttrn06wwds_6_tfalbprocod_to), lV70Ttrn06wwds_7_tfalbpropri, AV71Ttrn06wwds_8_tfalbpropri_sel, AV72Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV73Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV74Ttrn06wwds_11_tfguiremcli_to), lV75Ttrn06wwds_12_tfguiremcln, AV76Ttrn06wwds_13_tfguiremcln_sel, lV78Ttrn06wwds_15_tfalblic, AV79Ttrn06wwds_16_tfalblic_sel, lV82Ttrn06wwds_19_tfalbfmd, AV83Ttrn06wwds_20_tfalbfmd_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8DU8 = false ;
         A1253EmprGuiRem = P08DU5_A1253EmprGuiRem[0] ;
         A39AlbProPri = P08DU5_A39AlbProPri[0] ;
         A10017AlbFmd = P08DU5_A10017AlbFmd[0] ;
         n10017AlbFmd = P08DU5_n10017AlbFmd[0] ;
         A33AlbProEst = P08DU5_A33AlbProEst[0] ;
         A7101AlbLic = P08DU5_A7101AlbLic[0] ;
         A1244GuiRemCln = P08DU5_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08DU5_A1243GuiRemCli[0] ;
         A30AlbProCod = P08DU5_A30AlbProCod[0] ;
         A10765AlbProAT = P08DU5_A10765AlbProAT[0] ;
         A5140AlbMarca = P08DU5_A5140AlbMarca[0] ;
         A34AlbProfch = P08DU5_A34AlbProfch[0] ;
         A396EmprCod = P08DU5_A396EmprCod[0] ;
         A1244GuiRemCln = P08DU5_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV67Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automatico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s/d", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV67Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV67Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08DU5_A10017AlbFmd[0], A10017AlbFmd) == 0 ) )
            {
               brk8DU8 = false ;
               A30AlbProCod = P08DU5_A30AlbProCod[0] ;
               A396EmprCod = P08DU5_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk8DU8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A10017AlbFmd)==0) )
            {
               AV28Option = A10017AlbFmd ;
               AV29Options.add(AV28Option, 0);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV29Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8DU8 )
         {
            brk8DU8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrn06wwgetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = ttrn06wwgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = ttrn06wwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46AlbProPri = "" ;
      AV42AlbProFch = GXutil.nullDate() ;
      AV43AlbProFch_To = GXutil.nullDate() ;
      AV59FilterFullText = "" ;
      AV47TFAlbProPri = "" ;
      AV48TFAlbProPri_Sel = "" ;
      AV12TFAlbProfch = GXutil.nullDate() ;
      AV16TFGuiRemCln = "" ;
      AV17TFGuiRemCln_Sel = "" ;
      AV57TFAlbMarca_SelsJson = "" ;
      AV58TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20TFAlbLic = "" ;
      AV21TFAlbLic_Sel = "" ;
      AV44TFAlbProAT_SelsJson = "" ;
      AV45TFAlbProAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV51TFAlbProEst_SelsJson = "" ;
      AV52TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV53TFAlbFmd = "" ;
      AV54TFAlbFmd_Sel = "" ;
      A39AlbProPri = "" ;
      AV64Ttrn06wwds_1_albpropri = "" ;
      AV65Ttrn06wwds_2_albprofch = GXutil.nullDate() ;
      AV66Ttrn06wwds_3_albprofch_to = GXutil.nullDate() ;
      AV67Ttrn06wwds_4_filterfulltext = "" ;
      AV70Ttrn06wwds_7_tfalbpropri = "" ;
      AV71Ttrn06wwds_8_tfalbpropri_sel = "" ;
      AV72Ttrn06wwds_9_tfalbprofch = GXutil.nullDate() ;
      AV75Ttrn06wwds_12_tfguiremcln = "" ;
      AV76Ttrn06wwds_13_tfguiremcln_sel = "" ;
      AV77Ttrn06wwds_14_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV78Ttrn06wwds_15_tfalblic = "" ;
      AV79Ttrn06wwds_16_tfalblic_sel = "" ;
      AV80Ttrn06wwds_17_tfalbproat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV81Ttrn06wwds_18_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV82Ttrn06wwds_19_tfalbfmd = "" ;
      AV83Ttrn06wwds_20_tfalbfmd_sel = "" ;
      lV67Ttrn06wwds_4_filterfulltext = "" ;
      scmdbuf = "" ;
      lV70Ttrn06wwds_7_tfalbpropri = "" ;
      lV75Ttrn06wwds_12_tfguiremcln = "" ;
      lV78Ttrn06wwds_15_tfalblic = "" ;
      lV82Ttrn06wwds_19_tfalbfmd = "" ;
      A5140AlbMarca = "" ;
      A10765AlbProAT = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A7101AlbLic = "" ;
      A10017AlbFmd = "" ;
      P08DU2_A1253EmprGuiRem = new String[] {""} ;
      P08DU2_A39AlbProPri = new String[] {""} ;
      P08DU2_A10017AlbFmd = new String[] {""} ;
      P08DU2_n10017AlbFmd = new boolean[] {false} ;
      P08DU2_A33AlbProEst = new byte[1] ;
      P08DU2_A7101AlbLic = new String[] {""} ;
      P08DU2_A1244GuiRemCln = new String[] {""} ;
      P08DU2_A1243GuiRemCli = new int[1] ;
      P08DU2_A30AlbProCod = new long[1] ;
      P08DU2_A10765AlbProAT = new String[] {""} ;
      P08DU2_A5140AlbMarca = new String[] {""} ;
      P08DU2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DU2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      AV28Option = "" ;
      AV31OptionDesc = "" ;
      P08DU3_A1253EmprGuiRem = new String[] {""} ;
      P08DU3_A39AlbProPri = new String[] {""} ;
      P08DU3_A1244GuiRemCln = new String[] {""} ;
      P08DU3_A10017AlbFmd = new String[] {""} ;
      P08DU3_n10017AlbFmd = new boolean[] {false} ;
      P08DU3_A33AlbProEst = new byte[1] ;
      P08DU3_A7101AlbLic = new String[] {""} ;
      P08DU3_A1243GuiRemCli = new int[1] ;
      P08DU3_A30AlbProCod = new long[1] ;
      P08DU3_A10765AlbProAT = new String[] {""} ;
      P08DU3_A5140AlbMarca = new String[] {""} ;
      P08DU3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DU3_A396EmprCod = new String[] {""} ;
      P08DU4_A1253EmprGuiRem = new String[] {""} ;
      P08DU4_A39AlbProPri = new String[] {""} ;
      P08DU4_A7101AlbLic = new String[] {""} ;
      P08DU4_A10017AlbFmd = new String[] {""} ;
      P08DU4_n10017AlbFmd = new boolean[] {false} ;
      P08DU4_A33AlbProEst = new byte[1] ;
      P08DU4_A1244GuiRemCln = new String[] {""} ;
      P08DU4_A1243GuiRemCli = new int[1] ;
      P08DU4_A30AlbProCod = new long[1] ;
      P08DU4_A10765AlbProAT = new String[] {""} ;
      P08DU4_A5140AlbMarca = new String[] {""} ;
      P08DU4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DU4_A396EmprCod = new String[] {""} ;
      P08DU5_A1253EmprGuiRem = new String[] {""} ;
      P08DU5_A39AlbProPri = new String[] {""} ;
      P08DU5_A10017AlbFmd = new String[] {""} ;
      P08DU5_n10017AlbFmd = new boolean[] {false} ;
      P08DU5_A33AlbProEst = new byte[1] ;
      P08DU5_A7101AlbLic = new String[] {""} ;
      P08DU5_A1244GuiRemCln = new String[] {""} ;
      P08DU5_A1243GuiRemCli = new int[1] ;
      P08DU5_A30AlbProCod = new long[1] ;
      P08DU5_A10765AlbProAT = new String[] {""} ;
      P08DU5_A5140AlbMarca = new String[] {""} ;
      P08DU5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DU5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08DU2_A1253EmprGuiRem, P08DU2_A39AlbProPri, P08DU2_A10017AlbFmd, P08DU2_n10017AlbFmd, P08DU2_A33AlbProEst, P08DU2_A7101AlbLic, P08DU2_A1244GuiRemCln, P08DU2_A1243GuiRemCli, P08DU2_A30AlbProCod, P08DU2_A10765AlbProAT,
            P08DU2_A5140AlbMarca, P08DU2_A34AlbProfch, P08DU2_A396EmprCod
            }
            , new Object[] {
            P08DU3_A1253EmprGuiRem, P08DU3_A39AlbProPri, P08DU3_A1244GuiRemCln, P08DU3_A10017AlbFmd, P08DU3_n10017AlbFmd, P08DU3_A33AlbProEst, P08DU3_A7101AlbLic, P08DU3_A1243GuiRemCli, P08DU3_A30AlbProCod, P08DU3_A10765AlbProAT,
            P08DU3_A5140AlbMarca, P08DU3_A34AlbProfch, P08DU3_A396EmprCod
            }
            , new Object[] {
            P08DU4_A1253EmprGuiRem, P08DU4_A39AlbProPri, P08DU4_A7101AlbLic, P08DU4_A10017AlbFmd, P08DU4_n10017AlbFmd, P08DU4_A33AlbProEst, P08DU4_A1244GuiRemCln, P08DU4_A1243GuiRemCli, P08DU4_A30AlbProCod, P08DU4_A10765AlbProAT,
            P08DU4_A5140AlbMarca, P08DU4_A34AlbProfch, P08DU4_A396EmprCod
            }
            , new Object[] {
            P08DU5_A1253EmprGuiRem, P08DU5_A39AlbProPri, P08DU5_A10017AlbFmd, P08DU5_n10017AlbFmd, P08DU5_A33AlbProEst, P08DU5_A7101AlbLic, P08DU5_A1244GuiRemCln, P08DU5_A1243GuiRemCli, P08DU5_A30AlbProCod, P08DU5_A10765AlbProAT,
            P08DU5_A5140AlbMarca, P08DU5_A34AlbProfch, P08DU5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private short Gx_err ;
   private int AV62GXV1 ;
   private int AV14TFGuiRemCli ;
   private int AV15TFGuiRemCli_To ;
   private int AV73Ttrn06wwds_10_tfguiremcli ;
   private int AV74Ttrn06wwds_11_tfguiremcli_to ;
   private int AV77Ttrn06wwds_14_tfalbmarca_sels_size ;
   private int AV80Ttrn06wwds_17_tfalbproat_sels_size ;
   private int AV81Ttrn06wwds_18_tfalbproest_sels_size ;
   private int A1243GuiRemCli ;
   private long AV10TFAlbProCod ;
   private long AV11TFAlbProCod_To ;
   private long AV68Ttrn06wwds_5_tfalbprocod ;
   private long AV69Ttrn06wwds_6_tfalbprocod_to ;
   private long A30AlbProCod ;
   private long AV36count ;
   private String AV46AlbProPri ;
   private String AV47TFAlbProPri ;
   private String AV48TFAlbProPri_Sel ;
   private String AV16TFGuiRemCln ;
   private String AV17TFGuiRemCln_Sel ;
   private String AV20TFAlbLic ;
   private String AV21TFAlbLic_Sel ;
   private String A39AlbProPri ;
   private String AV64Ttrn06wwds_1_albpropri ;
   private String AV70Ttrn06wwds_7_tfalbpropri ;
   private String AV71Ttrn06wwds_8_tfalbpropri_sel ;
   private String AV75Ttrn06wwds_12_tfguiremcln ;
   private String AV76Ttrn06wwds_13_tfguiremcln_sel ;
   private String AV78Ttrn06wwds_15_tfalblic ;
   private String AV79Ttrn06wwds_16_tfalblic_sel ;
   private String scmdbuf ;
   private String lV70Ttrn06wwds_7_tfalbpropri ;
   private String lV75Ttrn06wwds_12_tfguiremcln ;
   private String lV78Ttrn06wwds_15_tfalblic ;
   private String A5140AlbMarca ;
   private String A10765AlbProAT ;
   private String A1244GuiRemCln ;
   private String A7101AlbLic ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private java.util.Date AV42AlbProFch ;
   private java.util.Date AV43AlbProFch_To ;
   private java.util.Date AV12TFAlbProfch ;
   private java.util.Date AV65Ttrn06wwds_2_albprofch ;
   private java.util.Date AV66Ttrn06wwds_3_albprofch_to ;
   private java.util.Date AV72Ttrn06wwds_9_tfalbprofch ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean brk8DU2 ;
   private boolean n10017AlbFmd ;
   private boolean brk8DU4 ;
   private boolean brk8DU6 ;
   private boolean brk8DU8 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV57TFAlbMarca_SelsJson ;
   private String AV44TFAlbProAT_SelsJson ;
   private String AV51TFAlbProEst_SelsJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV59FilterFullText ;
   private String AV53TFAlbFmd ;
   private String AV54TFAlbFmd_Sel ;
   private String AV67Ttrn06wwds_4_filterfulltext ;
   private String AV82Ttrn06wwds_19_tfalbfmd ;
   private String AV83Ttrn06wwds_20_tfalbfmd_sel ;
   private String lV67Ttrn06wwds_4_filterfulltext ;
   private String lV82Ttrn06wwds_19_tfalbfmd ;
   private String A10017AlbFmd ;
   private String AV28Option ;
   private String AV31OptionDesc ;
   private GXSimpleCollection<Byte> AV52TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV81Ttrn06wwds_18_tfalbproest_sels ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08DU2_A1253EmprGuiRem ;
   private String[] P08DU2_A39AlbProPri ;
   private String[] P08DU2_A10017AlbFmd ;
   private boolean[] P08DU2_n10017AlbFmd ;
   private byte[] P08DU2_A33AlbProEst ;
   private String[] P08DU2_A7101AlbLic ;
   private String[] P08DU2_A1244GuiRemCln ;
   private int[] P08DU2_A1243GuiRemCli ;
   private long[] P08DU2_A30AlbProCod ;
   private String[] P08DU2_A10765AlbProAT ;
   private String[] P08DU2_A5140AlbMarca ;
   private java.util.Date[] P08DU2_A34AlbProfch ;
   private String[] P08DU2_A396EmprCod ;
   private String[] P08DU3_A1253EmprGuiRem ;
   private String[] P08DU3_A39AlbProPri ;
   private String[] P08DU3_A1244GuiRemCln ;
   private String[] P08DU3_A10017AlbFmd ;
   private boolean[] P08DU3_n10017AlbFmd ;
   private byte[] P08DU3_A33AlbProEst ;
   private String[] P08DU3_A7101AlbLic ;
   private int[] P08DU3_A1243GuiRemCli ;
   private long[] P08DU3_A30AlbProCod ;
   private String[] P08DU3_A10765AlbProAT ;
   private String[] P08DU3_A5140AlbMarca ;
   private java.util.Date[] P08DU3_A34AlbProfch ;
   private String[] P08DU3_A396EmprCod ;
   private String[] P08DU4_A1253EmprGuiRem ;
   private String[] P08DU4_A39AlbProPri ;
   private String[] P08DU4_A7101AlbLic ;
   private String[] P08DU4_A10017AlbFmd ;
   private boolean[] P08DU4_n10017AlbFmd ;
   private byte[] P08DU4_A33AlbProEst ;
   private String[] P08DU4_A1244GuiRemCln ;
   private int[] P08DU4_A1243GuiRemCli ;
   private long[] P08DU4_A30AlbProCod ;
   private String[] P08DU4_A10765AlbProAT ;
   private String[] P08DU4_A5140AlbMarca ;
   private java.util.Date[] P08DU4_A34AlbProfch ;
   private String[] P08DU4_A396EmprCod ;
   private String[] P08DU5_A1253EmprGuiRem ;
   private String[] P08DU5_A39AlbProPri ;
   private String[] P08DU5_A10017AlbFmd ;
   private boolean[] P08DU5_n10017AlbFmd ;
   private byte[] P08DU5_A33AlbProEst ;
   private String[] P08DU5_A7101AlbLic ;
   private String[] P08DU5_A1244GuiRemCln ;
   private int[] P08DU5_A1243GuiRemCli ;
   private long[] P08DU5_A30AlbProCod ;
   private String[] P08DU5_A10765AlbProAT ;
   private String[] P08DU5_A5140AlbMarca ;
   private java.util.Date[] P08DU5_A34AlbProfch ;
   private String[] P08DU5_A396EmprCod ;
   private GXSimpleCollection<String> AV58TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV45TFAlbProAT_Sels ;
   private GXSimpleCollection<String> AV77Ttrn06wwds_14_tfalbmarca_sels ;
   private GXSimpleCollection<String> AV80Ttrn06wwds_17_tfalbproat_sels ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class ttrn06wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV80Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV81Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV65Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV66Ttrn06wwds_3_albprofch_to ,
                                          long AV68Ttrn06wwds_5_tfalbprocod ,
                                          long AV69Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV70Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV72Ttrn06wwds_9_tfalbprofch ,
                                          int AV73Ttrn06wwds_10_tfguiremcli ,
                                          int AV74Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV75Ttrn06wwds_12_tfguiremcln ,
                                          int AV77Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV79Ttrn06wwds_16_tfalblic_sel ,
                                          String AV78Ttrn06wwds_15_tfalblic ,
                                          int AV80Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV81Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV82Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          String AV67Ttrn06wwds_4_filterfulltext ,
                                          String AV64Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProPri, T1.AlbFmd, T1.AlbProEst, T1.AlbLic, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbProAT," ;
      scmdbuf += " T1.AlbMarca, T1.AlbProfch, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV68Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV70Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV75Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV77Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV77Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV78Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV80Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV81Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV82Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbProPri" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08DU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV80Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV81Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV65Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV66Ttrn06wwds_3_albprofch_to ,
                                          long AV68Ttrn06wwds_5_tfalbprocod ,
                                          long AV69Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV70Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV72Ttrn06wwds_9_tfalbprofch ,
                                          int AV73Ttrn06wwds_10_tfguiremcli ,
                                          int AV74Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV75Ttrn06wwds_12_tfguiremcln ,
                                          int AV77Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV79Ttrn06wwds_16_tfalblic_sel ,
                                          String AV78Ttrn06wwds_15_tfalblic ,
                                          int AV80Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV81Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV82Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          String AV67Ttrn06wwds_4_filterfulltext ,
                                          String AV64Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[16];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProPri, T2.CliNom AS GuiRemCln, T1.AlbFmd, T1.AlbProEst, T1.AlbLic, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbProAT," ;
      scmdbuf += " T1.AlbMarca, T1.AlbProfch, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV68Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV70Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV75Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( AV77Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV77Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV78Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( AV80Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV81Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV82Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08DU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV80Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV81Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV65Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV66Ttrn06wwds_3_albprofch_to ,
                                          long AV68Ttrn06wwds_5_tfalbprocod ,
                                          long AV69Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV70Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV72Ttrn06wwds_9_tfalbprofch ,
                                          int AV73Ttrn06wwds_10_tfguiremcli ,
                                          int AV74Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV75Ttrn06wwds_12_tfguiremcln ,
                                          int AV77Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV79Ttrn06wwds_16_tfalblic_sel ,
                                          String AV78Ttrn06wwds_15_tfalblic ,
                                          int AV80Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV81Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV82Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          String AV67Ttrn06wwds_4_filterfulltext ,
                                          String AV64Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[16];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProPri, T1.AlbLic, T1.AlbFmd, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbProAT," ;
      scmdbuf += " T1.AlbMarca, T1.AlbProfch, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV68Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV70Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV75Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( AV77Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV77Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV78Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( AV80Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV81Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV82Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbLic" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08DU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV77Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV80Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV81Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV65Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV66Ttrn06wwds_3_albprofch_to ,
                                          long AV68Ttrn06wwds_5_tfalbprocod ,
                                          long AV69Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV71Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV70Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV72Ttrn06wwds_9_tfalbprofch ,
                                          int AV73Ttrn06wwds_10_tfguiremcli ,
                                          int AV74Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV76Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV75Ttrn06wwds_12_tfguiremcln ,
                                          int AV77Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV79Ttrn06wwds_16_tfalblic_sel ,
                                          String AV78Ttrn06wwds_15_tfalblic ,
                                          int AV80Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV81Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV83Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV82Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          String AV67Ttrn06wwds_4_filterfulltext ,
                                          String AV64Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[16];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProPri, T1.AlbFmd, T1.AlbProEst, T1.AlbLic, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbProAT," ;
      scmdbuf += " T1.AlbMarca, T1.AlbProfch, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV68Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV70Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV75Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( AV77Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV77Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV78Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( AV80Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV81Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV82Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbFmd" ;
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
                  return conditional_P08DU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P08DU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_P08DU4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 3 :
                  return conditional_P08DU5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[16], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
      }
   }

}

