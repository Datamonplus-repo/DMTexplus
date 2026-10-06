package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcldy07 extends GXProcedure
{
   public pcldy07( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcldy07.class ), "" );
   }

   public pcldy07( int remoteHandle ,
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
      pcldy07.this.aP4 = new short[] {0};
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
      pcldy07.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcldy07.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pcldy07.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcldy07.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcldy07.this.AV20RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV15EmprCod ;
      GXv_char2[0] = AV29EmprNom ;
      GXv_char3[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char1, GXv_char2, GXv_char3) ;
      pcldy07.this.AV15EmprCod = GXv_char1[0] ;
      pcldy07.this.AV29EmprNom = GXv_char2[0] ;
      pcldy07.this.AV30UsurCod = GXv_char3[0] ;
      AV21Flag2 = (byte)(0) ;
      AV31RcT = (short)(0) ;
      /* Using cursor P04LX2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04LX2_A130BarCodPar[0] ;
         A132BarCodReo = P04LX2_A132BarCodReo[0] ;
         A129BarCod = P04LX2_A129BarCod[0] ;
         A396EmprCod = P04LX2_A396EmprCod[0] ;
         A6039RecAcab = P04LX2_A6039RecAcab[0] ;
         n6039RecAcab = P04LX2_n6039RecAcab[0] ;
         A2804RecLinMaq = P04LX2_A2804RecLinMaq[0] ;
         AV21Flag2 = (byte)(AV21Flag2+1) ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV31RcT = (short)(AV31RcT+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV25RECACAB = httpContext.getMessage( "N", "") ;
      /* Using cursor P04LX3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV20RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P04LX3_A2804RecLinMaq[0] ;
         A130BarCodPar = P04LX3_A130BarCodPar[0] ;
         A132BarCodReo = P04LX3_A132BarCodReo[0] ;
         A129BarCod = P04LX3_A129BarCod[0] ;
         A396EmprCod = P04LX3_A396EmprCod[0] ;
         A6039RecAcab = P04LX3_A6039RecAcab[0] ;
         n6039RecAcab = P04LX3_n6039RecAcab[0] ;
         AV25RECACAB = A6039RecAcab ;
         /* Optimized DELETE. */
         /* Using cursor P04LX4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECFAG");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P04LX5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV20RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
         /* End optimized DELETE. */
         /* Using cursor P04LX6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1273RecLinPro = P04LX6_A1273RecLinPro[0] ;
            A764ProForCod = P04LX6_A764ProForCod[0] ;
            /* Optimized DELETE. */
            /* Using cursor P04LX7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P04LX8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSREC");
            /* End optimized DELETE. */
            /* Using cursor P04LX9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P04LX10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV25RECACAB, httpContext.getMessage( "S", "")) != 0 )
      {
         /* Using cursor P04LX11 */
         pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A130BarCodPar = P04LX11_A130BarCodPar[0] ;
            A132BarCodReo = P04LX11_A132BarCodReo[0] ;
            A129BarCod = P04LX11_A129BarCod[0] ;
            A396EmprCod = P04LX11_A396EmprCod[0] ;
            A212BarSer = P04LX11_A212BarSer[0] ;
            A213BarSit = P04LX11_A213BarSit[0] ;
            if ( ( ( A213BarSit == 4 ) && ( AV21Flag2 <= 1 ) ) || ( ( A213BarSit == 4 ) && ( AV31RcT <= 1 ) ) || ( ( A213BarSit == 1 ) && ( AV31RcT <= 1 ) ) || ( GXutil.strcmp(AV27Inc_obs, httpContext.getMessage( "Eliminacion Receta.Cambio Situacion. ", "")+GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar+GXutil.newLine( )) == 0 ) )
            {
               AV27Inc_obs += httpContext.getMessage( "Receta Acabado?= ", "") + AV25RECACAB + GXutil.newLine( ) ;
               AV27Inc_obs += httpContext.getMessage( "Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> " + "5" + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV42Pgmname, AV30UsurCod, AV28Station, AV27Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               A213BarSit = (byte)(5) ;
            }
            /* Using cursor P04LX12 */
            pr_default.execute(10, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
      if ( AV21Flag2 <= 1 )
      {
         /* Using cursor P04LX13 */
         pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A130BarCodPar = P04LX13_A130BarCodPar[0] ;
            A132BarCodReo = P04LX13_A132BarCodReo[0] ;
            A129BarCod = P04LX13_A129BarCod[0] ;
            A2792TermiCod = P04LX13_A2792TermiCod[0] ;
            A396EmprCod = P04LX13_A396EmprCod[0] ;
            A2793BarULinMaq = P04LX13_A2793BarULinMaq[0] ;
            n2793BarULinMaq = P04LX13_n2793BarULinMaq[0] ;
            /* Using cursor P04LX14 */
            pr_default.execute(12, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A2794BarLinMaq = P04LX14_A2794BarLinMaq[0] ;
               A2795BarMaqPrf = P04LX14_A2795BarMaqPrf[0] ;
               n2795BarMaqPrf = P04LX14_n2795BarMaqPrf[0] ;
               /* Optimized DELETE. */
               /* Using cursor P04LX15 */
               pr_default.execute(13, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
               /* End optimized DELETE. */
               /* Using cursor P04LX16 */
               pr_default.execute(14, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
               pr_default.readNext(12);
            }
            pr_default.close(12);
            /* Using cursor P04LX17 */
            pr_default.execute(15, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
            pr_default.readNext(11);
         }
         pr_default.close(11);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcldy07.this.AV15EmprCod;
      this.aP1[0] = pcldy07.this.AV16BarCod;
      this.aP2[0] = pcldy07.this.AV17BarCodReo;
      this.aP3[0] = pcldy07.this.AV18BarCodPar;
      this.aP4[0] = pcldy07.this.AV20RecLinMaq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Station = "" ;
      GXv_char1 = new String[1] ;
      AV29EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV30UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04LX2_A130BarCodPar = new String[] {""} ;
      P04LX2_A132BarCodReo = new byte[1] ;
      P04LX2_A129BarCod = new int[1] ;
      P04LX2_A396EmprCod = new String[] {""} ;
      P04LX2_A6039RecAcab = new String[] {""} ;
      P04LX2_n6039RecAcab = new boolean[] {false} ;
      P04LX2_A2804RecLinMaq = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A6039RecAcab = "" ;
      AV25RECACAB = "" ;
      P04LX3_A2804RecLinMaq = new short[1] ;
      P04LX3_A130BarCodPar = new String[] {""} ;
      P04LX3_A132BarCodReo = new byte[1] ;
      P04LX3_A129BarCod = new int[1] ;
      P04LX3_A396EmprCod = new String[] {""} ;
      P04LX3_A6039RecAcab = new String[] {""} ;
      P04LX3_n6039RecAcab = new boolean[] {false} ;
      P04LX6_A396EmprCod = new String[] {""} ;
      P04LX6_A129BarCod = new int[1] ;
      P04LX6_A132BarCodReo = new byte[1] ;
      P04LX6_A130BarCodPar = new String[] {""} ;
      P04LX6_A2804RecLinMaq = new short[1] ;
      P04LX6_A1273RecLinPro = new byte[1] ;
      P04LX6_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P04LX11_A130BarCodPar = new String[] {""} ;
      P04LX11_A132BarCodReo = new byte[1] ;
      P04LX11_A129BarCod = new int[1] ;
      P04LX11_A396EmprCod = new String[] {""} ;
      P04LX11_A212BarSer = new String[] {""} ;
      P04LX11_A213BarSit = new byte[1] ;
      A212BarSer = "" ;
      AV27Inc_obs = "" ;
      AV42Pgmname = "" ;
      P04LX13_A130BarCodPar = new String[] {""} ;
      P04LX13_A132BarCodReo = new byte[1] ;
      P04LX13_A129BarCod = new int[1] ;
      P04LX13_A2792TermiCod = new String[] {""} ;
      P04LX13_A396EmprCod = new String[] {""} ;
      P04LX13_A2793BarULinMaq = new short[1] ;
      P04LX13_n2793BarULinMaq = new boolean[] {false} ;
      A2792TermiCod = "" ;
      P04LX14_A396EmprCod = new String[] {""} ;
      P04LX14_A2792TermiCod = new String[] {""} ;
      P04LX14_A129BarCod = new int[1] ;
      P04LX14_A132BarCodReo = new byte[1] ;
      P04LX14_A130BarCodPar = new String[] {""} ;
      P04LX14_A2794BarLinMaq = new short[1] ;
      P04LX14_A2795BarMaqPrf = new String[] {""} ;
      P04LX14_n2795BarMaqPrf = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcldy07__default(),
         new Object[] {
             new Object[] {
            P04LX2_A130BarCodPar, P04LX2_A132BarCodReo, P04LX2_A129BarCod, P04LX2_A396EmprCod, P04LX2_A6039RecAcab, P04LX2_n6039RecAcab, P04LX2_A2804RecLinMaq
            }
            , new Object[] {
            P04LX3_A2804RecLinMaq, P04LX3_A130BarCodPar, P04LX3_A132BarCodReo, P04LX3_A129BarCod, P04LX3_A396EmprCod, P04LX3_A6039RecAcab, P04LX3_n6039RecAcab
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04LX6_A396EmprCod, P04LX6_A129BarCod, P04LX6_A132BarCodReo, P04LX6_A130BarCodPar, P04LX6_A2804RecLinMaq, P04LX6_A1273RecLinPro, P04LX6_A764ProForCod
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
            P04LX11_A130BarCodPar, P04LX11_A132BarCodReo, P04LX11_A129BarCod, P04LX11_A396EmprCod, P04LX11_A212BarSer, P04LX11_A213BarSit
            }
            , new Object[] {
            }
            , new Object[] {
            P04LX13_A130BarCodPar, P04LX13_A132BarCodReo, P04LX13_A129BarCod, P04LX13_A2792TermiCod, P04LX13_A396EmprCod, P04LX13_A2793BarULinMaq, P04LX13_n2793BarULinMaq
            }
            , new Object[] {
            P04LX14_A396EmprCod, P04LX14_A2792TermiCod, P04LX14_A129BarCod, P04LX14_A132BarCodReo, P04LX14_A130BarCodPar, P04LX14_A2794BarLinMaq, P04LX14_A2795BarMaqPrf, P04LX14_n2795BarMaqPrf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV42Pgmname = "PCLDY07" ;
      /* GeneXus formulas. */
      AV42Pgmname = "PCLDY07" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV21Flag2 ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A213BarSit ;
   private short AV20RecLinMaq ;
   private short AV31RcT ;
   private short A2804RecLinMaq ;
   private short A2793BarULinMaq ;
   private short A2794BarLinMaq ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV28Station ;
   private String GXv_char1[] ;
   private String AV29EmprNom ;
   private String GXv_char2[] ;
   private String AV30UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A6039RecAcab ;
   private String AV25RECACAB ;
   private String A764ProForCod ;
   private String A212BarSer ;
   private String AV42Pgmname ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private boolean n6039RecAcab ;
   private boolean n2793BarULinMaq ;
   private boolean n2795BarMaqPrf ;
   private String AV27Inc_obs ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04LX2_A130BarCodPar ;
   private byte[] P04LX2_A132BarCodReo ;
   private int[] P04LX2_A129BarCod ;
   private String[] P04LX2_A396EmprCod ;
   private String[] P04LX2_A6039RecAcab ;
   private boolean[] P04LX2_n6039RecAcab ;
   private short[] P04LX2_A2804RecLinMaq ;
   private short[] P04LX3_A2804RecLinMaq ;
   private String[] P04LX3_A130BarCodPar ;
   private byte[] P04LX3_A132BarCodReo ;
   private int[] P04LX3_A129BarCod ;
   private String[] P04LX3_A396EmprCod ;
   private String[] P04LX3_A6039RecAcab ;
   private boolean[] P04LX3_n6039RecAcab ;
   private String[] P04LX6_A396EmprCod ;
   private int[] P04LX6_A129BarCod ;
   private byte[] P04LX6_A132BarCodReo ;
   private String[] P04LX6_A130BarCodPar ;
   private short[] P04LX6_A2804RecLinMaq ;
   private byte[] P04LX6_A1273RecLinPro ;
   private String[] P04LX6_A764ProForCod ;
   private String[] P04LX11_A130BarCodPar ;
   private byte[] P04LX11_A132BarCodReo ;
   private int[] P04LX11_A129BarCod ;
   private String[] P04LX11_A396EmprCod ;
   private String[] P04LX11_A212BarSer ;
   private byte[] P04LX11_A213BarSit ;
   private String[] P04LX13_A130BarCodPar ;
   private byte[] P04LX13_A132BarCodReo ;
   private int[] P04LX13_A129BarCod ;
   private String[] P04LX13_A2792TermiCod ;
   private String[] P04LX13_A396EmprCod ;
   private short[] P04LX13_A2793BarULinMaq ;
   private boolean[] P04LX13_n2793BarULinMaq ;
   private String[] P04LX14_A396EmprCod ;
   private String[] P04LX14_A2792TermiCod ;
   private int[] P04LX14_A129BarCod ;
   private byte[] P04LX14_A132BarCodReo ;
   private String[] P04LX14_A130BarCodPar ;
   private short[] P04LX14_A2794BarLinMaq ;
   private String[] P04LX14_A2795BarMaqPrf ;
   private boolean[] P04LX14_n2795BarMaqPrf ;
}

final  class pcldy07__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04LX2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, RecAcab, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04LX3", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecAcab FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04LX4", "DELETE FROM TXPRECFAG  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECFAG")
         ,new UpdateCursor("P04LX5", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
         ,new ForEachCursor("P04LX6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04LX7", "DELETE FROM TXPLRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P04LX8", "DELETE FROM TXPOBSREC  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSREC")
         ,new UpdateCursor("P04LX9", "DELETE FROM TXPCRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P04LX10", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P04LX11", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSer, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04LX12", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P04LX13", "SELECT BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarULinMaq FROM TXPBARTER WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04LX14", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04LX15", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P04LX16", "DELETE FROM TXPBARMAQ  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P04LX17", "DELETE FROM TXPBARTER  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
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
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

