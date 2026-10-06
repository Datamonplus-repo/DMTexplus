package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls021 extends GXProcedure
{
   public pcls021( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls021.class ), "" );
   }

   public pcls021( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pcls021.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pcls021.this.AV29EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls021.this.AV26BarCod = aP1[0];
      this.aP1 = aP1;
      pcls021.this.AV28BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls021.this.AV27BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls021.this.AV40RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV41Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcls021.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      GXv_char2[0] = AV29EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char4[0] = AV42UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcls021.this.AV29EmprCod = GXv_char2[0] ;
      pcls021.this.AV30EmprNom = GXv_char3[0] ;
      pcls021.this.AV42UsurCod = GXv_char4[0] ;
      AV32Flag2 = (byte)(0) ;
      AV38RcT = (short)(0) ;
      /* Using cursor P05632 */
      pr_default.execute(0, new Object[] {AV29EmprCod, Integer.valueOf(AV26BarCod), Byte.valueOf(AV28BarCodReo), AV27BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05632_A130BarCodPar[0] ;
         A132BarCodReo = P05632_A132BarCodReo[0] ;
         A129BarCod = P05632_A129BarCod[0] ;
         A396EmprCod = P05632_A396EmprCod[0] ;
         A6039RecAcab = P05632_A6039RecAcab[0] ;
         n6039RecAcab = P05632_n6039RecAcab[0] ;
         A2804RecLinMaq = P05632_A2804RecLinMaq[0] ;
         AV32Flag2 = (byte)(AV32Flag2+1) ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV38RcT = (short)(AV38RcT+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV39RECACAB = httpContext.getMessage( "N", "") ;
      /* Using cursor P05633 */
      pr_default.execute(1, new Object[] {AV29EmprCod, Integer.valueOf(AV26BarCod), Byte.valueOf(AV28BarCodReo), AV27BarCodPar, Short.valueOf(AV40RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P05633_A2804RecLinMaq[0] ;
         A130BarCodPar = P05633_A130BarCodPar[0] ;
         A132BarCodReo = P05633_A132BarCodReo[0] ;
         A129BarCod = P05633_A129BarCod[0] ;
         A396EmprCod = P05633_A396EmprCod[0] ;
         A6039RecAcab = P05633_A6039RecAcab[0] ;
         n6039RecAcab = P05633_n6039RecAcab[0] ;
         AV39RECACAB = A6039RecAcab ;
         /* Optimized DELETE. */
         /* Using cursor P05634 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECFAG");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P05635 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV40RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
         /* End optimized DELETE. */
         /* Using cursor P05636 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1273RecLinPro = P05636_A1273RecLinPro[0] ;
            A764ProForCod = P05636_A764ProForCod[0] ;
            /* Optimized DELETE. */
            /* Using cursor P05637 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P05638 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSREC");
            /* End optimized DELETE. */
            /* Using cursor P05639 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P056310 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV39RECACAB, httpContext.getMessage( "S", "")) != 0 )
      {
         /* Using cursor P056311 */
         pr_default.execute(9, new Object[] {AV29EmprCod, Integer.valueOf(AV26BarCod), Byte.valueOf(AV28BarCodReo), AV27BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A130BarCodPar = P056311_A130BarCodPar[0] ;
            A132BarCodReo = P056311_A132BarCodReo[0] ;
            A129BarCod = P056311_A129BarCod[0] ;
            A396EmprCod = P056311_A396EmprCod[0] ;
            A212BarSer = P056311_A212BarSer[0] ;
            A213BarSit = P056311_A213BarSit[0] ;
            if ( ( ( A213BarSit == 4 ) && ( AV32Flag2 <= 1 ) ) || ( ( A213BarSit == 4 ) && ( AV38RcT <= 1 ) ) || ( ( A213BarSit == 1 ) && ( AV38RcT <= 1 ) ) || ( A213BarSit == 5 ) )
            {
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
      if ( AV32Flag2 <= 1 )
      {
         /* Using cursor P056312 */
         pr_default.execute(10, new Object[] {AV29EmprCod, Integer.valueOf(AV26BarCod), Byte.valueOf(AV28BarCodReo), AV27BarCodPar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A130BarCodPar = P056312_A130BarCodPar[0] ;
            A132BarCodReo = P056312_A132BarCodReo[0] ;
            A129BarCod = P056312_A129BarCod[0] ;
            A2792TermiCod = P056312_A2792TermiCod[0] ;
            A396EmprCod = P056312_A396EmprCod[0] ;
            A2793BarULinMaq = P056312_A2793BarULinMaq[0] ;
            n2793BarULinMaq = P056312_n2793BarULinMaq[0] ;
            /* Using cursor P056313 */
            pr_default.execute(11, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A2794BarLinMaq = P056313_A2794BarLinMaq[0] ;
               A2795BarMaqPrf = P056313_A2795BarMaqPrf[0] ;
               n2795BarMaqPrf = P056313_n2795BarMaqPrf[0] ;
               /* Optimized DELETE. */
               /* Using cursor P056314 */
               pr_default.execute(12, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
               /* End optimized DELETE. */
               /* Using cursor P056315 */
               pr_default.execute(13, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
               pr_default.readNext(11);
            }
            pr_default.close(11);
            /* Using cursor P056316 */
            pr_default.execute(14, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
            pr_default.readNext(10);
         }
         pr_default.close(10);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls021.this.AV29EmprCod;
      this.aP1[0] = pcls021.this.AV26BarCod;
      this.aP2[0] = pcls021.this.AV28BarCodReo;
      this.aP3[0] = pcls021.this.AV27BarCodPar;
      this.aP4[0] = pcls021.this.AV40RecLinMaq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV41Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV30EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV42UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P05632_A130BarCodPar = new String[] {""} ;
      P05632_A132BarCodReo = new byte[1] ;
      P05632_A129BarCod = new int[1] ;
      P05632_A396EmprCod = new String[] {""} ;
      P05632_A6039RecAcab = new String[] {""} ;
      P05632_n6039RecAcab = new boolean[] {false} ;
      P05632_A2804RecLinMaq = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A6039RecAcab = "" ;
      AV39RECACAB = "" ;
      P05633_A2804RecLinMaq = new short[1] ;
      P05633_A130BarCodPar = new String[] {""} ;
      P05633_A132BarCodReo = new byte[1] ;
      P05633_A129BarCod = new int[1] ;
      P05633_A396EmprCod = new String[] {""} ;
      P05633_A6039RecAcab = new String[] {""} ;
      P05633_n6039RecAcab = new boolean[] {false} ;
      P05636_A396EmprCod = new String[] {""} ;
      P05636_A129BarCod = new int[1] ;
      P05636_A132BarCodReo = new byte[1] ;
      P05636_A130BarCodPar = new String[] {""} ;
      P05636_A2804RecLinMaq = new short[1] ;
      P05636_A1273RecLinPro = new byte[1] ;
      P05636_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P056311_A130BarCodPar = new String[] {""} ;
      P056311_A132BarCodReo = new byte[1] ;
      P056311_A129BarCod = new int[1] ;
      P056311_A396EmprCod = new String[] {""} ;
      P056311_A212BarSer = new String[] {""} ;
      P056311_A213BarSit = new byte[1] ;
      A212BarSer = "" ;
      P056312_A130BarCodPar = new String[] {""} ;
      P056312_A132BarCodReo = new byte[1] ;
      P056312_A129BarCod = new int[1] ;
      P056312_A2792TermiCod = new String[] {""} ;
      P056312_A396EmprCod = new String[] {""} ;
      P056312_A2793BarULinMaq = new short[1] ;
      P056312_n2793BarULinMaq = new boolean[] {false} ;
      A2792TermiCod = "" ;
      P056313_A396EmprCod = new String[] {""} ;
      P056313_A2792TermiCod = new String[] {""} ;
      P056313_A129BarCod = new int[1] ;
      P056313_A132BarCodReo = new byte[1] ;
      P056313_A130BarCodPar = new String[] {""} ;
      P056313_A2794BarLinMaq = new short[1] ;
      P056313_A2795BarMaqPrf = new String[] {""} ;
      P056313_n2795BarMaqPrf = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls021__default(),
         new Object[] {
             new Object[] {
            P05632_A130BarCodPar, P05632_A132BarCodReo, P05632_A129BarCod, P05632_A396EmprCod, P05632_A6039RecAcab, P05632_n6039RecAcab, P05632_A2804RecLinMaq
            }
            , new Object[] {
            P05633_A2804RecLinMaq, P05633_A130BarCodPar, P05633_A132BarCodReo, P05633_A129BarCod, P05633_A396EmprCod, P05633_A6039RecAcab, P05633_n6039RecAcab
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05636_A396EmprCod, P05636_A129BarCod, P05636_A132BarCodReo, P05636_A130BarCodPar, P05636_A2804RecLinMaq, P05636_A1273RecLinPro, P05636_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P056311_A130BarCodPar, P056311_A132BarCodReo, P056311_A129BarCod, P056311_A396EmprCod, P056311_A212BarSer, P056311_A213BarSit
            }
            , new Object[] {
            P056312_A130BarCodPar, P056312_A132BarCodReo, P056312_A129BarCod, P056312_A2792TermiCod, P056312_A396EmprCod, P056312_A2793BarULinMaq, P056312_n2793BarULinMaq
            }
            , new Object[] {
            P056313_A396EmprCod, P056313_A2792TermiCod, P056313_A129BarCod, P056313_A132BarCodReo, P056313_A130BarCodPar, P056313_A2794BarLinMaq, P056313_A2795BarMaqPrf, P056313_n2795BarMaqPrf
            }
            , new Object[] {
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

   private byte AV28BarCodReo ;
   private byte AV32Flag2 ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A213BarSit ;
   private short AV40RecLinMaq ;
   private short AV38RcT ;
   private short A2804RecLinMaq ;
   private short A2793BarULinMaq ;
   private short A2794BarLinMaq ;
   private short Gx_err ;
   private int AV26BarCod ;
   private int A129BarCod ;
   private String AV29EmprCod ;
   private String AV27BarCodPar ;
   private String AV41Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV30EmprNom ;
   private String GXv_char3[] ;
   private String AV42UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A6039RecAcab ;
   private String AV39RECACAB ;
   private String A764ProForCod ;
   private String A212BarSer ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private boolean n6039RecAcab ;
   private boolean n2793BarULinMaq ;
   private boolean n2795BarMaqPrf ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05632_A130BarCodPar ;
   private byte[] P05632_A132BarCodReo ;
   private int[] P05632_A129BarCod ;
   private String[] P05632_A396EmprCod ;
   private String[] P05632_A6039RecAcab ;
   private boolean[] P05632_n6039RecAcab ;
   private short[] P05632_A2804RecLinMaq ;
   private short[] P05633_A2804RecLinMaq ;
   private String[] P05633_A130BarCodPar ;
   private byte[] P05633_A132BarCodReo ;
   private int[] P05633_A129BarCod ;
   private String[] P05633_A396EmprCod ;
   private String[] P05633_A6039RecAcab ;
   private boolean[] P05633_n6039RecAcab ;
   private String[] P05636_A396EmprCod ;
   private int[] P05636_A129BarCod ;
   private byte[] P05636_A132BarCodReo ;
   private String[] P05636_A130BarCodPar ;
   private short[] P05636_A2804RecLinMaq ;
   private byte[] P05636_A1273RecLinPro ;
   private String[] P05636_A764ProForCod ;
   private String[] P056311_A130BarCodPar ;
   private byte[] P056311_A132BarCodReo ;
   private int[] P056311_A129BarCod ;
   private String[] P056311_A396EmprCod ;
   private String[] P056311_A212BarSer ;
   private byte[] P056311_A213BarSit ;
   private String[] P056312_A130BarCodPar ;
   private byte[] P056312_A132BarCodReo ;
   private int[] P056312_A129BarCod ;
   private String[] P056312_A2792TermiCod ;
   private String[] P056312_A396EmprCod ;
   private short[] P056312_A2793BarULinMaq ;
   private boolean[] P056312_n2793BarULinMaq ;
   private String[] P056313_A396EmprCod ;
   private String[] P056313_A2792TermiCod ;
   private int[] P056313_A129BarCod ;
   private byte[] P056313_A132BarCodReo ;
   private String[] P056313_A130BarCodPar ;
   private short[] P056313_A2794BarLinMaq ;
   private String[] P056313_A2795BarMaqPrf ;
   private boolean[] P056313_n2795BarMaqPrf ;
}

final  class pcls021__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05632", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, RecAcab, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05633", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecAcab FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05634", "DELETE FROM TXPRECFAG  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECFAG")
         ,new UpdateCursor("P05635", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
         ,new ForEachCursor("P05636", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05637", "DELETE FROM TXPLRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P05638", "DELETE FROM TXPOBSREC  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSREC")
         ,new UpdateCursor("P05639", "DELETE FROM TXPCRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P056310", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P056311", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSer, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056312", "SELECT BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarULinMaq FROM TXPBARTER WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056313", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P056314", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P056315", "DELETE FROM TXPBARMAQ  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P056316", "DELETE FROM TXPBARTER  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

