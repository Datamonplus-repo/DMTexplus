package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreusatx extends GXProcedure
{
   public ppreusatx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreusatx.class ), "" );
   }

   public ppreusatx( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      ppreusatx.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      ppreusatx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreusatx.this.AV8Discod = aP1[0];
      this.aP1 = aP1;
      ppreusatx.this.AV9NewDiscod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04QQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P04QQ2_A361DisCod[0] ;
         A12144ProStsFec = P04QQ2_A12144ProStsFec[0] ;
         n12144ProStsFec = P04QQ2_n12144ProStsFec[0] ;
         A12143ProSts = P04QQ2_A12143ProSts[0] ;
         n12143ProSts = P04QQ2_n12143ProSts[0] ;
         A5334DisFasApr = P04QQ2_A5334DisFasApr[0] ;
         n5334DisFasApr = P04QQ2_n5334DisFasApr[0] ;
         A846UltFasLin = P04QQ2_A846UltFasLin[0] ;
         A758ProCod = P04QQ2_A758ProCod[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         /*
            INSERT RECORD ON TABLE TXPDISLIN

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W758ProCod = A758ProCod ;
         A361DisCod = AV9NewDiscod ;
         /* Using cursor P04QQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin), Boolean.valueOf(n5334DisFasApr), A5334DisFasApr, Boolean.valueOf(n12143ProSts), Byte.valueOf(A12143ProSts), Boolean.valueOf(n12144ProStsFec), A12144ProStsFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         A758ProCod = W758ProCod ;
         /* End Insert */
         /* Using cursor P04QQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A7744FasPreObl = P04QQ4_A7744FasPreObl[0] ;
            n7744FasPreObl = P04QQ4_n7744FasPreObl[0] ;
            A5307DisNumPas = P04QQ4_A5307DisNumPas[0] ;
            n5307DisNumPas = P04QQ4_n5307DisNumPas[0] ;
            A5306DisVelPro = P04QQ4_A5306DisVelPro[0] ;
            n5306DisVelPro = P04QQ4_n5306DisVelPro[0] ;
            A5305DisPrePie = P04QQ4_A5305DisPrePie[0] ;
            n5305DisPrePie = P04QQ4_n5305DisPrePie[0] ;
            A5304DisPreSal = P04QQ4_A5304DisPreSal[0] ;
            n5304DisPreSal = P04QQ4_n5304DisPreSal[0] ;
            A9841DisFasObs = P04QQ4_A9841DisFasObs[0] ;
            A7918Dta_UOrd = P04QQ4_A7918Dta_UOrd[0] ;
            n7918Dta_UOrd = P04QQ4_n7918Dta_UOrd[0] ;
            A7917DisfasRb = P04QQ4_A7917DisfasRb[0] ;
            n7917DisfasRb = P04QQ4_n7917DisfasRb[0] ;
            A7916DisFasUpL = P04QQ4_A7916DisFasUpL[0] ;
            n7916DisFasUpL = P04QQ4_n7916DisFasUpL[0] ;
            A7915Disfastpp = P04QQ4_A7915Disfastpp[0] ;
            n7915Disfastpp = P04QQ4_n7915Disfastpp[0] ;
            A7747DisFasAut = P04QQ4_A7747DisFasAut[0] ;
            n7747DisFasAut = P04QQ4_n7747DisFasAut[0] ;
            A7743DisFasRec = P04QQ4_A7743DisFasRec[0] ;
            n7743DisFasRec = P04QQ4_n7743DisFasRec[0] ;
            A7742DisFasDto = P04QQ4_A7742DisFasDto[0] ;
            n7742DisFasDto = P04QQ4_n7742DisFasDto[0] ;
            A7741DisFasUni = P04QQ4_A7741DisFasUni[0] ;
            n7741DisFasUni = P04QQ4_n7741DisFasUni[0] ;
            A7740DisFasPre = P04QQ4_A7740DisFasPre[0] ;
            n7740DisFasPre = P04QQ4_n7740DisFasPre[0] ;
            A5376DisQuiUl = P04QQ4_A5376DisQuiUl[0] ;
            A3793DisMaqPru = P04QQ4_A3793DisMaqPru[0] ;
            n3793DisMaqPru = P04QQ4_n3793DisMaqPru[0] ;
            A3697FasApr = P04QQ4_A3697FasApr[0] ;
            A457FasCod = P04QQ4_A457FasCod[0] ;
            A368DisFasLin = P04QQ4_A368DisFasLin[0] ;
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W758ProCod = A758ProCod ;
            /*
               INSERT RECORD ON TABLE TXPDISFAS

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W758ProCod = A758ProCod ;
            W368DisFasLin = A368DisFasLin ;
            A361DisCod = AV9NewDiscod ;
            /* Using cursor P04QQ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, A3697FasApr, Boolean.valueOf(n3793DisMaqPru), A3793DisMaqPru, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), Boolean.valueOf(n7915Disfastpp), A7915Disfastpp, Boolean.valueOf(n7916DisFasUpL), A7916DisFasUpL, Boolean.valueOf(n7917DisfasRb), A7917DisfasRb, Boolean.valueOf(n7918Dta_UOrd), Short.valueOf(A7918Dta_UOrd), A9841DisFasObs, Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            A758ProCod = W758ProCod ;
            A368DisFasLin = W368DisFasLin ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppreusatx.this.A396EmprCod;
      this.aP1[0] = ppreusatx.this.AV8Discod;
      this.aP2[0] = ppreusatx.this.AV9NewDiscod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04QQ2_A396EmprCod = new String[] {""} ;
      P04QQ2_A361DisCod = new int[1] ;
      P04QQ2_A12144ProStsFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04QQ2_n12144ProStsFec = new boolean[] {false} ;
      P04QQ2_A12143ProSts = new byte[1] ;
      P04QQ2_n12143ProSts = new boolean[] {false} ;
      P04QQ2_A5334DisFasApr = new String[] {""} ;
      P04QQ2_n5334DisFasApr = new boolean[] {false} ;
      P04QQ2_A846UltFasLin = new short[1] ;
      P04QQ2_A758ProCod = new String[] {""} ;
      A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      A5334DisFasApr = "" ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      P04QQ4_A396EmprCod = new String[] {""} ;
      P04QQ4_A361DisCod = new int[1] ;
      P04QQ4_A758ProCod = new String[] {""} ;
      P04QQ4_A7744FasPreObl = new byte[1] ;
      P04QQ4_n7744FasPreObl = new boolean[] {false} ;
      P04QQ4_A5307DisNumPas = new short[1] ;
      P04QQ4_n5307DisNumPas = new boolean[] {false} ;
      P04QQ4_A5306DisVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QQ4_n5306DisVelPro = new boolean[] {false} ;
      P04QQ4_A5305DisPrePie = new short[1] ;
      P04QQ4_n5305DisPrePie = new boolean[] {false} ;
      P04QQ4_A5304DisPreSal = new short[1] ;
      P04QQ4_n5304DisPreSal = new boolean[] {false} ;
      P04QQ4_A9841DisFasObs = new String[] {""} ;
      P04QQ4_A7918Dta_UOrd = new short[1] ;
      P04QQ4_n7918Dta_UOrd = new boolean[] {false} ;
      P04QQ4_A7917DisfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QQ4_n7917DisfasRb = new boolean[] {false} ;
      P04QQ4_A7916DisFasUpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QQ4_n7916DisFasUpL = new boolean[] {false} ;
      P04QQ4_A7915Disfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QQ4_n7915Disfastpp = new boolean[] {false} ;
      P04QQ4_A7747DisFasAut = new byte[1] ;
      P04QQ4_n7747DisFasAut = new boolean[] {false} ;
      P04QQ4_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QQ4_n7743DisFasRec = new boolean[] {false} ;
      P04QQ4_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QQ4_n7742DisFasDto = new boolean[] {false} ;
      P04QQ4_A7741DisFasUni = new String[] {""} ;
      P04QQ4_n7741DisFasUni = new boolean[] {false} ;
      P04QQ4_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QQ4_n7740DisFasPre = new boolean[] {false} ;
      P04QQ4_A5376DisQuiUl = new short[1] ;
      P04QQ4_A3793DisMaqPru = new String[] {""} ;
      P04QQ4_n3793DisMaqPru = new boolean[] {false} ;
      P04QQ4_A3697FasApr = new String[] {""} ;
      P04QQ4_A457FasCod = new String[] {""} ;
      P04QQ4_A368DisFasLin = new short[1] ;
      A5306DisVelPro = DecimalUtil.ZERO ;
      A9841DisFasObs = "" ;
      A7917DisfasRb = DecimalUtil.ZERO ;
      A7916DisFasUpL = DecimalUtil.ZERO ;
      A7915Disfastpp = DecimalUtil.ZERO ;
      A7743DisFasRec = DecimalUtil.ZERO ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A3793DisMaqPru = "" ;
      A3697FasApr = "" ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreusatx__default(),
         new Object[] {
             new Object[] {
            P04QQ2_A396EmprCod, P04QQ2_A361DisCod, P04QQ2_A12144ProStsFec, P04QQ2_n12144ProStsFec, P04QQ2_A12143ProSts, P04QQ2_n12143ProSts, P04QQ2_A5334DisFasApr, P04QQ2_n5334DisFasApr, P04QQ2_A846UltFasLin, P04QQ2_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04QQ4_A396EmprCod, P04QQ4_A361DisCod, P04QQ4_A758ProCod, P04QQ4_A7744FasPreObl, P04QQ4_n7744FasPreObl, P04QQ4_A5307DisNumPas, P04QQ4_n5307DisNumPas, P04QQ4_A5306DisVelPro, P04QQ4_n5306DisVelPro, P04QQ4_A5305DisPrePie,
            P04QQ4_n5305DisPrePie, P04QQ4_A5304DisPreSal, P04QQ4_n5304DisPreSal, P04QQ4_A9841DisFasObs, P04QQ4_A7918Dta_UOrd, P04QQ4_n7918Dta_UOrd, P04QQ4_A7917DisfasRb, P04QQ4_n7917DisfasRb, P04QQ4_A7916DisFasUpL, P04QQ4_n7916DisFasUpL,
            P04QQ4_A7915Disfastpp, P04QQ4_n7915Disfastpp, P04QQ4_A7747DisFasAut, P04QQ4_n7747DisFasAut, P04QQ4_A7743DisFasRec, P04QQ4_n7743DisFasRec, P04QQ4_A7742DisFasDto, P04QQ4_n7742DisFasDto, P04QQ4_A7741DisFasUni, P04QQ4_n7741DisFasUni,
            P04QQ4_A7740DisFasPre, P04QQ4_n7740DisFasPre, P04QQ4_A5376DisQuiUl, P04QQ4_A3793DisMaqPru, P04QQ4_n3793DisMaqPru, P04QQ4_A3697FasApr, P04QQ4_A457FasCod, P04QQ4_A368DisFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12143ProSts ;
   private byte A7744FasPreObl ;
   private byte A7747DisFasAut ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private short A5307DisNumPas ;
   private short A5305DisPrePie ;
   private short A5304DisPreSal ;
   private short A7918Dta_UOrd ;
   private short A5376DisQuiUl ;
   private short A368DisFasLin ;
   private short W368DisFasLin ;
   private int AV8Discod ;
   private int AV9NewDiscod ;
   private int A361DisCod ;
   private int W361DisCod ;
   private int GX_INS38 ;
   private int GX_INS39 ;
   private java.math.BigDecimal A5306DisVelPro ;
   private java.math.BigDecimal A7917DisfasRb ;
   private java.math.BigDecimal A7916DisFasUpL ;
   private java.math.BigDecimal A7915Disfastpp ;
   private java.math.BigDecimal A7743DisFasRec ;
   private java.math.BigDecimal A7742DisFasDto ;
   private java.math.BigDecimal A7740DisFasPre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5334DisFasApr ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A7741DisFasUni ;
   private String A3793DisMaqPru ;
   private String A3697FasApr ;
   private String A457FasCod ;
   private java.util.Date A12144ProStsFec ;
   private boolean n12144ProStsFec ;
   private boolean n12143ProSts ;
   private boolean n5334DisFasApr ;
   private boolean n7744FasPreObl ;
   private boolean n5307DisNumPas ;
   private boolean n5306DisVelPro ;
   private boolean n5305DisPrePie ;
   private boolean n5304DisPreSal ;
   private boolean n7918Dta_UOrd ;
   private boolean n7917DisfasRb ;
   private boolean n7916DisFasUpL ;
   private boolean n7915Disfastpp ;
   private boolean n7747DisFasAut ;
   private boolean n7743DisFasRec ;
   private boolean n7742DisFasDto ;
   private boolean n7741DisFasUni ;
   private boolean n7740DisFasPre ;
   private boolean n3793DisMaqPru ;
   private String A9841DisFasObs ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04QQ2_A396EmprCod ;
   private int[] P04QQ2_A361DisCod ;
   private java.util.Date[] P04QQ2_A12144ProStsFec ;
   private boolean[] P04QQ2_n12144ProStsFec ;
   private byte[] P04QQ2_A12143ProSts ;
   private boolean[] P04QQ2_n12143ProSts ;
   private String[] P04QQ2_A5334DisFasApr ;
   private boolean[] P04QQ2_n5334DisFasApr ;
   private short[] P04QQ2_A846UltFasLin ;
   private String[] P04QQ2_A758ProCod ;
   private String[] P04QQ4_A396EmprCod ;
   private int[] P04QQ4_A361DisCod ;
   private String[] P04QQ4_A758ProCod ;
   private byte[] P04QQ4_A7744FasPreObl ;
   private boolean[] P04QQ4_n7744FasPreObl ;
   private short[] P04QQ4_A5307DisNumPas ;
   private boolean[] P04QQ4_n5307DisNumPas ;
   private java.math.BigDecimal[] P04QQ4_A5306DisVelPro ;
   private boolean[] P04QQ4_n5306DisVelPro ;
   private short[] P04QQ4_A5305DisPrePie ;
   private boolean[] P04QQ4_n5305DisPrePie ;
   private short[] P04QQ4_A5304DisPreSal ;
   private boolean[] P04QQ4_n5304DisPreSal ;
   private String[] P04QQ4_A9841DisFasObs ;
   private short[] P04QQ4_A7918Dta_UOrd ;
   private boolean[] P04QQ4_n7918Dta_UOrd ;
   private java.math.BigDecimal[] P04QQ4_A7917DisfasRb ;
   private boolean[] P04QQ4_n7917DisfasRb ;
   private java.math.BigDecimal[] P04QQ4_A7916DisFasUpL ;
   private boolean[] P04QQ4_n7916DisFasUpL ;
   private java.math.BigDecimal[] P04QQ4_A7915Disfastpp ;
   private boolean[] P04QQ4_n7915Disfastpp ;
   private byte[] P04QQ4_A7747DisFasAut ;
   private boolean[] P04QQ4_n7747DisFasAut ;
   private java.math.BigDecimal[] P04QQ4_A7743DisFasRec ;
   private boolean[] P04QQ4_n7743DisFasRec ;
   private java.math.BigDecimal[] P04QQ4_A7742DisFasDto ;
   private boolean[] P04QQ4_n7742DisFasDto ;
   private String[] P04QQ4_A7741DisFasUni ;
   private boolean[] P04QQ4_n7741DisFasUni ;
   private java.math.BigDecimal[] P04QQ4_A7740DisFasPre ;
   private boolean[] P04QQ4_n7740DisFasPre ;
   private short[] P04QQ4_A5376DisQuiUl ;
   private String[] P04QQ4_A3793DisMaqPru ;
   private boolean[] P04QQ4_n3793DisMaqPru ;
   private String[] P04QQ4_A3697FasApr ;
   private String[] P04QQ4_A457FasCod ;
   private short[] P04QQ4_A368DisFasLin ;
}

final  class ppreusatx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QQ2", "SELECT EmprCod, DisCod, ProStsFec, ProSts, DisFasApr, UltFasLin, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04QQ3", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P04QQ4", "SELECT EmprCod, DisCod, ProCod, FasPreObl, DisNumPas, DisVelPro, DisPrePie, DisPreSal, DisFasObs, Dta_UOrd, DisfasRb, DisFasUpL, Disfastpp, DisFasAut, DisFasRec, DisFasDto, DisFasUni, DisFasPre, DisQuiUl, DisMaqPru, FasApr, FasCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04QQ5", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9);
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((String[]) buf[33])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((String[]) buf[36])[0] = rslt.getString(22, 8);
               ((short[]) buf[37])[0] = rslt.getShort(23);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               stmt.setVarchar(18, (String)parms[27], 3000, false);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[37]).byteValue());
               }
               return;
      }
   }

}

