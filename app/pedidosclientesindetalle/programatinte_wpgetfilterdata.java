package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class programatinte_wpgetfilterdata extends GXProcedure
{
   public programatinte_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( programatinte_wpgetfilterdata.class ), "" );
   }

   public programatinte_wpgetfilterdata( int remoteHandle ,
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
      programatinte_wpgetfilterdata.this.aP5 = new String[] {""};
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
      programatinte_wpgetfilterdata.this.AV46DDOName = aP0;
      programatinte_wpgetfilterdata.this.AV47SearchTxt = aP1;
      programatinte_wpgetfilterdata.this.AV48SearchTxtTo = aP2;
      programatinte_wpgetfilterdata.this.aP3 = aP3;
      programatinte_wpgetfilterdata.this.aP4 = aP4;
      programatinte_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMDCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDCOLNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV49OptionsJson = AV36Options.toJSonString(false) ;
      AV50OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV39OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("PedidosClienteSinDetalle.ProgramaTinte_WPGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.ProgramaTinte_WPGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("PedidosClienteSinDetalle.ProgramaTinte_WPGridState"), null, null);
      }
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOD") == 0 )
         {
            AV10TFPMDCod = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPMDCod_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC") == 0 )
         {
            AV12TFPMDDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC_SEL") == 0 )
         {
            AV13TFPMDDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM") == 0 )
         {
            AV20TFPMDColNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM_SEL") == 0 )
         {
            AV21TFPMDColNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREKGM") == 0 )
         {
            AV22TFPMDPreKgm = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPMDPreKgm_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDENTKGM") == 0 )
         {
            AV24TFPMDEntKgm = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPMDEntKgm_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOTIN") == 0 )
         {
            AV26TFPMDDtoTin = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFPMDDtoTin_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOACA") == 0 )
         {
            AV28TFPMDDtoAca = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFPMDDtoAca_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREUNI") == 0 )
         {
            AV30TFPMDPreUni = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFPMDPreUni_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDVALFCH") == 0 )
         {
            AV32TFPMDValFch = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV57Clicod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PMDCOLCLI") == 0 )
         {
            AV59PmdColCli = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPMDDsc = AV47SearchTxt ;
      AV13TFPMDDsc_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV10TFPMDCod) ,
                                           Short.valueOf(AV11TFPMDCod_To) ,
                                           AV13TFPMDDsc_Sel ,
                                           AV12TFPMDDsc ,
                                           AV22TFPMDPreKgm ,
                                           AV23TFPMDPreKgm_To ,
                                           AV24TFPMDEntKgm ,
                                           AV25TFPMDEntKgm_To ,
                                           AV26TFPMDDtoTin ,
                                           AV27TFPMDDtoTin_To ,
                                           AV28TFPMDDtoAca ,
                                           AV29TFPMDDtoAca_To ,
                                           AV30TFPMDPreUni ,
                                           AV31TFPMDPreUni_To ,
                                           AV32TFPMDValFch ,
                                           Integer.valueOf(AV60Var_PMDConCod) ,
                                           AV61Var_PMDColCli ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8530PMDColCli ,
                                           AV21TFPMDColNom_Sel ,
                                           AV20TFPMDColNom ,
                                           A8394PMDColNom ,
                                           Gx_date ,
                                           AV56Emprcod ,
                                           Integer.valueOf(AV57Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV12TFPMDDsc = GXutil.padr( GXutil.rtrim( AV12TFPMDDsc), 30, "%") ;
      /* Using cursor P09KW2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, Integer.valueOf(AV57Clicod), Gx_date, Short.valueOf(AV10TFPMDCod), Short.valueOf(AV11TFPMDCod_To), lV12TFPMDDsc, AV13TFPMDDsc_Sel, AV22TFPMDPreKgm, AV23TFPMDPreKgm_To, AV24TFPMDEntKgm, AV25TFPMDEntKgm_To, AV26TFPMDDtoTin, AV27TFPMDDtoTin_To, AV28TFPMDDtoAca, AV29TFPMDDtoAca_To, AV30TFPMDPreUni, AV31TFPMDPreUni_To, AV32TFPMDValFch, Integer.valueOf(AV60Var_PMDConCod), AV61Var_PMDColCli});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9KW2 = false ;
         A8391PMDCod = P09KW2_A8391PMDCod[0] ;
         A8530PMDColCli = P09KW2_A8530PMDColCli[0] ;
         A8399PMDValFch = P09KW2_A8399PMDValFch[0] ;
         A8532PMDPreUni = P09KW2_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = P09KW2_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = P09KW2_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P09KW2_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P09KW2_A8395PMDPreKgm[0] ;
         A8392PMDDsc = P09KW2_A8392PMDDsc[0] ;
         n8392PMDDsc = P09KW2_n8392PMDDsc[0] ;
         A8531PMDConCod = P09KW2_A8531PMDConCod[0] ;
         A252CliCod = P09KW2_A252CliCod[0] ;
         A396EmprCod = P09KW2_A396EmprCod[0] ;
         A8393PMDColNum = P09KW2_A8393PMDColNum[0] ;
         A8392PMDDsc = P09KW2_A8392PMDDsc[0] ;
         n8392PMDDsc = P09KW2_n8392PMDDsc[0] ;
         GXt_char2 = A8394PMDColNom ;
         GXv_char3[0] = GXt_char2 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char3) ;
         programatinte_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A8394PMDColNom = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV21TFPMDColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFPMDColNom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV20TFPMDColNom) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV21TFPMDColNom_Sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV21TFPMDColNom_Sel) == 0 ) ) )
            {
               AV40count = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09KW2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09KW2_A252CliCod[0] == A252CliCod ) && ( P09KW2_A8391PMDCod[0] == A8391PMDCod ) )
               {
                  brk9KW2 = false ;
                  A8393PMDColNum = P09KW2_A8393PMDColNum[0] ;
                  AV40count = (long)(AV40count+1) ;
                  brk9KW2 = true ;
                  pr_default.readNext(0);
               }
               if ( ! (GXutil.strcmp("", A8392PMDDsc)==0) )
               {
                  AV35Option = A8392PMDDsc ;
                  AV34InsertIndex = 1 ;
                  while ( ( AV34InsertIndex <= AV36Options.size() ) && ( GXutil.strcmp((String)AV36Options.elementAt(-1+AV34InsertIndex), AV35Option) < 0 ) )
                  {
                     AV34InsertIndex = (int)(AV34InsertIndex+1) ;
                  }
                  AV36Options.add(AV35Option, AV34InsertIndex);
                  AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV34InsertIndex);
               }
               if ( AV36Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk9KW2 )
         {
            brk9KW2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPMDCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPMDColNom = AV47SearchTxt ;
      AV21TFPMDColNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV10TFPMDCod) ,
                                           Short.valueOf(AV11TFPMDCod_To) ,
                                           AV13TFPMDDsc_Sel ,
                                           AV12TFPMDDsc ,
                                           AV22TFPMDPreKgm ,
                                           AV23TFPMDPreKgm_To ,
                                           AV24TFPMDEntKgm ,
                                           AV25TFPMDEntKgm_To ,
                                           AV26TFPMDDtoTin ,
                                           AV27TFPMDDtoTin_To ,
                                           AV28TFPMDDtoAca ,
                                           AV29TFPMDDtoAca_To ,
                                           AV30TFPMDPreUni ,
                                           AV31TFPMDPreUni_To ,
                                           AV32TFPMDValFch ,
                                           Integer.valueOf(AV60Var_PMDConCod) ,
                                           AV61Var_PMDColCli ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8530PMDColCli ,
                                           AV21TFPMDColNom_Sel ,
                                           AV20TFPMDColNom ,
                                           A8394PMDColNom ,
                                           Gx_date ,
                                           AV56Emprcod ,
                                           Integer.valueOf(AV57Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV12TFPMDDsc = GXutil.padr( GXutil.rtrim( AV12TFPMDDsc), 30, "%") ;
      /* Using cursor P09KW3 */
      pr_default.execute(1, new Object[] {AV56Emprcod, Integer.valueOf(AV57Clicod), Gx_date, Short.valueOf(AV10TFPMDCod), Short.valueOf(AV11TFPMDCod_To), lV12TFPMDDsc, AV13TFPMDDsc_Sel, AV22TFPMDPreKgm, AV23TFPMDPreKgm_To, AV24TFPMDEntKgm, AV25TFPMDEntKgm_To, AV26TFPMDDtoTin, AV27TFPMDDtoTin_To, AV28TFPMDDtoAca, AV29TFPMDDtoAca_To, AV30TFPMDPreUni, AV31TFPMDPreUni_To, AV32TFPMDValFch, Integer.valueOf(AV60Var_PMDConCod), AV61Var_PMDColCli});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A8530PMDColCli = P09KW3_A8530PMDColCli[0] ;
         A8399PMDValFch = P09KW3_A8399PMDValFch[0] ;
         A8532PMDPreUni = P09KW3_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = P09KW3_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = P09KW3_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P09KW3_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P09KW3_A8395PMDPreKgm[0] ;
         A8392PMDDsc = P09KW3_A8392PMDDsc[0] ;
         n8392PMDDsc = P09KW3_n8392PMDDsc[0] ;
         A8391PMDCod = P09KW3_A8391PMDCod[0] ;
         A8531PMDConCod = P09KW3_A8531PMDConCod[0] ;
         A252CliCod = P09KW3_A252CliCod[0] ;
         A396EmprCod = P09KW3_A396EmprCod[0] ;
         A8393PMDColNum = P09KW3_A8393PMDColNum[0] ;
         A8392PMDDsc = P09KW3_A8392PMDDsc[0] ;
         n8392PMDDsc = P09KW3_n8392PMDDsc[0] ;
         GXt_char2 = A8394PMDColNom ;
         GXv_char3[0] = GXt_char2 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char3) ;
         programatinte_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A8394PMDColNom = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV21TFPMDColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFPMDColNom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV20TFPMDColNom) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV21TFPMDColNom_Sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV21TFPMDColNom_Sel) == 0 ) ) )
            {
               if ( ! (GXutil.strcmp("", A8394PMDColNom)==0) )
               {
                  AV35Option = A8394PMDColNom ;
                  AV34InsertIndex = 1 ;
                  while ( ( AV34InsertIndex <= AV36Options.size() ) && ( GXutil.strcmp((String)AV36Options.elementAt(-1+AV34InsertIndex), AV35Option) < 0 ) )
                  {
                     AV34InsertIndex = (int)(AV34InsertIndex+1) ;
                  }
                  if ( ( AV34InsertIndex <= AV36Options.size() ) && ( GXutil.strcmp((String)AV36Options.elementAt(-1+AV34InsertIndex), AV35Option) == 0 ) )
                  {
                     AV40count = GXutil.lval( (String)AV39OptionIndexes.elementAt(-1+AV34InsertIndex)) ;
                     AV40count = (long)(AV40count+1) ;
                     AV39OptionIndexes.removeItem(AV34InsertIndex);
                     AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV34InsertIndex);
                  }
                  else
                  {
                     AV36Options.add(AV35Option, AV34InsertIndex);
                     AV39OptionIndexes.add("1", AV34InsertIndex);
                  }
               }
               if ( AV36Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = programatinte_wpgetfilterdata.this.AV49OptionsJson;
      this.aP4[0] = programatinte_wpgetfilterdata.this.AV50OptionsDescJson;
      this.aP5[0] = programatinte_wpgetfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49OptionsJson = "" ;
      AV50OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPMDDsc = "" ;
      AV13TFPMDDsc_Sel = "" ;
      AV20TFPMDColNom = "" ;
      AV21TFPMDColNom_Sel = "" ;
      AV22TFPMDPreKgm = DecimalUtil.ZERO ;
      AV23TFPMDPreKgm_To = DecimalUtil.ZERO ;
      AV24TFPMDEntKgm = DecimalUtil.ZERO ;
      AV25TFPMDEntKgm_To = DecimalUtil.ZERO ;
      AV26TFPMDDtoTin = DecimalUtil.ZERO ;
      AV27TFPMDDtoTin_To = DecimalUtil.ZERO ;
      AV28TFPMDDtoAca = DecimalUtil.ZERO ;
      AV29TFPMDDtoAca_To = DecimalUtil.ZERO ;
      AV30TFPMDPreUni = DecimalUtil.ZERO ;
      AV31TFPMDPreUni_To = DecimalUtil.ZERO ;
      AV32TFPMDValFch = GXutil.nullDate() ;
      AV56Emprcod = "" ;
      AV59PmdColCli = "" ;
      scmdbuf = "" ;
      lV12TFPMDDsc = "" ;
      AV61Var_PMDColCli = "" ;
      A8392PMDDsc = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8530PMDColCli = "" ;
      A8394PMDColNom = "" ;
      Gx_date = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09KW2_A8391PMDCod = new short[1] ;
      P09KW2_A8530PMDColCli = new String[] {""} ;
      P09KW2_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09KW2_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW2_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW2_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW2_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW2_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW2_A8392PMDDsc = new String[] {""} ;
      P09KW2_n8392PMDDsc = new boolean[] {false} ;
      P09KW2_A8531PMDConCod = new int[1] ;
      P09KW2_A252CliCod = new int[1] ;
      P09KW2_A396EmprCod = new String[] {""} ;
      P09KW2_A8393PMDColNum = new int[1] ;
      AV35Option = "" ;
      P09KW3_A8530PMDColCli = new String[] {""} ;
      P09KW3_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09KW3_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW3_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW3_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW3_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW3_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KW3_A8392PMDDsc = new String[] {""} ;
      P09KW3_n8392PMDDsc = new boolean[] {false} ;
      P09KW3_A8391PMDCod = new short[1] ;
      P09KW3_A8531PMDConCod = new int[1] ;
      P09KW3_A252CliCod = new int[1] ;
      P09KW3_A396EmprCod = new String[] {""} ;
      P09KW3_A8393PMDColNum = new int[1] ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.programatinte_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09KW2_A8391PMDCod, P09KW2_A8530PMDColCli, P09KW2_A8399PMDValFch, P09KW2_A8532PMDPreUni, P09KW2_A8398PMDDtoAca, P09KW2_A8397PMDDtoTin, P09KW2_A8396PMDEntKgm, P09KW2_A8395PMDPreKgm, P09KW2_A8392PMDDsc, P09KW2_n8392PMDDsc,
            P09KW2_A8531PMDConCod, P09KW2_A252CliCod, P09KW2_A396EmprCod, P09KW2_A8393PMDColNum
            }
            , new Object[] {
            P09KW3_A8530PMDColCli, P09KW3_A8399PMDValFch, P09KW3_A8532PMDPreUni, P09KW3_A8398PMDDtoAca, P09KW3_A8397PMDDtoTin, P09KW3_A8396PMDEntKgm, P09KW3_A8395PMDPreKgm, P09KW3_A8392PMDDsc, P09KW3_n8392PMDDsc, P09KW3_A8391PMDCod,
            P09KW3_A8531PMDConCod, P09KW3_A252CliCod, P09KW3_A396EmprCod, P09KW3_A8393PMDColNum
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short AV10TFPMDCod ;
   private short AV11TFPMDCod_To ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int AV64GXV1 ;
   private int AV57Clicod ;
   private int AV60Var_PMDConCod ;
   private int A8531PMDConCod ;
   private int A252CliCod ;
   private int A8393PMDColNum ;
   private int AV34InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV22TFPMDPreKgm ;
   private java.math.BigDecimal AV23TFPMDPreKgm_To ;
   private java.math.BigDecimal AV24TFPMDEntKgm ;
   private java.math.BigDecimal AV25TFPMDEntKgm_To ;
   private java.math.BigDecimal AV26TFPMDDtoTin ;
   private java.math.BigDecimal AV27TFPMDDtoTin_To ;
   private java.math.BigDecimal AV28TFPMDDtoAca ;
   private java.math.BigDecimal AV29TFPMDDtoAca_To ;
   private java.math.BigDecimal AV30TFPMDPreUni ;
   private java.math.BigDecimal AV31TFPMDPreUni_To ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private String AV12TFPMDDsc ;
   private String AV13TFPMDDsc_Sel ;
   private String AV20TFPMDColNom ;
   private String AV21TFPMDColNom_Sel ;
   private String AV56Emprcod ;
   private String AV59PmdColCli ;
   private String scmdbuf ;
   private String lV12TFPMDDsc ;
   private String AV61Var_PMDColCli ;
   private String A8392PMDDsc ;
   private String A8530PMDColCli ;
   private String A8394PMDColNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV32TFPMDValFch ;
   private java.util.Date A8399PMDValFch ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean brk9KW2 ;
   private boolean n8392PMDDsc ;
   private String AV49OptionsJson ;
   private String AV50OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV46DDOName ;
   private String AV47SearchTxt ;
   private String AV48SearchTxtTo ;
   private String AV35Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09KW2_A8391PMDCod ;
   private String[] P09KW2_A8530PMDColCli ;
   private java.util.Date[] P09KW2_A8399PMDValFch ;
   private java.math.BigDecimal[] P09KW2_A8532PMDPreUni ;
   private java.math.BigDecimal[] P09KW2_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P09KW2_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P09KW2_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P09KW2_A8395PMDPreKgm ;
   private String[] P09KW2_A8392PMDDsc ;
   private boolean[] P09KW2_n8392PMDDsc ;
   private int[] P09KW2_A8531PMDConCod ;
   private int[] P09KW2_A252CliCod ;
   private String[] P09KW2_A396EmprCod ;
   private int[] P09KW2_A8393PMDColNum ;
   private String[] P09KW3_A8530PMDColCli ;
   private java.util.Date[] P09KW3_A8399PMDValFch ;
   private java.math.BigDecimal[] P09KW3_A8532PMDPreUni ;
   private java.math.BigDecimal[] P09KW3_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P09KW3_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P09KW3_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P09KW3_A8395PMDPreKgm ;
   private String[] P09KW3_A8392PMDDsc ;
   private boolean[] P09KW3_n8392PMDDsc ;
   private short[] P09KW3_A8391PMDCod ;
   private int[] P09KW3_A8531PMDConCod ;
   private int[] P09KW3_A252CliCod ;
   private String[] P09KW3_A396EmprCod ;
   private int[] P09KW3_A8393PMDColNum ;
   private GXSimpleCollection<String> AV36Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV39OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class programatinte_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09KW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV10TFPMDCod ,
                                          short AV11TFPMDCod_To ,
                                          String AV13TFPMDDsc_Sel ,
                                          String AV12TFPMDDsc ,
                                          java.math.BigDecimal AV22TFPMDPreKgm ,
                                          java.math.BigDecimal AV23TFPMDPreKgm_To ,
                                          java.math.BigDecimal AV24TFPMDEntKgm ,
                                          java.math.BigDecimal AV25TFPMDEntKgm_To ,
                                          java.math.BigDecimal AV26TFPMDDtoTin ,
                                          java.math.BigDecimal AV27TFPMDDtoTin_To ,
                                          java.math.BigDecimal AV28TFPMDDtoAca ,
                                          java.math.BigDecimal AV29TFPMDDtoAca_To ,
                                          java.math.BigDecimal AV30TFPMDPreUni ,
                                          java.math.BigDecimal AV31TFPMDPreUni_To ,
                                          java.util.Date AV32TFPMDValFch ,
                                          int AV60Var_PMDConCod ,
                                          String AV61Var_PMDColCli ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          int A8531PMDConCod ,
                                          String A8530PMDColCli ,
                                          String AV21TFPMDColNom_Sel ,
                                          String AV20TFPMDColNom ,
                                          String A8394PMDColNom ,
                                          java.util.Date Gx_date ,
                                          String AV56Emprcod ,
                                          int AV57Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PMDCod, T1.PMDColCli, T1.PMDValFch, T1.PMDPreUni, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDEntKgm, T1.PMDPreKgm, T2.PMDDsc, T1.PMDConCod, T1.CliCod, T1.EmprCod," ;
      scmdbuf += " T1.PMDColNum FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.PMDValFch > ?)");
      if ( ! (0==AV10TFPMDCod) )
      {
         addWhere(sWhereString, "(T1.PMDCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV11TFPMDCod_To) )
      {
         addWhere(sWhereString, "(T1.PMDCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPMDDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPMDDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPMDDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMDDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFPMDPreKgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFPMDPreKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFPMDEntKgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPMDEntKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPMDDtoTin)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFPMDDtoTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPMDDtoAca)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPMDDtoAca_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPMDPreUni)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFPMDPreUni_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFPMDValFch)) )
      {
         addWhere(sWhereString, "(T1.PMDValFch >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Var_PMDConCod) )
      {
         addWhere(sWhereString, "(T1.PMDConCod = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Var_PMDColCli)==0) )
      {
         addWhere(sWhereString, "(T1.PMDColCli = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.PMDCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09KW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV10TFPMDCod ,
                                          short AV11TFPMDCod_To ,
                                          String AV13TFPMDDsc_Sel ,
                                          String AV12TFPMDDsc ,
                                          java.math.BigDecimal AV22TFPMDPreKgm ,
                                          java.math.BigDecimal AV23TFPMDPreKgm_To ,
                                          java.math.BigDecimal AV24TFPMDEntKgm ,
                                          java.math.BigDecimal AV25TFPMDEntKgm_To ,
                                          java.math.BigDecimal AV26TFPMDDtoTin ,
                                          java.math.BigDecimal AV27TFPMDDtoTin_To ,
                                          java.math.BigDecimal AV28TFPMDDtoAca ,
                                          java.math.BigDecimal AV29TFPMDDtoAca_To ,
                                          java.math.BigDecimal AV30TFPMDPreUni ,
                                          java.math.BigDecimal AV31TFPMDPreUni_To ,
                                          java.util.Date AV32TFPMDValFch ,
                                          int AV60Var_PMDConCod ,
                                          String AV61Var_PMDColCli ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          int A8531PMDConCod ,
                                          String A8530PMDColCli ,
                                          String AV21TFPMDColNom_Sel ,
                                          String AV20TFPMDColNom ,
                                          String A8394PMDColNom ,
                                          java.util.Date Gx_date ,
                                          String AV56Emprcod ,
                                          int AV57Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PMDColCli, T1.PMDValFch, T1.PMDPreUni, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDEntKgm, T1.PMDPreKgm, T2.PMDDsc, T1.PMDCod, T1.PMDConCod, T1.CliCod, T1.EmprCod," ;
      scmdbuf += " T1.PMDColNum FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.PMDValFch > ?)");
      if ( ! (0==AV10TFPMDCod) )
      {
         addWhere(sWhereString, "(T1.PMDCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV11TFPMDCod_To) )
      {
         addWhere(sWhereString, "(T1.PMDCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPMDDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPMDDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPMDDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMDDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFPMDPreKgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFPMDPreKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFPMDEntKgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPMDEntKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPMDDtoTin)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFPMDDtoTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPMDDtoAca)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPMDDtoAca_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPMDPreUni)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFPMDPreUni_To)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFPMDValFch)) )
      {
         addWhere(sWhereString, "(T1.PMDValFch >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Var_PMDConCod) )
      {
         addWhere(sWhereString, "(T1.PMDConCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Var_PMDColCli)==0) )
      {
         addWhere(sWhereString, "(T1.PMDColCli = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
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
                  return conditional_P09KW2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() );
            case 1 :
                  return conditional_P09KW3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09KW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((int[]) buf[13])[0] = rslt.getInt(13);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               return;
      }
   }

}

