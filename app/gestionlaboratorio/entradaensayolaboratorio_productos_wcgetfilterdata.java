package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_productos_wcgetfilterdata extends GXProcedure
{
   public entradaensayolaboratorio_productos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_productos_wcgetfilterdata.class ), "" );
   }

   public entradaensayolaboratorio_productos_wcgetfilterdata( int remoteHandle ,
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
      entradaensayolaboratorio_productos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      entradaensayolaboratorio_productos_wcgetfilterdata.this.AV16DDOName = aP0;
      entradaensayolaboratorio_productos_wcgetfilterdata.this.AV14SearchTxt = aP1;
      entradaensayolaboratorio_productos_wcgetfilterdata.this.AV15SearchTxtTo = aP2;
      entradaensayolaboratorio_productos_wcgetfilterdata.this.aP3 = aP3;
      entradaensayolaboratorio_productos_wcgetfilterdata.this.aP4 = aP4;
      entradaensayolaboratorio_productos_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WCGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WCGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WCGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LINGRU") == 0 )
         {
            AV33TFLb_LinGru = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFLb_LinGru_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV35TFPrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV36TFPrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV37TFPrdNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV38TFPrdNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV39TFValCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFValCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV44Lb_Numero = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_OPCION") == 0 )
         {
            AV45Lb_opcion = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CODGRU") == 0 )
         {
            AV42Lb_CodGru = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPO_P") == 0 )
         {
            AV43Tipo_p = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV35TFPrdNum = AV14SearchTxt ;
      AV36TFPrdNum_Sel = "" ;
      AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV33TFLb_LinGru ;
      AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV34TFLb_LinGru_To ;
      AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV35TFPrdNum ;
      AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV36TFPrdNum_Sel ;
      AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV37TFPrdNom ;
      AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV38TFPrdNom_Sel ;
      AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV39TFValCod ;
      AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV40TFValCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) ,
                                           Short.valueOf(AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) ,
                                           AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                           AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                           AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                           AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                           Byte.valueOf(AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) ,
                                           Byte.valueOf(AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) ,
                                           Short.valueOf(A5615Lb_LinGru) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A856ValCod) ,
                                           A5612Lb_CodGru ,
                                           AV42Lb_CodGru ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum), 6, "%") ;
      lV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom), 26, "%") ;
      /* Using cursor P09PE2 */
      pr_default.execute(0, new Object[] {AV41Emprcod, AV42Lb_CodGru, Short.valueOf(AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru), Short.valueOf(AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to), lV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum, AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel, lV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom, AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel, Byte.valueOf(AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod), Byte.valueOf(AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9PE2 = false ;
         A396EmprCod = P09PE2_A396EmprCod[0] ;
         A719PrdNum = P09PE2_A719PrdNum[0] ;
         A5612Lb_CodGru = P09PE2_A5612Lb_CodGru[0] ;
         A856ValCod = P09PE2_A856ValCod[0] ;
         A718PrdNom = P09PE2_A718PrdNom[0] ;
         A5615Lb_LinGru = P09PE2_A5615Lb_LinGru[0] ;
         A856ValCod = P09PE2_A856ValCod[0] ;
         A718PrdNom = P09PE2_A718PrdNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09PE2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09PE2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9PE2 = false ;
            A5612Lb_CodGru = P09PE2_A5612Lb_CodGru[0] ;
            A5615Lb_LinGru = P09PE2_A5615Lb_LinGru[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9PE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV18Option = A719PrdNum ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9PE2 )
         {
            brk9PE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV37TFPrdNom = AV14SearchTxt ;
      AV38TFPrdNom_Sel = "" ;
      AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV33TFLb_LinGru ;
      AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV34TFLb_LinGru_To ;
      AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV35TFPrdNum ;
      AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV36TFPrdNum_Sel ;
      AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV37TFPrdNom ;
      AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV38TFPrdNom_Sel ;
      AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV39TFValCod ;
      AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV40TFValCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) ,
                                           Short.valueOf(AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) ,
                                           AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                           AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                           AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                           AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                           Byte.valueOf(AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) ,
                                           Byte.valueOf(AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) ,
                                           Short.valueOf(A5615Lb_LinGru) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A856ValCod) ,
                                           A5612Lb_CodGru ,
                                           AV42Lb_CodGru ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum), 6, "%") ;
      lV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom), 26, "%") ;
      /* Using cursor P09PE3 */
      pr_default.execute(1, new Object[] {AV41Emprcod, AV42Lb_CodGru, Short.valueOf(AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru), Short.valueOf(AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to), lV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum, AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel, lV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom, AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel, Byte.valueOf(AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod), Byte.valueOf(AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9PE4 = false ;
         A719PrdNum = P09PE3_A719PrdNum[0] ;
         A396EmprCod = P09PE3_A396EmprCod[0] ;
         A5612Lb_CodGru = P09PE3_A5612Lb_CodGru[0] ;
         A856ValCod = P09PE3_A856ValCod[0] ;
         A718PrdNom = P09PE3_A718PrdNom[0] ;
         A5615Lb_LinGru = P09PE3_A5615Lb_LinGru[0] ;
         A856ValCod = P09PE3_A856ValCod[0] ;
         A718PrdNom = P09PE3_A718PrdNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09PE3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09PE3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9PE4 = false ;
            A5612Lb_CodGru = P09PE3_A5612Lb_CodGru[0] ;
            A5615Lb_LinGru = P09PE3_A5615Lb_LinGru[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9PE4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV18Option = A718PrdNom ;
            AV17InsertIndex = 1 ;
            while ( ( AV17InsertIndex <= AV19Options.size() ) && ( GXutil.strcmp((String)AV19Options.elementAt(-1+AV17InsertIndex), AV18Option) < 0 ) )
            {
               AV17InsertIndex = (int)(AV17InsertIndex+1) ;
            }
            AV19Options.add(AV18Option, AV17InsertIndex);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV17InsertIndex);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9PE4 )
         {
            brk9PE4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradaensayolaboratorio_productos_wcgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = entradaensayolaboratorio_productos_wcgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = entradaensayolaboratorio_productos_wcgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35TFPrdNum = "" ;
      AV36TFPrdNum_Sel = "" ;
      AV37TFPrdNom = "" ;
      AV38TFPrdNom_Sel = "" ;
      AV41Emprcod = "" ;
      AV45Lb_opcion = "" ;
      AV42Lb_CodGru = "" ;
      AV43Tipo_p = "" ;
      A719PrdNum = "" ;
      AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = "" ;
      AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = "" ;
      AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = "" ;
      AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = "" ;
      lV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = "" ;
      A718PrdNom = "" ;
      A5612Lb_CodGru = "" ;
      A396EmprCod = "" ;
      P09PE2_A396EmprCod = new String[] {""} ;
      P09PE2_A719PrdNum = new String[] {""} ;
      P09PE2_A5612Lb_CodGru = new String[] {""} ;
      P09PE2_A856ValCod = new byte[1] ;
      P09PE2_A718PrdNom = new String[] {""} ;
      P09PE2_A5615Lb_LinGru = new short[1] ;
      AV18Option = "" ;
      P09PE3_A719PrdNum = new String[] {""} ;
      P09PE3_A396EmprCod = new String[] {""} ;
      P09PE3_A5612Lb_CodGru = new String[] {""} ;
      P09PE3_A856ValCod = new byte[1] ;
      P09PE3_A718PrdNom = new String[] {""} ;
      P09PE3_A5615Lb_LinGru = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09PE2_A396EmprCod, P09PE2_A719PrdNum, P09PE2_A5612Lb_CodGru, P09PE2_A856ValCod, P09PE2_A718PrdNom, P09PE2_A5615Lb_LinGru
            }
            , new Object[] {
            P09PE3_A719PrdNum, P09PE3_A396EmprCod, P09PE3_A5612Lb_CodGru, P09PE3_A856ValCod, P09PE3_A718PrdNom, P09PE3_A5615Lb_LinGru
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV39TFValCod ;
   private byte AV40TFValCod_To ;
   private byte AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod ;
   private byte AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to ;
   private byte A856ValCod ;
   private short AV33TFLb_LinGru ;
   private short AV34TFLb_LinGru_To ;
   private short AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru ;
   private short AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to ;
   private short A5615Lb_LinGru ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private int AV44Lb_Numero ;
   private int AV17InsertIndex ;
   private long AV26count ;
   private String AV35TFPrdNum ;
   private String AV36TFPrdNum_Sel ;
   private String AV37TFPrdNom ;
   private String AV38TFPrdNom_Sel ;
   private String AV41Emprcod ;
   private String AV45Lb_opcion ;
   private String AV42Lb_CodGru ;
   private String AV43Tipo_p ;
   private String A719PrdNum ;
   private String AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ;
   private String AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ;
   private String AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ;
   private String AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ;
   private String lV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ;
   private String A718PrdNom ;
   private String A5612Lb_CodGru ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9PE2 ;
   private boolean brk9PE4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PE2_A396EmprCod ;
   private String[] P09PE2_A719PrdNum ;
   private String[] P09PE2_A5612Lb_CodGru ;
   private byte[] P09PE2_A856ValCod ;
   private String[] P09PE2_A718PrdNom ;
   private short[] P09PE2_A5615Lb_LinGru ;
   private String[] P09PE3_A719PrdNum ;
   private String[] P09PE3_A396EmprCod ;
   private String[] P09PE3_A5612Lb_CodGru ;
   private byte[] P09PE3_A856ValCod ;
   private String[] P09PE3_A718PrdNom ;
   private short[] P09PE3_A5615Lb_LinGru ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class entradaensayolaboratorio_productos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru ,
                                          short AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to ,
                                          String AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                          String AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                          String AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                          String AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                          byte AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod ,
                                          byte AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to ,
                                          short A5615Lb_LinGru ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A856ValCod ,
                                          String A5612Lb_CodGru ,
                                          String AV42Lb_CodGru ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.Lb_CodGru, T2.ValCod, T2.PrdNom, T1.Lb_LinGru FROM (TXPENSPR1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum" ;
      scmdbuf += " = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_CodGru = ?)");
      if ( ! (0==AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) )
      {
         addWhere(sWhereString, "(T2.ValCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T2.ValCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09PE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru ,
                                          short AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to ,
                                          String AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                          String AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                          String AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                          String AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                          byte AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod ,
                                          byte AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to ,
                                          short A5615Lb_LinGru ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A856ValCod ,
                                          String A5612Lb_CodGru ,
                                          String AV42Lb_CodGru ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.Lb_CodGru, T2.ValCod, T2.PrdNom, T1.Lb_LinGru FROM (TXPENSPR1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum" ;
      scmdbuf += " = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_CodGru = ?)");
      if ( ! (0==AV50Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) )
      {
         addWhere(sWhereString, "(T2.ValCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T2.ValCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
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
                  return conditional_P09PE2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P09PE3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               return;
      }
   }

}

