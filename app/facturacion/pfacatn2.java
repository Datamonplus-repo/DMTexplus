package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacatn2 extends GXProcedure
{
   public pfacatn2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacatn2.class ), "" );
   }

   public pfacatn2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          java.util.Date[] aP2 ,
                          java.util.Date[] aP3 ,
                          long[] aP4 ,
                          long[] aP5 ,
                          String[] aP6 ,
                          java.util.Date[] aP7 ,
                          String[] aP8 ,
                          int[] aP9 ,
                          String[] aP10 ,
                          int[] aP11 )
   {
      pfacatn2.this.aP12 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        long[] aP4 ,
                        long[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        int[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             long[] aP4 ,
                             long[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             int[] aP12 )
   {
      pfacatn2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacatn2.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pfacatn2.this.AV16PFecha = aP2[0];
      this.aP2 = aP2;
      pfacatn2.this.AV17UFecha = aP3[0];
      this.aP3 = aP3;
      pfacatn2.this.AV18PALB = aP4[0];
      this.aP4 = aP4;
      pfacatn2.this.AV19UALB = aP5[0];
      this.aP5 = aP5;
      pfacatn2.this.AV20PRIO = aP6[0];
      this.aP6 = aP6;
      pfacatn2.this.AV21FacFch = aP7[0];
      this.aP7 = aP7;
      pfacatn2.this.AV22FacSerNum = aP8[0];
      this.aP8 = aP8;
      pfacatn2.this.AV84CliFac = aP9[0];
      this.aP9 = aP9;
      pfacatn2.this.AV113TipProd = aP10[0];
      this.aP10 = aP10;
      pfacatn2.this.AV25NumLin = aP11[0];
      this.aP11 = aP11;
      pfacatn2.this.AV24NumFac = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV114Itram ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int2) ;
      pfacatn2.this.GXt_int1 = GXv_int2[0] ;
      AV114Itram = GXt_int1 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV18PALB) ,
                                           Long.valueOf(AV19UALB) ,
                                           AV16PFecha ,
                                           AV17UFecha ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A17AlbComFch ,
                                           A10738AlbComSt ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV15CliCod) ,
                                           A22AlbComPri ,
                                           AV20PRIO ,
                                           A396EmprCod ,
                                           Byte.valueOf(A1783AlbComEso) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      /* Using cursor P027O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV20PRIO, Long.valueOf(AV18PALB), Long.valueOf(AV19UALB), AV16PFecha, AV17UFecha});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk27O2 = false ;
         A10738AlbComSt = P027O2_A10738AlbComSt[0] ;
         A1783AlbComEso = P027O2_A1783AlbComEso[0] ;
         A22AlbComPri = P027O2_A22AlbComPri[0] ;
         A17AlbComFch = P027O2_A17AlbComFch[0] ;
         A14AlbComCod = P027O2_A14AlbComCod[0] ;
         A252CliCod = P027O2_A252CliCod[0] ;
         A16AlbComEst = P027O2_A16AlbComEst[0] ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P027O2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P027O2_A1783AlbComEso[0] == A1783AlbComEso ) )
         {
            brk27O2 = false ;
            A10738AlbComSt = P027O2_A10738AlbComSt[0] ;
            A22AlbComPri = P027O2_A22AlbComPri[0] ;
            A17AlbComFch = P027O2_A17AlbComFch[0] ;
            A14AlbComCod = P027O2_A14AlbComCod[0] ;
            A252CliCod = P027O2_A252CliCod[0] ;
            A16AlbComEst = P027O2_A16AlbComEst[0] ;
            if ( A1783AlbComEso == 1 )
            {
               if ( GXutil.strcmp(A10738AlbComSt, "A") != 0 )
               {
                  if ( A252CliCod == AV15CliCod )
                  {
                     if ( GXutil.strcmp(A22AlbComPri, AV20PRIO) == 0 )
                     {
                        AV42FlagFac2 = (byte)(0) ;
                        /* Using cursor P027O3 */
                        pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV20PRIO});
                        while ( (pr_default.getStatus(1) != 101) )
                        {
                           A297CliPri = P027O3_A297CliPri[0] ;
                           A497FpgCod = P027O3_A497FpgCod[0] ;
                           A261CliDtoGrl = P027O3_A261CliDtoGrl[0] ;
                           A262CliDtoPpg = P027O3_A262CliDtoPpg[0] ;
                           A299CliRegIVA = P027O3_A299CliRegIVA[0] ;
                           A280CliNroVto = P027O3_A280CliNroVto[0] ;
                           A296CliPrd = P027O3_A296CliPrd[0] ;
                           A259CliDiaPag = P027O3_A259CliDiaPag[0] ;
                           AV26CodFpg = A497FpgCod ;
                           AV27DtoGen = A261CliDtoGrl ;
                           AV28DtoPP = A262CliDtoPpg ;
                           AV29RegIVA = A299CliRegIVA ;
                           AV31CliNroVto = A280CliNroVto ;
                           AV32CliPrd = A296CliPrd ;
                           AV33CliDiaPag = A259CliDiaPag ;
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(1);
                        /* Using cursor P027O4 */
                        pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
                        while ( (pr_default.getStatus(2) != 101) )
                        {
                           A15AlbComDsc = P027O4_A15AlbComDsc[0] ;
                           A13AlbComCnt = P027O4_A13AlbComCnt[0] ;
                           A21AlbComPre = P027O4_A21AlbComPre[0] ;
                           A4717AlbComUni = P027O4_A4717AlbComUni[0] ;
                           A20AlbComLin = P027O4_A20AlbComLin[0] ;
                           AV25NumLin = (int)(AV25NumLin+1) ;
                           AV42FlagFac2 = (byte)(1) ;
                           /*
                              INSERT RECORD ON TABLE TXPLFAVEN

                           */
                           A430FacCod = AV24NumFac ;
                           A446FacLin = AV25NumLin ;
                           A427FacAlbCod = A14AlbComCod ;
                           A428FacAlbTip = (byte)(2) ;
                           A432FacDsc = A15AlbComDsc ;
                           if ( AV114Itram == 1 )
                           {
                              A447FacMts = DecimalUtil.doubleToDec(0) ;
                              A449FacPreMts = DecimalUtil.doubleToDec(0) ;
                              A444FacKgs = A13AlbComCnt ;
                              A448FacPreKgs = A21AlbComPre ;
                           }
                           else
                           {
                              A447FacMts = A13AlbComCnt ;
                              A449FacPreMts = A21AlbComPre ;
                              A444FacKgs = DecimalUtil.doubleToDec(0) ;
                              A448FacPreKgs = DecimalUtil.doubleToDec(0) ;
                              A12197FacUnds = 0 ;
                              A12198FacPreUnd = DecimalUtil.doubleToDec(0) ;
                              if ( A4717AlbComUni == 4 )
                              {
                                 A12197FacUnds = (int)(DecimalUtil.decToDouble(A13AlbComCnt)) ;
                                 A12198FacPreUnd = A21AlbComPre ;
                                 A447FacMts = DecimalUtil.doubleToDec(0) ;
                                 A449FacPreMts = DecimalUtil.doubleToDec(0) ;
                              }
                           }
                           A454FacSer = httpContext.getMessage( "COMERCIAL", "") ;
                           A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                           A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                           A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                           A3397FacFasCod = " " ;
                           /* Using cursor P027O5 */
                           pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A3397FacFasCod, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin, Integer.valueOf(A12197FacUnds), A12198FacPreUnd});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                           if ( (pr_default.getStatus(3) == 1) )
                           {
                              Gx_err = (short)(1) ;
                              Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                           }
                           else
                           {
                              Gx_err = (short)(0) ;
                              Gx_emsg = "" ;
                           }
                           /* End Insert */
                           pr_default.readNext(2);
                        }
                        pr_default.close(2);
                        if ( ! (0==AV42FlagFac2) )
                        {
                           A16AlbComEst = (byte)(2) ;
                        }
                        /* Using cursor P027O6 */
                        pr_default.execute(4, new Object[] {Byte.valueOf(A16AlbComEst), A396EmprCod, Integer.valueOf(A14AlbComCod)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                     }
                  }
               }
            }
            brk27O2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk27O2 )
         {
            brk27O2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      GXv_char3[0] = A396EmprCod ;
      GXv_int4[0] = AV15CliCod ;
      GXv_char5[0] = AV20PRIO ;
      new app.psitaca(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
      pfacatn2.this.A396EmprCod = GXv_char3[0] ;
      pfacatn2.this.AV15CliCod = GXv_int4[0] ;
      pfacatn2.this.AV20PRIO = GXv_char5[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacatn2.this.A396EmprCod;
      this.aP1[0] = pfacatn2.this.AV15CliCod;
      this.aP2[0] = pfacatn2.this.AV16PFecha;
      this.aP3[0] = pfacatn2.this.AV17UFecha;
      this.aP4[0] = pfacatn2.this.AV18PALB;
      this.aP5[0] = pfacatn2.this.AV19UALB;
      this.aP6[0] = pfacatn2.this.AV20PRIO;
      this.aP7[0] = pfacatn2.this.AV21FacFch;
      this.aP8[0] = pfacatn2.this.AV22FacSerNum;
      this.aP9[0] = pfacatn2.this.AV84CliFac;
      this.aP10[0] = pfacatn2.this.AV113TipProd;
      this.aP11[0] = pfacatn2.this.AV25NumLin;
      this.aP12[0] = pfacatn2.this.AV24NumFac;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pfacatn2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A10738AlbComSt = "" ;
      A22AlbComPri = "" ;
      P027O2_A396EmprCod = new String[] {""} ;
      P027O2_A10738AlbComSt = new String[] {""} ;
      P027O2_A1783AlbComEso = new byte[1] ;
      P027O2_A22AlbComPri = new String[] {""} ;
      P027O2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P027O2_A14AlbComCod = new int[1] ;
      P027O2_A252CliCod = new int[1] ;
      P027O2_A16AlbComEst = new byte[1] ;
      P027O3_A396EmprCod = new String[] {""} ;
      P027O3_A252CliCod = new int[1] ;
      P027O3_A297CliPri = new String[] {""} ;
      P027O3_A497FpgCod = new String[] {""} ;
      P027O3_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027O3_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027O3_A299CliRegIVA = new String[] {""} ;
      P027O3_A280CliNroVto = new byte[1] ;
      P027O3_A296CliPrd = new String[] {""} ;
      P027O3_A259CliDiaPag = new String[] {""} ;
      A297CliPri = "" ;
      A497FpgCod = "" ;
      A261CliDtoGrl = DecimalUtil.ZERO ;
      A262CliDtoPpg = DecimalUtil.ZERO ;
      A299CliRegIVA = "" ;
      A296CliPrd = "" ;
      A259CliDiaPag = "" ;
      AV26CodFpg = "" ;
      AV27DtoGen = DecimalUtil.ZERO ;
      AV28DtoPP = DecimalUtil.ZERO ;
      AV29RegIVA = "" ;
      AV32CliPrd = "" ;
      AV33CliDiaPag = "" ;
      P027O4_A396EmprCod = new String[] {""} ;
      P027O4_A14AlbComCod = new int[1] ;
      P027O4_A15AlbComDsc = new String[] {""} ;
      P027O4_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027O4_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027O4_A4717AlbComUni = new byte[1] ;
      P027O4_A20AlbComLin = new short[1] ;
      A15AlbComDsc = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A454FacSer = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      Gx_emsg = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacatn2__default(),
         new Object[] {
             new Object[] {
            P027O2_A396EmprCod, P027O2_A10738AlbComSt, P027O2_A1783AlbComEso, P027O2_A22AlbComPri, P027O2_A17AlbComFch, P027O2_A14AlbComCod, P027O2_A252CliCod, P027O2_A16AlbComEst
            }
            , new Object[] {
            P027O3_A396EmprCod, P027O3_A252CliCod, P027O3_A297CliPri, P027O3_A497FpgCod, P027O3_A261CliDtoGrl, P027O3_A262CliDtoPpg, P027O3_A299CliRegIVA, P027O3_A280CliNroVto, P027O3_A296CliPrd, P027O3_A259CliDiaPag
            }
            , new Object[] {
            P027O4_A396EmprCod, P027O4_A14AlbComCod, P027O4_A15AlbComDsc, P027O4_A13AlbComCnt, P027O4_A21AlbComPre, P027O4_A4717AlbComUni, P027O4_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV114Itram ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A1783AlbComEso ;
   private byte A16AlbComEst ;
   private byte AV42FlagFac2 ;
   private byte A280CliNroVto ;
   private byte AV31CliNroVto ;
   private byte A4717AlbComUni ;
   private byte A428FacAlbTip ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV84CliFac ;
   private int AV25NumLin ;
   private int AV24NumFac ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A12197FacUnds ;
   private int GXv_int4[] ;
   private long AV18PALB ;
   private long AV19UALB ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A261CliDtoGrl ;
   private java.math.BigDecimal A262CliDtoPpg ;
   private java.math.BigDecimal AV27DtoGen ;
   private java.math.BigDecimal AV28DtoPP ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private String A396EmprCod ;
   private String AV20PRIO ;
   private String AV22FacSerNum ;
   private String AV113TipProd ;
   private String scmdbuf ;
   private String A10738AlbComSt ;
   private String A22AlbComPri ;
   private String A297CliPri ;
   private String A497FpgCod ;
   private String A299CliRegIVA ;
   private String A296CliPrd ;
   private String A259CliDiaPag ;
   private String AV26CodFpg ;
   private String AV29RegIVA ;
   private String AV32CliPrd ;
   private String AV33CliDiaPag ;
   private String A15AlbComDsc ;
   private String A432FacDsc ;
   private String A454FacSer ;
   private String A3397FacFasCod ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private java.util.Date AV16PFecha ;
   private java.util.Date AV17UFecha ;
   private java.util.Date AV21FacFch ;
   private java.util.Date A17AlbComFch ;
   private boolean brk27O2 ;
   private int[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private long[] aP4 ;
   private long[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P027O2_A396EmprCod ;
   private String[] P027O2_A10738AlbComSt ;
   private byte[] P027O2_A1783AlbComEso ;
   private String[] P027O2_A22AlbComPri ;
   private java.util.Date[] P027O2_A17AlbComFch ;
   private int[] P027O2_A14AlbComCod ;
   private int[] P027O2_A252CliCod ;
   private byte[] P027O2_A16AlbComEst ;
   private String[] P027O3_A396EmprCod ;
   private int[] P027O3_A252CliCod ;
   private String[] P027O3_A297CliPri ;
   private String[] P027O3_A497FpgCod ;
   private java.math.BigDecimal[] P027O3_A261CliDtoGrl ;
   private java.math.BigDecimal[] P027O3_A262CliDtoPpg ;
   private String[] P027O3_A299CliRegIVA ;
   private byte[] P027O3_A280CliNroVto ;
   private String[] P027O3_A296CliPrd ;
   private String[] P027O3_A259CliDiaPag ;
   private String[] P027O4_A396EmprCod ;
   private int[] P027O4_A14AlbComCod ;
   private String[] P027O4_A15AlbComDsc ;
   private java.math.BigDecimal[] P027O4_A13AlbComCnt ;
   private java.math.BigDecimal[] P027O4_A21AlbComPre ;
   private byte[] P027O4_A4717AlbComUni ;
   private short[] P027O4_A20AlbComLin ;
}

final  class pfacatn2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P027O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV18PALB ,
                                          long AV19UALB ,
                                          java.util.Date AV16PFecha ,
                                          java.util.Date AV17UFecha ,
                                          int A14AlbComCod ,
                                          java.util.Date A17AlbComFch ,
                                          String A10738AlbComSt ,
                                          int A252CliCod ,
                                          int AV15CliCod ,
                                          String A22AlbComPri ,
                                          String AV20PRIO ,
                                          String A396EmprCod ,
                                          byte A1783AlbComEso )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[7];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbComSt, AlbComEso, AlbComPri, AlbComFch, AlbComCod, CliCod, AlbComEst FROM TXPCALCOM" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbComEso = 1)");
      addWhere(sWhereString, "(AlbComSt <> 'A')");
      addWhere(sWhereString, "(CliCod = ?)");
      addWhere(sWhereString, "(AlbComPri = ?)");
      if ( ! (0==AV18PALB) )
      {
         addWhere(sWhereString, "(AlbComCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV19UALB) )
      {
         addWhere(sWhereString, "(AlbComCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16PFecha)) )
      {
         addWhere(sWhereString, "(AlbComFch >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17UFecha)) )
      {
         addWhere(sWhereString, "(AlbComFch <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbComEso, AlbComCod" ;
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
                  return conditional_P027O2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027O2", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P027O3", "SELECT EmprCod, CliCod, CliPri, FpgCod, CliDtoGrl, CliDtoPpg, CliRegIVA, CliNroVto, CliPrd, CliDiaPag FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P027O4", "SELECT EmprCod, AlbComCod, AlbComDsc, AlbComCnt, AlbComPre, AlbComUni, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P027O5", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacFasCod, FacBonLi, FacImpMan, FacImpMin, FacUnds, FacPreUnd, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P027O6", "UPDATE TXPCALCOM SET AlbComEst=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 5);
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

