package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wc_repuestocompatiblegetfilterdata extends GXProcedure
{
   public wc_repuestocompatiblegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wc_repuestocompatiblegetfilterdata.class ), "" );
   }

   public wc_repuestocompatiblegetfilterdata( int remoteHandle ,
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
      wc_repuestocompatiblegetfilterdata.this.aP5 = new String[] {""};
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
      wc_repuestocompatiblegetfilterdata.this.AV16DDOName = aP0;
      wc_repuestocompatiblegetfilterdata.this.AV14SearchTxt = aP1;
      wc_repuestocompatiblegetfilterdata.this.AV15SearchTxtTo = aP2;
      wc_repuestocompatiblegetfilterdata.this.aP3 = aP3;
      wc_repuestocompatiblegetfilterdata.this.aP4 = aP4;
      wc_repuestocompatiblegetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_MRCOMNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMRCOMNOMOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("MantenimientoMaquina.WC_RepuestoCompatibleGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WC_RepuestoCompatibleGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("MantenimientoMaquina.WC_RepuestoCompatibleGridState"), null, null);
      }
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV38GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM") == 0 )
         {
            AV10TFMRComNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM_SEL") == 0 )
         {
            AV11TFMRComNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMCOD") == 0 )
         {
            AV12TFMRComCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFMRComCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV33EmprCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRICOD") == 0 )
         {
            AV34MRPriCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRINOM") == 0 )
         {
            AV35MRPriNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMRCOMNOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMRComNom = AV14SearchTxt ;
      AV11TFMRComNom_Sel = "" ;
      AV40Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod = AV33EmprCod ;
      AV41Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod = AV34MRPriCod ;
      AV42Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom = AV35MRPriNom ;
      AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = AV32FilterFullText ;
      AV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = AV10TFMRComNom ;
      AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel = AV11TFMRComNom_Sel ;
      AV46Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod = AV12TFMRComCod ;
      AV47Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to = AV13TFMRComCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ,
                                           AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                           AV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ,
                                           Integer.valueOf(AV46Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod) ,
                                           Integer.valueOf(AV47Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to) ,
                                           A1064MRComNom ,
                                           Integer.valueOf(A1063MRComCod) ,
                                           AV40Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod ,
                                           Integer.valueOf(AV41Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod) ,
                                           AV42Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A1061MRPriCod) ,
                                           A1062MRPriNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = GXutil.padr( GXutil.rtrim( AV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom), 100, "%") ;
      /* Using cursor P08VR2 */
      pr_default.execute(0, new Object[] {AV40Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod, Integer.valueOf(AV41Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod), AV42Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom, lV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext, lV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext, lV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom, AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel, Integer.valueOf(AV46Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod), Integer.valueOf(AV47Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8VR2 = false ;
         A396EmprCod = P08VR2_A396EmprCod[0] ;
         A1061MRPriCod = P08VR2_A1061MRPriCod[0] ;
         A1062MRPriNom = P08VR2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VR2_n1062MRPriNom[0] ;
         A1063MRComCod = P08VR2_A1063MRComCod[0] ;
         A1064MRComNom = P08VR2_A1064MRComNom[0] ;
         n1064MRComNom = P08VR2_n1064MRComNom[0] ;
         A1062MRPriNom = P08VR2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VR2_n1062MRPriNom[0] ;
         A1064MRComNom = P08VR2_A1064MRComNom[0] ;
         n1064MRComNom = P08VR2_n1064MRComNom[0] ;
         W1062MRPriNom = A1062MRPriNom ;
         n1062MRPriNom = false ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08VR2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08VR2_A1061MRPriCod[0] == A1061MRPriCod ) && ( GXutil.strcmp(P08VR2_A1062MRPriNom[0], A1062MRPriNom) == 0 ) && ( P08VR2_A1063MRComCod[0] == A1063MRComCod ) )
         {
            brk8VR2 = false ;
            AV26count = (long)(AV26count+1) ;
            brk8VR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1064MRComNom)==0) )
         {
            AV18Option = A1064MRComNom ;
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
         A1062MRPriNom = W1062MRPriNom ;
         n1062MRPriNom = false ;
         if ( ! brk8VR2 )
         {
            brk8VR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wc_repuestocompatiblegetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = wc_repuestocompatiblegetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = wc_repuestocompatiblegetfilterdata.this.AV25OptionIndexesJson;
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
      AV32FilterFullText = "" ;
      AV10TFMRComNom = "" ;
      AV11TFMRComNom_Sel = "" ;
      AV33EmprCod = "" ;
      AV35MRPriNom = "" ;
      A1064MRComNom = "" ;
      AV40Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod = "" ;
      AV42Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom = "" ;
      AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = "" ;
      AV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel = "" ;
      scmdbuf = "" ;
      lV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = "" ;
      lV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      A396EmprCod = "" ;
      A1062MRPriNom = "" ;
      P08VR2_A396EmprCod = new String[] {""} ;
      P08VR2_A1061MRPriCod = new int[1] ;
      P08VR2_A1062MRPriNom = new String[] {""} ;
      P08VR2_n1062MRPriNom = new boolean[] {false} ;
      P08VR2_A1063MRComCod = new int[1] ;
      P08VR2_A1064MRComNom = new String[] {""} ;
      P08VR2_n1064MRComNom = new boolean[] {false} ;
      W1062MRPriNom = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wc_repuestocompatiblegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08VR2_A396EmprCod, P08VR2_A1061MRPriCod, P08VR2_A1062MRPriNom, P08VR2_n1062MRPriNom, P08VR2_A1063MRComCod, P08VR2_A1064MRComNom, P08VR2_n1064MRComNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV38GXV1 ;
   private int AV12TFMRComCod ;
   private int AV13TFMRComCod_To ;
   private int AV34MRPriCod ;
   private int AV41Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod ;
   private int AV46Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod ;
   private int AV47Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to ;
   private int A1063MRComCod ;
   private int A1061MRPriCod ;
   private int AV17InsertIndex ;
   private long AV26count ;
   private String AV10TFMRComNom ;
   private String AV11TFMRComNom_Sel ;
   private String AV33EmprCod ;
   private String AV35MRPriNom ;
   private String A1064MRComNom ;
   private String AV40Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod ;
   private String AV42Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom ;
   private String AV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ;
   private String AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel ;
   private String scmdbuf ;
   private String lV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ;
   private String A396EmprCod ;
   private String A1062MRPriNom ;
   private String W1062MRPriNom ;
   private boolean returnInSub ;
   private boolean brk8VR2 ;
   private boolean n1062MRPriNom ;
   private boolean n1064MRComNom ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ;
   private String lV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08VR2_A396EmprCod ;
   private int[] P08VR2_A1061MRPriCod ;
   private String[] P08VR2_A1062MRPriNom ;
   private boolean[] P08VR2_n1062MRPriNom ;
   private int[] P08VR2_A1063MRComCod ;
   private String[] P08VR2_A1064MRComNom ;
   private boolean[] P08VR2_n1064MRComNom ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class wc_repuestocompatiblegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ,
                                          String AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                          String AV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ,
                                          int AV46Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod ,
                                          int AV47Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to ,
                                          String A1064MRComNom ,
                                          int A1063MRComCod ,
                                          String AV40Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod ,
                                          int AV41Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod ,
                                          String AV42Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom ,
                                          String A396EmprCod ,
                                          int A1061MRPriCod ,
                                          String A1062MRPriNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MRPriCod AS MRPriCod, T2.MRNom AS MRPriNom, T1.MRComCod AS MRComCod, T3.MRNom AS MRComNom FROM ((TXPMRCom1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRPriCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = T1.EmprCod AND T3.MRCod = T1.MRComCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRPriCod = ? and T2.MRNom = ?)");
      if ( ! (GXutil.strcmp("", AV43Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T3.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRComCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MRNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV46Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod) )
      {
         addWhere(sWhereString, "(T1.MRComCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV47Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MRComCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod, T2.MRNom, T1.MRComCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08VR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

