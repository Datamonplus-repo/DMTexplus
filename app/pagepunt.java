package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pagepunt extends GXProcedure
{
   public pagepunt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pagepunt.class ), "" );
   }

   public pagepunt( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 )
   {
      pagepunt.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pagepunt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pagepunt.this.AV9Fascod = aP1[0];
      this.aP1 = aP1;
      pagepunt.this.AV10MaqCodF = aP2[0];
      this.aP2 = aP2;
      pagepunt.this.AV8Cod_parf = aP3[0];
      this.aP3 = aP3;
      pagepunt.this.AV13Itm_ord1 = aP4[0];
      this.aP4 = aP4;
      pagepunt.this.Gx_mode = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         Gx_msg = " " ;
         /* Using cursor P012M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV9Fascod, AV10MaqCodF});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9836FasCodM = P012M2_A9836FasCodM[0] ;
            A9830MaqCodC = P012M2_A9830MaqCodC[0] ;
            A758ProCod = P012M2_A758ProCod[0] ;
            A65ArtCod = P012M2_A65ArtCod[0] ;
            A252CliCod = P012M2_A252CliCod[0] ;
            W396EmprCod = A396EmprCod ;
            W9836FasCodM = A9836FasCodM ;
            W9830MaqCodC = A9830MaqCodC ;
            /*
               INSERT RECORD ON TABLE TXPCAPFM2

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W9836FasCodM = A9836FasCodM ;
            W9830MaqCodC = A9830MaqCodC ;
            A9836FasCodM = AV9Fascod ;
            A9830MaqCodC = AV10MaqCodF ;
            A1664ParFasCod = AV8Cod_parf ;
            A10256Itm_ord2 = AV13Itm_ord1 ;
            /* Using cursor P012M3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod), Short.valueOf(A10256Itm_ord2)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
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
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A758ProCod = W758ProCod ;
            A9836FasCodM = W9836FasCodM ;
            A9830MaqCodC = W9830MaqCodC ;
            /* End Insert */
            Gx_msg = httpContext.getMessage( "Creado Registro en Fichas Tecnicas ", "") + AV9Fascod + " " + AV10MaqCodF + " " + GXutil.str( AV8Cod_parf, 4, 0) ;
            A396EmprCod = W396EmprCod ;
            A9836FasCodM = W9836FasCodM ;
            A9830MaqCodC = W9830MaqCodC ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P012M4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV9Fascod, AV10MaqCodF});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9836FasCodM = P012M4_A9836FasCodM[0] ;
            A9830MaqCodC = P012M4_A9830MaqCodC[0] ;
            A10264Itm_ord4 = P012M4_A10264Itm_ord4[0] ;
            n10264Itm_ord4 = P012M4_n10264Itm_ord4[0] ;
            A9865Cod_parX = P012M4_A9865Cod_parX[0] ;
            A9868ParObsX = P012M4_A9868ParObsX[0] ;
            n9868ParObsX = P012M4_n9868ParObsX[0] ;
            A9867ParValX = P012M4_A9867ParValX[0] ;
            n9867ParValX = P012M4_n9867ParValX[0] ;
            A9864MaqAncA = P012M4_A9864MaqAncA[0] ;
            A758ProCod = P012M4_A758ProCod[0] ;
            A65ArtCod = P012M4_A65ArtCod[0] ;
            A252CliCod = P012M4_A252CliCod[0] ;
            W396EmprCod = A396EmprCod ;
            W9836FasCodM = A9836FasCodM ;
            W9830MaqCodC = A9830MaqCodC ;
            /*
               INSERT RECORD ON TABLE TXPPFSMAC

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W9836FasCodM = A9836FasCodM ;
            W9830MaqCodC = A9830MaqCodC ;
            W9864MaqAncA = A9864MaqAncA ;
            W9865Cod_parX = A9865Cod_parX ;
            W10264Itm_ord4 = A10264Itm_ord4 ;
            n10264Itm_ord4 = false ;
            A9836FasCodM = AV9Fascod ;
            A9830MaqCodC = AV10MaqCodF ;
            A9865Cod_parX = AV8Cod_parf ;
            A10264Itm_ord4 = AV13Itm_ord1 ;
            n10264Itm_ord4 = false ;
            /* Using cursor P012M5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX), Boolean.valueOf(n9867ParValX), A9867ParValX, Boolean.valueOf(n9868ParObsX), A9868ParObsX, Boolean.valueOf(n10264Itm_ord4), Short.valueOf(A10264Itm_ord4)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
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
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A758ProCod = W758ProCod ;
            A9836FasCodM = W9836FasCodM ;
            A9830MaqCodC = W9830MaqCodC ;
            A9864MaqAncA = W9864MaqAncA ;
            A9865Cod_parX = W9865Cod_parX ;
            A10264Itm_ord4 = W10264Itm_ord4 ;
            n10264Itm_ord4 = false ;
            /* End Insert */
            Gx_msg = httpContext.getMessage( "Creado Registro en Fichas Tecnicas (ANCHOS) ", "") + AV9Fascod + " " + AV10MaqCodF + " " + GXutil.str( AV8Cod_parf, 4, 0) ;
            A396EmprCod = W396EmprCod ;
            A9836FasCodM = W9836FasCodM ;
            A9830MaqCodC = W9830MaqCodC ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( GXutil.strcmp(Gx_msg, " ") != 0 )
         {
            httpContext.GX_msglist.addItem(Gx_msg);
         }
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
      {
         Gx_msg = " " ;
         /* Using cursor P012M6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV9Fascod, AV10MaqCodF, Short.valueOf(AV8Cod_parf)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A9836FasCodM = P012M6_A9836FasCodM[0] ;
            A9830MaqCodC = P012M6_A9830MaqCodC[0] ;
            A1664ParFasCod = P012M6_A1664ParFasCod[0] ;
            A252CliCod = P012M6_A252CliCod[0] ;
            A65ArtCod = P012M6_A65ArtCod[0] ;
            A758ProCod = P012M6_A758ProCod[0] ;
            Gx_msg = httpContext.getMessage( "Eliminado Registro en Fichas Tecnicas ", "") + AV9Fascod + " " + AV10MaqCodF + " " + GXutil.str( AV8Cod_parf, 4, 0) ;
            /* Using cursor P012M7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P012M8 */
         pr_default.execute(6, new Object[] {A396EmprCod, AV9Fascod, AV10MaqCodF, Short.valueOf(AV8Cod_parf)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A9836FasCodM = P012M8_A9836FasCodM[0] ;
            A9830MaqCodC = P012M8_A9830MaqCodC[0] ;
            A9865Cod_parX = P012M8_A9865Cod_parX[0] ;
            A252CliCod = P012M8_A252CliCod[0] ;
            A65ArtCod = P012M8_A65ArtCod[0] ;
            A758ProCod = P012M8_A758ProCod[0] ;
            A9864MaqAncA = P012M8_A9864MaqAncA[0] ;
            Gx_msg = httpContext.getMessage( "Eliminado Registro en Fichas Tecnicas (ANCHOS) ", "") + AV9Fascod + " " + AV10MaqCodF + " " + GXutil.str( AV8Cod_parf, 4, 0) ;
            /* Using cursor P012M9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( GXutil.strcmp(Gx_msg, " ") != 0 )
         {
            httpContext.GX_msglist.addItem(Gx_msg);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pagepunt.this.A396EmprCod;
      this.aP1[0] = pagepunt.this.AV9Fascod;
      this.aP2[0] = pagepunt.this.AV10MaqCodF;
      this.aP3[0] = pagepunt.this.AV8Cod_parf;
      this.aP4[0] = pagepunt.this.AV13Itm_ord1;
      this.aP5[0] = pagepunt.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pagepunt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P012M2_A396EmprCod = new String[] {""} ;
      P012M2_A9836FasCodM = new String[] {""} ;
      P012M2_A9830MaqCodC = new String[] {""} ;
      P012M2_A758ProCod = new String[] {""} ;
      P012M2_A65ArtCod = new String[] {""} ;
      P012M2_A252CliCod = new int[1] ;
      A9836FasCodM = "" ;
      A9830MaqCodC = "" ;
      A758ProCod = "" ;
      A65ArtCod = "" ;
      W396EmprCod = "" ;
      W9836FasCodM = "" ;
      W9830MaqCodC = "" ;
      W65ArtCod = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      P012M4_A396EmprCod = new String[] {""} ;
      P012M4_A9836FasCodM = new String[] {""} ;
      P012M4_A9830MaqCodC = new String[] {""} ;
      P012M4_A10264Itm_ord4 = new short[1] ;
      P012M4_n10264Itm_ord4 = new boolean[] {false} ;
      P012M4_A9865Cod_parX = new short[1] ;
      P012M4_A9868ParObsX = new String[] {""} ;
      P012M4_n9868ParObsX = new boolean[] {false} ;
      P012M4_A9867ParValX = new String[] {""} ;
      P012M4_n9867ParValX = new boolean[] {false} ;
      P012M4_A9864MaqAncA = new short[1] ;
      P012M4_A758ProCod = new String[] {""} ;
      P012M4_A65ArtCod = new String[] {""} ;
      P012M4_A252CliCod = new int[1] ;
      A9868ParObsX = "" ;
      A9867ParValX = "" ;
      P012M6_A396EmprCod = new String[] {""} ;
      P012M6_A9836FasCodM = new String[] {""} ;
      P012M6_A9830MaqCodC = new String[] {""} ;
      P012M6_A1664ParFasCod = new short[1] ;
      P012M6_A252CliCod = new int[1] ;
      P012M6_A65ArtCod = new String[] {""} ;
      P012M6_A758ProCod = new String[] {""} ;
      P012M8_A396EmprCod = new String[] {""} ;
      P012M8_A9836FasCodM = new String[] {""} ;
      P012M8_A9830MaqCodC = new String[] {""} ;
      P012M8_A9865Cod_parX = new short[1] ;
      P012M8_A252CliCod = new int[1] ;
      P012M8_A65ArtCod = new String[] {""} ;
      P012M8_A758ProCod = new String[] {""} ;
      P012M8_A9864MaqAncA = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pagepunt__default(),
         new Object[] {
             new Object[] {
            P012M2_A396EmprCod, P012M2_A9836FasCodM, P012M2_A9830MaqCodC, P012M2_A758ProCod, P012M2_A65ArtCod, P012M2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P012M4_A396EmprCod, P012M4_A9836FasCodM, P012M4_A9830MaqCodC, P012M4_A10264Itm_ord4, P012M4_n10264Itm_ord4, P012M4_A9865Cod_parX, P012M4_A9868ParObsX, P012M4_n9868ParObsX, P012M4_A9867ParValX, P012M4_n9867ParValX,
            P012M4_A9864MaqAncA, P012M4_A758ProCod, P012M4_A65ArtCod, P012M4_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P012M6_A396EmprCod, P012M6_A9836FasCodM, P012M6_A9830MaqCodC, P012M6_A1664ParFasCod, P012M6_A252CliCod, P012M6_A65ArtCod, P012M6_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P012M8_A396EmprCod, P012M8_A9836FasCodM, P012M8_A9830MaqCodC, P012M8_A9865Cod_parX, P012M8_A252CliCod, P012M8_A65ArtCod, P012M8_A758ProCod, P012M8_A9864MaqAncA
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Cod_parf ;
   private short AV13Itm_ord1 ;
   private short A1664ParFasCod ;
   private short A10256Itm_ord2 ;
   private short Gx_err ;
   private short A10264Itm_ord4 ;
   private short A9865Cod_parX ;
   private short A9864MaqAncA ;
   private short W9864MaqAncA ;
   private short W9865Cod_parX ;
   private short W10264Itm_ord4 ;
   private int A252CliCod ;
   private int GX_INS1295 ;
   private int W252CliCod ;
   private int GX_INS1304 ;
   private String A396EmprCod ;
   private String AV9Fascod ;
   private String AV10MaqCodF ;
   private String Gx_mode ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A9836FasCodM ;
   private String A9830MaqCodC ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String W396EmprCod ;
   private String W9836FasCodM ;
   private String W9830MaqCodC ;
   private String W65ArtCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A9867ParValX ;
   private boolean n10264Itm_ord4 ;
   private boolean n9868ParObsX ;
   private boolean n9867ParValX ;
   private String A9868ParObsX ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P012M2_A396EmprCod ;
   private String[] P012M2_A9836FasCodM ;
   private String[] P012M2_A9830MaqCodC ;
   private String[] P012M2_A758ProCod ;
   private String[] P012M2_A65ArtCod ;
   private int[] P012M2_A252CliCod ;
   private String[] P012M4_A396EmprCod ;
   private String[] P012M4_A9836FasCodM ;
   private String[] P012M4_A9830MaqCodC ;
   private short[] P012M4_A10264Itm_ord4 ;
   private boolean[] P012M4_n10264Itm_ord4 ;
   private short[] P012M4_A9865Cod_parX ;
   private String[] P012M4_A9868ParObsX ;
   private boolean[] P012M4_n9868ParObsX ;
   private String[] P012M4_A9867ParValX ;
   private boolean[] P012M4_n9867ParValX ;
   private short[] P012M4_A9864MaqAncA ;
   private String[] P012M4_A758ProCod ;
   private String[] P012M4_A65ArtCod ;
   private int[] P012M4_A252CliCod ;
   private String[] P012M6_A396EmprCod ;
   private String[] P012M6_A9836FasCodM ;
   private String[] P012M6_A9830MaqCodC ;
   private short[] P012M6_A1664ParFasCod ;
   private int[] P012M6_A252CliCod ;
   private String[] P012M6_A65ArtCod ;
   private String[] P012M6_A758ProCod ;
   private String[] P012M8_A396EmprCod ;
   private String[] P012M8_A9836FasCodM ;
   private String[] P012M8_A9830MaqCodC ;
   private short[] P012M8_A9865Cod_parX ;
   private int[] P012M8_A252CliCod ;
   private String[] P012M8_A65ArtCod ;
   private String[] P012M8_A758ProCod ;
   private short[] P012M8_A9864MaqAncA ;
}

final  class pagepunt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012M2", "SELECT EmprCod, FasCodM, MaqCodC, ProCod, ArtCod, CliCod FROM TXPCAPFM1 WHERE EmprCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012M3", "INSERT INTO TXPCAPFM2(EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod, Itm_ord2, ParFMVal, ParFMObs, ParEspIdS, ParFMVMin, ParFMVMax, ParFMVal2, ParFasPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM2")
         ,new ForEachCursor("P012M4", "SELECT EmprCod, FasCodM, MaqCodC, Itm_ord4, Cod_parX, ParObsX, ParValX, MaqAncA, ProCod, ArtCod, CliCod FROM TXPPFSMAC WHERE EmprCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, FasCodM, MaqCodC, Cod_parX ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012M5", "INSERT INTO TXPPFSMAC(EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX, ParValX, ParObsX, Itm_ord4) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMAC")
         ,new ForEachCursor("P012M6", "SELECT EmprCod, FasCodM, MaqCodC, ParFasCod, CliCod, ArtCod, ProCod FROM TXPCAPFM2 WHERE EmprCod = ? and FasCodM = ? and MaqCodC = ? and ParFasCod = ? ORDER BY EmprCod, FasCodM, MaqCodC, ParFasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012M7", "DELETE FROM TXPCAPFM2  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND ParFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM2")
         ,new ForEachCursor("P012M8", "SELECT EmprCod, FasCodM, MaqCodC, Cod_parX, CliCod, ArtCod, ProCod, MaqAncA FROM TXPPFSMAC WHERE EmprCod = ? and FasCodM = ? and MaqCodC = ? and Cod_parX = ? ORDER BY EmprCod, FasCodM, MaqCodC, Cod_parX ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012M9", "DELETE FROM TXPPFSMAC  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ? AND Cod_parX = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMAC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[11], 400);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[13]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

