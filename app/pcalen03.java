package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalen03 extends GXProcedure
{
   public pcalen03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalen03.class ), "" );
   }

   public pcalen03( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            byte[] aP2 )
   {
      pcalen03.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             short[] aP3 )
   {
      pcalen03.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalen03.this.AV16MAQUINA = aP1[0];
      this.aP1 = aP1;
      pcalen03.this.AV17MM = aP2[0];
      this.aP2 = aP2;
      pcalen03.this.AV18AA = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV22IntHnp ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "INTHNP", ""), GXv_int1) ;
      pcalen03.this.AV22IntHnp = GXv_int1[0] ;
      AV20SubMaq = GXutil.substring( AV16MAQUINA, 1, 2) ;
      /* Using cursor P003B2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16MAQUINA, Short.valueOf(AV18AA), Byte.valueOf(AV17MM)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A614MaqMes = P003B2_A614MaqMes[0] ;
         A599MaqAny = P003B2_A599MaqAny[0] ;
         A602MaqCod = P003B2_A602MaqCod[0] ;
         A396EmprCod = P003B2_A396EmprCod[0] ;
         A610MaqHNPMes = P003B2_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P003B2_n610MaqHNPMes[0] ;
         AV19HNPMES = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P003B3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV20SubMaq});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P003B3_A602MaqCod[0] ;
         A396EmprCod = P003B3_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         Gx_msg = httpContext.getMessage( "Procesando Maquina= ", "") + A602MaqCod ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPMAQHNP

         */
         W396EmprCod = A396EmprCod ;
         W602MaqCod = A602MaqCod ;
         A599MaqAny = AV18AA ;
         A614MaqMes = AV17MM ;
         A610MaqHNPMes = AV19HNPMES ;
         n610MaqHNPMes = false ;
         /* Using cursor P003B4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n610MaqHNPMes = false ;
            /* Optimized UPDATE. */
            /* Using cursor P003B5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n610MaqHNPMes), AV19HNPMES, A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A602MaqCod = W602MaqCod ;
         /* End Insert */
         if ( AV22IntHnp == 1 )
         {
            AV29MaqCod = A602MaqCod ;
            /* Execute user subroutine: 'INTERVALOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'INTERVALOS' Routine */
      returnInSub = false ;
      /* Using cursor P003B6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, AV16MAQUINA, Short.valueOf(AV18AA), Byte.valueOf(AV17MM)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A614MaqMes = P003B6_A614MaqMes[0] ;
         A599MaqAny = P003B6_A599MaqAny[0] ;
         A602MaqCod = P003B6_A602MaqCod[0] ;
         A396EmprCod = P003B6_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W602MaqCod = A602MaqCod ;
         W599MaqAny = A599MaqAny ;
         W614MaqMes = A614MaqMes ;
         /* Using cursor P003B7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A5129MaqHnpI3f = P003B7_A5129MaqHnpI3f[0] ;
            n5129MaqHnpI3f = P003B7_n5129MaqHnpI3f[0] ;
            A5128MaqHnpI3i = P003B7_A5128MaqHnpI3i[0] ;
            n5128MaqHnpI3i = P003B7_n5128MaqHnpI3i[0] ;
            A5127MaqHnpI2f = P003B7_A5127MaqHnpI2f[0] ;
            n5127MaqHnpI2f = P003B7_n5127MaqHnpI2f[0] ;
            A5126MaqHnpI2i = P003B7_A5126MaqHnpI2i[0] ;
            n5126MaqHnpI2i = P003B7_n5126MaqHnpI2i[0] ;
            A5125MaqHnpI1f = P003B7_A5125MaqHnpI1f[0] ;
            n5125MaqHnpI1f = P003B7_n5125MaqHnpI1f[0] ;
            A5124MaqHnpI1i = P003B7_A5124MaqHnpI1i[0] ;
            n5124MaqHnpI1i = P003B7_n5124MaqHnpI1i[0] ;
            A5123MaqHnpDia = P003B7_A5123MaqHnpDia[0] ;
            W396EmprCod = A396EmprCod ;
            W602MaqCod = A602MaqCod ;
            W599MaqAny = A599MaqAny ;
            W614MaqMes = A614MaqMes ;
            AV21MaqHnpDia = A5123MaqHnpDia ;
            AV24MaqHnpI1f = A5125MaqHnpI1f ;
            AV23MaqHnpI1i = A5124MaqHnpI1i ;
            AV26MaqHnpI2f = A5127MaqHnpI2f ;
            AV25MaqHnpI2i = A5126MaqHnpI2i ;
            AV28MaqHnpI3f = A5129MaqHnpI3f ;
            AV27MaqHnpI3i = A5128MaqHnpI3i ;
            /*
               INSERT RECORD ON TABLE TXPINTHNP

            */
            W396EmprCod = A396EmprCod ;
            W602MaqCod = A602MaqCod ;
            W599MaqAny = A599MaqAny ;
            W614MaqMes = A614MaqMes ;
            W5123MaqHnpDia = A5123MaqHnpDia ;
            W5125MaqHnpI1f = A5125MaqHnpI1f ;
            n5125MaqHnpI1f = false ;
            W5124MaqHnpI1i = A5124MaqHnpI1i ;
            n5124MaqHnpI1i = false ;
            W5127MaqHnpI2f = A5127MaqHnpI2f ;
            n5127MaqHnpI2f = false ;
            W5126MaqHnpI2i = A5126MaqHnpI2i ;
            n5126MaqHnpI2i = false ;
            W5129MaqHnpI3f = A5129MaqHnpI3f ;
            n5129MaqHnpI3f = false ;
            W5128MaqHnpI3i = A5128MaqHnpI3i ;
            n5128MaqHnpI3i = false ;
            A602MaqCod = AV29MaqCod ;
            A599MaqAny = AV18AA ;
            A614MaqMes = AV17MM ;
            A5123MaqHnpDia = AV21MaqHnpDia ;
            A5125MaqHnpI1f = AV24MaqHnpI1f ;
            n5125MaqHnpI1f = false ;
            A5124MaqHnpI1i = AV23MaqHnpI1i ;
            n5124MaqHnpI1i = false ;
            A5127MaqHnpI2f = AV26MaqHnpI2f ;
            n5127MaqHnpI2f = false ;
            A5126MaqHnpI2i = AV25MaqHnpI2i ;
            n5126MaqHnpI2i = false ;
            A5129MaqHnpI3f = AV28MaqHnpI3f ;
            n5129MaqHnpI3f = false ;
            A5128MaqHnpI3i = AV27MaqHnpI3i ;
            n5128MaqHnpI3i = false ;
            /* Using cursor P003B8 */
            pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia), Boolean.valueOf(n5124MaqHnpI1i), A5124MaqHnpI1i, Boolean.valueOf(n5125MaqHnpI1f), A5125MaqHnpI1f, Boolean.valueOf(n5126MaqHnpI2i), A5126MaqHnpI2i, Boolean.valueOf(n5127MaqHnpI2f), A5127MaqHnpI2f, Boolean.valueOf(n5128MaqHnpI3i), A5128MaqHnpI3i, Boolean.valueOf(n5129MaqHnpI3f), A5129MaqHnpI3f});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
            if ( (pr_default.getStatus(6) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               n5128MaqHnpI3i = false ;
               n5129MaqHnpI3f = false ;
               n5126MaqHnpI2i = false ;
               n5127MaqHnpI2f = false ;
               n5124MaqHnpI1i = false ;
               n5125MaqHnpI1f = false ;
               /* Optimized UPDATE. */
               /* Using cursor P003B9 */
               pr_default.execute(7, new Object[] {Boolean.valueOf(n5128MaqHnpI3i), AV27MaqHnpI3i, Boolean.valueOf(n5129MaqHnpI3f), AV28MaqHnpI3f, Boolean.valueOf(n5126MaqHnpI2i), AV25MaqHnpI2i, Boolean.valueOf(n5127MaqHnpI2f), AV26MaqHnpI2f, Boolean.valueOf(n5124MaqHnpI1i), AV23MaqHnpI1i, Boolean.valueOf(n5125MaqHnpI1f), AV24MaqHnpI1f, A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
               /* End optimized UPDATE. */
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A602MaqCod = W602MaqCod ;
            A599MaqAny = W599MaqAny ;
            A614MaqMes = W614MaqMes ;
            A5123MaqHnpDia = W5123MaqHnpDia ;
            A5125MaqHnpI1f = W5125MaqHnpI1f ;
            n5125MaqHnpI1f = false ;
            A5124MaqHnpI1i = W5124MaqHnpI1i ;
            n5124MaqHnpI1i = false ;
            A5127MaqHnpI2f = W5127MaqHnpI2f ;
            n5127MaqHnpI2f = false ;
            A5126MaqHnpI2i = W5126MaqHnpI2i ;
            n5126MaqHnpI2i = false ;
            A5129MaqHnpI3f = W5129MaqHnpI3f ;
            n5129MaqHnpI3f = false ;
            A5128MaqHnpI3i = W5128MaqHnpI3i ;
            n5128MaqHnpI3i = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A602MaqCod = W602MaqCod ;
            A599MaqAny = W599MaqAny ;
            A614MaqMes = W614MaqMes ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         A396EmprCod = W396EmprCod ;
         A602MaqCod = W602MaqCod ;
         A599MaqAny = W599MaqAny ;
         A614MaqMes = W614MaqMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalen03.this.AV15EmprCod;
      this.aP1[0] = pcalen03.this.AV16MAQUINA;
      this.aP2[0] = pcalen03.this.AV17MM;
      this.aP3[0] = pcalen03.this.AV18AA;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcalen03");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV20SubMaq = "" ;
      scmdbuf = "" ;
      P003B2_A614MaqMes = new byte[1] ;
      P003B2_A599MaqAny = new short[1] ;
      P003B2_A602MaqCod = new String[] {""} ;
      P003B2_A396EmprCod = new String[] {""} ;
      P003B2_A610MaqHNPMes = new String[] {""} ;
      P003B2_n610MaqHNPMes = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A610MaqHNPMes = "" ;
      AV19HNPMES = "" ;
      P003B3_A602MaqCod = new String[] {""} ;
      P003B3_A396EmprCod = new String[] {""} ;
      W396EmprCod = "" ;
      Gx_msg = "" ;
      W602MaqCod = "" ;
      Gx_emsg = "" ;
      AV29MaqCod = "" ;
      P003B6_A614MaqMes = new byte[1] ;
      P003B6_A599MaqAny = new short[1] ;
      P003B6_A602MaqCod = new String[] {""} ;
      P003B6_A396EmprCod = new String[] {""} ;
      P003B7_A396EmprCod = new String[] {""} ;
      P003B7_A602MaqCod = new String[] {""} ;
      P003B7_A599MaqAny = new short[1] ;
      P003B7_A614MaqMes = new byte[1] ;
      P003B7_A5129MaqHnpI3f = new java.util.Date[] {GXutil.nullDate()} ;
      P003B7_n5129MaqHnpI3f = new boolean[] {false} ;
      P003B7_A5128MaqHnpI3i = new java.util.Date[] {GXutil.nullDate()} ;
      P003B7_n5128MaqHnpI3i = new boolean[] {false} ;
      P003B7_A5127MaqHnpI2f = new java.util.Date[] {GXutil.nullDate()} ;
      P003B7_n5127MaqHnpI2f = new boolean[] {false} ;
      P003B7_A5126MaqHnpI2i = new java.util.Date[] {GXutil.nullDate()} ;
      P003B7_n5126MaqHnpI2i = new boolean[] {false} ;
      P003B7_A5125MaqHnpI1f = new java.util.Date[] {GXutil.nullDate()} ;
      P003B7_n5125MaqHnpI1f = new boolean[] {false} ;
      P003B7_A5124MaqHnpI1i = new java.util.Date[] {GXutil.nullDate()} ;
      P003B7_n5124MaqHnpI1i = new boolean[] {false} ;
      P003B7_A5123MaqHnpDia = new byte[1] ;
      A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      AV24MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      AV23MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      AV26MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      AV25MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      AV28MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      AV27MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      W5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      W5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      W5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      W5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      W5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      W5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalen03__default(),
         new Object[] {
             new Object[] {
            P003B2_A614MaqMes, P003B2_A599MaqAny, P003B2_A602MaqCod, P003B2_A396EmprCod, P003B2_A610MaqHNPMes, P003B2_n610MaqHNPMes
            }
            , new Object[] {
            P003B3_A602MaqCod, P003B3_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003B6_A614MaqMes, P003B6_A599MaqAny, P003B6_A602MaqCod, P003B6_A396EmprCod
            }
            , new Object[] {
            P003B7_A396EmprCod, P003B7_A602MaqCod, P003B7_A599MaqAny, P003B7_A614MaqMes, P003B7_A5129MaqHnpI3f, P003B7_n5129MaqHnpI3f, P003B7_A5128MaqHnpI3i, P003B7_n5128MaqHnpI3i, P003B7_A5127MaqHnpI2f, P003B7_n5127MaqHnpI2f,
            P003B7_A5126MaqHnpI2i, P003B7_n5126MaqHnpI2i, P003B7_A5125MaqHnpI1f, P003B7_n5125MaqHnpI1f, P003B7_A5124MaqHnpI1i, P003B7_n5124MaqHnpI1i, P003B7_A5123MaqHnpDia
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

   private byte AV17MM ;
   private byte AV22IntHnp ;
   private byte GXv_int1[] ;
   private byte A614MaqMes ;
   private byte W614MaqMes ;
   private byte A5123MaqHnpDia ;
   private byte AV21MaqHnpDia ;
   private byte W5123MaqHnpDia ;
   private short AV18AA ;
   private short A599MaqAny ;
   private short Gx_err ;
   private short W599MaqAny ;
   private int GX_INS67 ;
   private int GX_INS748 ;
   private String AV15EmprCod ;
   private String AV16MAQUINA ;
   private String AV20SubMaq ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String Gx_msg ;
   private String W602MaqCod ;
   private String Gx_emsg ;
   private String AV29MaqCod ;
   private java.util.Date A5129MaqHnpI3f ;
   private java.util.Date A5128MaqHnpI3i ;
   private java.util.Date A5127MaqHnpI2f ;
   private java.util.Date A5126MaqHnpI2i ;
   private java.util.Date A5125MaqHnpI1f ;
   private java.util.Date A5124MaqHnpI1i ;
   private java.util.Date AV24MaqHnpI1f ;
   private java.util.Date AV23MaqHnpI1i ;
   private java.util.Date AV26MaqHnpI2f ;
   private java.util.Date AV25MaqHnpI2i ;
   private java.util.Date AV28MaqHnpI3f ;
   private java.util.Date AV27MaqHnpI3i ;
   private java.util.Date W5125MaqHnpI1f ;
   private java.util.Date W5124MaqHnpI1i ;
   private java.util.Date W5127MaqHnpI2f ;
   private java.util.Date W5126MaqHnpI2i ;
   private java.util.Date W5129MaqHnpI3f ;
   private java.util.Date W5128MaqHnpI3i ;
   private boolean n610MaqHNPMes ;
   private boolean returnInSub ;
   private boolean n5129MaqHnpI3f ;
   private boolean n5128MaqHnpI3i ;
   private boolean n5127MaqHnpI2f ;
   private boolean n5126MaqHnpI2i ;
   private boolean n5125MaqHnpI1f ;
   private boolean n5124MaqHnpI1i ;
   private String A610MaqHNPMes ;
   private String AV19HNPMES ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P003B2_A614MaqMes ;
   private short[] P003B2_A599MaqAny ;
   private String[] P003B2_A602MaqCod ;
   private String[] P003B2_A396EmprCod ;
   private String[] P003B2_A610MaqHNPMes ;
   private boolean[] P003B2_n610MaqHNPMes ;
   private String[] P003B3_A602MaqCod ;
   private String[] P003B3_A396EmprCod ;
   private byte[] P003B6_A614MaqMes ;
   private short[] P003B6_A599MaqAny ;
   private String[] P003B6_A602MaqCod ;
   private String[] P003B6_A396EmprCod ;
   private String[] P003B7_A396EmprCod ;
   private String[] P003B7_A602MaqCod ;
   private short[] P003B7_A599MaqAny ;
   private byte[] P003B7_A614MaqMes ;
   private java.util.Date[] P003B7_A5129MaqHnpI3f ;
   private boolean[] P003B7_n5129MaqHnpI3f ;
   private java.util.Date[] P003B7_A5128MaqHnpI3i ;
   private boolean[] P003B7_n5128MaqHnpI3i ;
   private java.util.Date[] P003B7_A5127MaqHnpI2f ;
   private boolean[] P003B7_n5127MaqHnpI2f ;
   private java.util.Date[] P003B7_A5126MaqHnpI2i ;
   private boolean[] P003B7_n5126MaqHnpI2i ;
   private java.util.Date[] P003B7_A5125MaqHnpI1f ;
   private boolean[] P003B7_n5125MaqHnpI1f ;
   private java.util.Date[] P003B7_A5124MaqHnpI1i ;
   private boolean[] P003B7_n5124MaqHnpI1i ;
   private byte[] P003B7_A5123MaqHnpDia ;
}

final  class pcalen03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003B2", "SELECT MaqMes, MaqAny, MaqCod, EmprCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P003B3", "SELECT MaqCod, EmprCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (SUBSTR(MaqCod, 1, 2) = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003B4", "INSERT INTO TXPMAQHNP(EmprCod, MaqCod, MaqAny, MaqMes, MaqHNPMes) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQHNP")
         ,new UpdateCursor("P003B5", "UPDATE TXPMAQHNP SET MaqHNPMes=?  WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQHNP")
         ,new ForEachCursor("P003B6", "SELECT MaqMes, MaqAny, MaqCod, EmprCod FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P003B7", "SELECT EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpI3f, MaqHnpI3i, MaqHnpI2f, MaqHnpI2i, MaqHnpI1f, MaqHnpI1i, MaqHnpDia FROM TXPINTHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003B8", "INSERT INTO TXPINTHNP(EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINTHNP")
         ,new UpdateCursor("P003B9", "UPDATE TXPINTHNP SET MaqHnpI3i=?, MaqHnpI3f=?, MaqHnpI2i=?, MaqHnpI2f=?, MaqHnpI1i=?, MaqHnpI1f=?  WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? and MaqHnpDia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINTHNP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 63);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 63);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], true);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[8], true);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], true);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[12], true);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[14], true);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[16], true);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], true);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], true);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], true);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], true);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], true);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 6);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               return;
      }
   }

}

