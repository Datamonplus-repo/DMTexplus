package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdomov extends GXProcedure
{
   public ppdomov( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdomov.class ), "" );
   }

   public ppdomov( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      ppdomov.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      ppdomov.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdomov.this.AV15PartCod = aP1[0];
      this.aP1 = aP1;
      ppdomov.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      ppdomov.this.AV17PartLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      AV19MovParUli = (short)(0) ;
      /* Using cursor P00D22 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15PartCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00D22_A252CliCod[0] ;
         A2268MovParCod = P00D22_A2268MovParCod[0] ;
         A2272MovParULi = P00D22_A2272MovParULi[0] ;
         n2272MovParULi = P00D22_n2272MovParULi[0] ;
         AV18Flag = (byte)(1) ;
         AV19MovParUli = A2272MovParULi ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18Flag == 0 )
      {
         /* Using cursor P00D23 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV15PartCod, Integer.valueOf(AV16CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1456ParArtCod = P00D23_A1456ParArtCod[0] ;
            n1456ParArtCod = P00D23_n1456ParArtCod[0] ;
            A1457ParNMtr = P00D23_A1457ParNMtr[0] ;
            n1457ParNMtr = P00D23_n1457ParNMtr[0] ;
            A2240PartDsc = P00D23_A2240PartDsc[0] ;
            n2240PartDsc = P00D23_n2240PartDsc[0] ;
            A2241PartSec = P00D23_A2241PartSec[0] ;
            n2241PartSec = P00D23_n2241PartSec[0] ;
            A2244PartReo = P00D23_A2244PartReo[0] ;
            n2244PartReo = P00D23_n2244PartReo[0] ;
            A970ProceCod = P00D23_A970ProceCod[0] ;
            n970ProceCod = P00D23_n970ProceCod[0] ;
            A252CliCod = P00D23_A252CliCod[0] ;
            A966PartCod = P00D23_A966PartCod[0] ;
            W252CliCod = A252CliCod ;
            /*
               INSERT RECORD ON TABLE TXPCMOVPD

            */
            W252CliCod = A252CliCod ;
            A2268MovParCod = AV15PartCod ;
            A252CliCod = AV16CliCod ;
            A2269MovParArt = A1456ParArtCod ;
            n2269MovParArt = false ;
            A2270MovParNh = A1457ParNMtr ;
            n2270MovParNh = false ;
            A2271MovParEst = (byte)(0) ;
            n2271MovParEst = false ;
            A2272MovParULi = (short)(0) ;
            n2272MovParULi = false ;
            A2273MovParDsc = A2240PartDsc ;
            n2273MovParDsc = false ;
            A2274MovParSec = A2241PartSec ;
            n2274MovParSec = false ;
            A2275MovParReo = A2244PartReo ;
            n2275MovParReo = false ;
            /* Using cursor P00D24 */
            pr_default.execute(2, new Object[] {A396EmprCod, A2268MovParCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n2269MovParArt), A2269MovParArt, Boolean.valueOf(n2270MovParNh), A2270MovParNh, Boolean.valueOf(n2271MovParEst), Byte.valueOf(A2271MovParEst), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n2272MovParULi), Short.valueOf(A2272MovParULi), Boolean.valueOf(n2273MovParDsc), A2273MovParDsc, Boolean.valueOf(n2274MovParSec), A2274MovParSec, Boolean.valueOf(n2275MovParReo), A2275MovParReo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMOVPD");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A252CliCod = W252CliCod ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      /* Using cursor P00D25 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV15PartCod, Integer.valueOf(AV16CliCod), Integer.valueOf(AV17PartLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A981PartAlbDis = P00D25_A981PartAlbDis[0] ;
         n981PartAlbDis = P00D25_n981PartAlbDis[0] ;
         A983PartFecMov = P00D25_A983PartFecMov[0] ;
         n983PartFecMov = P00D25_n983PartFecMov[0] ;
         A984KilEnt = P00D25_A984KilEnt[0] ;
         n984KilEnt = P00D25_n984KilEnt[0] ;
         A985ConEnt = P00D25_A985ConEnt[0] ;
         n985ConEnt = P00D25_n985ConEnt[0] ;
         A982PartSitDis = P00D25_A982PartSitDis[0] ;
         n982PartSitDis = P00D25_n982PartSitDis[0] ;
         A1877PartLoc = P00D25_A1877PartLoc[0] ;
         n1877PartLoc = P00D25_n1877PartLoc[0] ;
         A979PartLin = P00D25_A979PartLin[0] ;
         A252CliCod = P00D25_A252CliCod[0] ;
         A966PartCod = P00D25_A966PartCod[0] ;
         W252CliCod = A252CliCod ;
         /*
            INSERT RECORD ON TABLE TXPLMOVPD

         */
         W252CliCod = A252CliCod ;
         A2268MovParCod = AV15PartCod ;
         A252CliCod = AV16CliCod ;
         A2276MovParLin = (short)(AV19MovParUli+1) ;
         A2277MovParLiT = httpContext.getMessage( "E", "") ;
         n2277MovParLiT = false ;
         A2278MovParAlb = A981PartAlbDis ;
         n2278MovParAlb = false ;
         A2280MovParFec = A983PartFecMov ;
         n2280MovParFec = false ;
         A2281MovParKE = A984KilEnt ;
         n2281MovParKE = false ;
         A2282MovParCE = A985ConEnt ;
         n2282MovParCE = false ;
         A2279MovParSit = A982PartSitDis ;
         n2279MovParSit = false ;
         A2285MovParLoc = A1877PartLoc ;
         n2285MovParLoc = false ;
         /* Using cursor P00D26 */
         pr_default.execute(4, new Object[] {A396EmprCod, A2268MovParCod, Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin), Boolean.valueOf(n2277MovParLiT), A2277MovParLiT, Boolean.valueOf(n2278MovParAlb), Integer.valueOf(A2278MovParAlb), Boolean.valueOf(n2279MovParSit), A2279MovParSit, Boolean.valueOf(n2280MovParFec), A2280MovParFec, Boolean.valueOf(n2281MovParKE), A2281MovParKE, Boolean.valueOf(n2282MovParCE), Short.valueOf(A2282MovParCE), Boolean.valueOf(n2285MovParLoc), A2285MovParLoc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A252CliCod = W252CliCod ;
         /* End Insert */
         A252CliCod = W252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      n2272MovParULi = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00D27 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV15PartCod, Integer.valueOf(AV16CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMOVPD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdomov.this.A396EmprCod;
      this.aP1[0] = ppdomov.this.AV15PartCod;
      this.aP2[0] = ppdomov.this.AV16CliCod;
      this.aP3[0] = ppdomov.this.AV17PartLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppdomov");
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
      P00D22_A396EmprCod = new String[] {""} ;
      P00D22_A252CliCod = new int[1] ;
      P00D22_A2268MovParCod = new String[] {""} ;
      P00D22_A2272MovParULi = new short[1] ;
      P00D22_n2272MovParULi = new boolean[] {false} ;
      A2268MovParCod = "" ;
      P00D23_A396EmprCod = new String[] {""} ;
      P00D23_A1456ParArtCod = new String[] {""} ;
      P00D23_n1456ParArtCod = new boolean[] {false} ;
      P00D23_A1457ParNMtr = new String[] {""} ;
      P00D23_n1457ParNMtr = new boolean[] {false} ;
      P00D23_A2240PartDsc = new String[] {""} ;
      P00D23_n2240PartDsc = new boolean[] {false} ;
      P00D23_A2241PartSec = new String[] {""} ;
      P00D23_n2241PartSec = new boolean[] {false} ;
      P00D23_A2244PartReo = new String[] {""} ;
      P00D23_n2244PartReo = new boolean[] {false} ;
      P00D23_A970ProceCod = new short[1] ;
      P00D23_n970ProceCod = new boolean[] {false} ;
      P00D23_A252CliCod = new int[1] ;
      P00D23_A966PartCod = new String[] {""} ;
      A1456ParArtCod = "" ;
      A1457ParNMtr = "" ;
      A2240PartDsc = "" ;
      A2241PartSec = "" ;
      A2244PartReo = "" ;
      A966PartCod = "" ;
      A2269MovParArt = "" ;
      A2270MovParNh = "" ;
      A2273MovParDsc = "" ;
      A2274MovParSec = "" ;
      A2275MovParReo = "" ;
      Gx_emsg = "" ;
      P00D25_A396EmprCod = new String[] {""} ;
      P00D25_A981PartAlbDis = new int[1] ;
      P00D25_n981PartAlbDis = new boolean[] {false} ;
      P00D25_A983PartFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P00D25_n983PartFecMov = new boolean[] {false} ;
      P00D25_A984KilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00D25_n984KilEnt = new boolean[] {false} ;
      P00D25_A985ConEnt = new short[1] ;
      P00D25_n985ConEnt = new boolean[] {false} ;
      P00D25_A982PartSitDis = new String[] {""} ;
      P00D25_n982PartSitDis = new boolean[] {false} ;
      P00D25_A1877PartLoc = new String[] {""} ;
      P00D25_n1877PartLoc = new boolean[] {false} ;
      P00D25_A979PartLin = new int[1] ;
      P00D25_A252CliCod = new int[1] ;
      P00D25_A966PartCod = new String[] {""} ;
      A983PartFecMov = GXutil.nullDate() ;
      A984KilEnt = DecimalUtil.ZERO ;
      A982PartSitDis = "" ;
      A1877PartLoc = "" ;
      A2277MovParLiT = "" ;
      A2280MovParFec = GXutil.nullDate() ;
      A2281MovParKE = DecimalUtil.ZERO ;
      A2279MovParSit = "" ;
      A2285MovParLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdomov__default(),
         new Object[] {
             new Object[] {
            P00D22_A396EmprCod, P00D22_A252CliCod, P00D22_A2268MovParCod, P00D22_A2272MovParULi, P00D22_n2272MovParULi
            }
            , new Object[] {
            P00D23_A396EmprCod, P00D23_A1456ParArtCod, P00D23_n1456ParArtCod, P00D23_A1457ParNMtr, P00D23_n1457ParNMtr, P00D23_A2240PartDsc, P00D23_n2240PartDsc, P00D23_A2241PartSec, P00D23_n2241PartSec, P00D23_A2244PartReo,
            P00D23_n2244PartReo, P00D23_A970ProceCod, P00D23_n970ProceCod, P00D23_A252CliCod, P00D23_A966PartCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00D25_A396EmprCod, P00D25_A981PartAlbDis, P00D25_n981PartAlbDis, P00D25_A983PartFecMov, P00D25_n983PartFecMov, P00D25_A984KilEnt, P00D25_n984KilEnt, P00D25_A985ConEnt, P00D25_n985ConEnt, P00D25_A982PartSitDis,
            P00D25_n982PartSitDis, P00D25_A1877PartLoc, P00D25_n1877PartLoc, P00D25_A979PartLin, P00D25_A252CliCod, P00D25_A966PartCod
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

   private byte AV18Flag ;
   private byte A2271MovParEst ;
   private short AV19MovParUli ;
   private short A2272MovParULi ;
   private short A970ProceCod ;
   private short Gx_err ;
   private short A985ConEnt ;
   private short A2276MovParLin ;
   private short A2282MovParCE ;
   private int AV16CliCod ;
   private int AV17PartLin ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS307 ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
   private int GX_INS308 ;
   private int A2278MovParAlb ;
   private java.math.BigDecimal A984KilEnt ;
   private java.math.BigDecimal A2281MovParKE ;
   private String A396EmprCod ;
   private String AV15PartCod ;
   private String scmdbuf ;
   private String A2268MovParCod ;
   private String A1456ParArtCod ;
   private String A1457ParNMtr ;
   private String A2240PartDsc ;
   private String A2241PartSec ;
   private String A2244PartReo ;
   private String A966PartCod ;
   private String A2269MovParArt ;
   private String A2270MovParNh ;
   private String A2273MovParDsc ;
   private String A2274MovParSec ;
   private String A2275MovParReo ;
   private String Gx_emsg ;
   private String A982PartSitDis ;
   private String A1877PartLoc ;
   private String A2277MovParLiT ;
   private String A2279MovParSit ;
   private String A2285MovParLoc ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A2280MovParFec ;
   private boolean n2272MovParULi ;
   private boolean n1456ParArtCod ;
   private boolean n1457ParNMtr ;
   private boolean n2240PartDsc ;
   private boolean n2241PartSec ;
   private boolean n2244PartReo ;
   private boolean n970ProceCod ;
   private boolean n2269MovParArt ;
   private boolean n2270MovParNh ;
   private boolean n2271MovParEst ;
   private boolean n2273MovParDsc ;
   private boolean n2274MovParSec ;
   private boolean n2275MovParReo ;
   private boolean n981PartAlbDis ;
   private boolean n983PartFecMov ;
   private boolean n984KilEnt ;
   private boolean n985ConEnt ;
   private boolean n982PartSitDis ;
   private boolean n1877PartLoc ;
   private boolean n2277MovParLiT ;
   private boolean n2278MovParAlb ;
   private boolean n2280MovParFec ;
   private boolean n2281MovParKE ;
   private boolean n2282MovParCE ;
   private boolean n2279MovParSit ;
   private boolean n2285MovParLoc ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00D22_A396EmprCod ;
   private int[] P00D22_A252CliCod ;
   private String[] P00D22_A2268MovParCod ;
   private short[] P00D22_A2272MovParULi ;
   private boolean[] P00D22_n2272MovParULi ;
   private String[] P00D23_A396EmprCod ;
   private String[] P00D23_A1456ParArtCod ;
   private boolean[] P00D23_n1456ParArtCod ;
   private String[] P00D23_A1457ParNMtr ;
   private boolean[] P00D23_n1457ParNMtr ;
   private String[] P00D23_A2240PartDsc ;
   private boolean[] P00D23_n2240PartDsc ;
   private String[] P00D23_A2241PartSec ;
   private boolean[] P00D23_n2241PartSec ;
   private String[] P00D23_A2244PartReo ;
   private boolean[] P00D23_n2244PartReo ;
   private short[] P00D23_A970ProceCod ;
   private boolean[] P00D23_n970ProceCod ;
   private int[] P00D23_A252CliCod ;
   private String[] P00D23_A966PartCod ;
   private String[] P00D25_A396EmprCod ;
   private int[] P00D25_A981PartAlbDis ;
   private boolean[] P00D25_n981PartAlbDis ;
   private java.util.Date[] P00D25_A983PartFecMov ;
   private boolean[] P00D25_n983PartFecMov ;
   private java.math.BigDecimal[] P00D25_A984KilEnt ;
   private boolean[] P00D25_n984KilEnt ;
   private short[] P00D25_A985ConEnt ;
   private boolean[] P00D25_n985ConEnt ;
   private String[] P00D25_A982PartSitDis ;
   private boolean[] P00D25_n982PartSitDis ;
   private String[] P00D25_A1877PartLoc ;
   private boolean[] P00D25_n1877PartLoc ;
   private int[] P00D25_A979PartLin ;
   private int[] P00D25_A252CliCod ;
   private String[] P00D25_A966PartCod ;
}

final  class ppdomov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00D22", "SELECT EmprCod, CliCod, MovParCod, MovParULi FROM TXPCMOVPD WHERE EmprCod = ? and MovParCod = ? and CliCod = ? ORDER BY EmprCod, MovParCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00D23", "SELECT EmprCod, ParArtCod, ParNMtr, PartDsc, PartSec, PartReo, ProceCod, CliCod, PartCod FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00D24", "INSERT INTO TXPCMOVPD(EmprCod, MovParCod, CliCod, MovParArt, MovParNh, MovParEst, ProceCod, MovParULi, MovParDsc, MovParSec, MovParReo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMOVPD")
         ,new ForEachCursor("P00D25", "SELECT EmprCod, PartAlbDis, PartFecMov, KilEnt, ConEnt, PartSitDis, PartLoc, PartLin, CliCod, PartCod FROM TXPLPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? and PartLin = ? ORDER BY EmprCod, PartCod, CliCod, PartLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00D26", "INSERT INTO TXPLMOVPD(EmprCod, MovParCod, CliCod, MovParLin, MovParLiT, MovParAlb, MovParSit, MovParFec, MovParKE, MovParCE, MovParLoc, MovParKU, MovParCU, MovParExL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
         ,new UpdateCursor("P00D27", "UPDATE TXPCMOVPD SET MovParULi=MovParULi + 1  WHERE EmprCod = ? and MovParCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMOVPD")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((String[]) buf[14])[0] = rslt.getString(9, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 16);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 26);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 2);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 10);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

