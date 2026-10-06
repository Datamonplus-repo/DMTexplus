package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopy3 extends GXProcedure
{
   public pcopy3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopy3.class ), "" );
   }

   public pcopy3( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short[] executeUdp( String[] aP0 ,
                              int[] aP1 ,
                              short[] aP2 ,
                              String[] aP3 ,
                              short[] aP4 )
   {
      AV18Tab_tart = new short[1000] ;
      execute_int(aP0, aP1, aP2, aP3, aP4, AV18Tab_tart);
      return AV18Tab_tart;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        short[] AV18Tab_tart )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, AV18Tab_tart);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             short[] AV18Tab_tart )
   {
      pcopy3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopy3.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcopy3.this.A9713Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pcopy3.this.A11736CCArtCod = aP3[0];
      this.aP3 = aP3;
      pcopy3.this.AV17TipArtiId = aP4[0];
      this.aP4 = aP4;
      pcopy3.this.AV18Tab_tart = AV18Tab_tart;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19i = (short)(1) ;
      while ( AV19i <= 1000 )
      {
         if ( AV18Tab_tart[AV19i-1] == 0 )
         {
            if (true) break;
         }
         AV20TipARtcod = AV18Tab_tart[AV19i-1] ;
         Gx_msg = httpContext.getMessage( "Procesando.. ", "") + GXutil.str( AV20TipARtcod, 4, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P04UE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(AV17TipArtiId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A11748TipArtiId = P04UE2_A11748TipArtiId[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            W11736CCArtCod = A11736CCArtCod ;
            W11748TipArtiId = A11748TipArtiId ;
            /*
               INSERT RECORD ON TABLE TXPCCCno1

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            W11736CCArtCod = A11736CCArtCod ;
            W11748TipArtiId = A11748TipArtiId ;
            A11748TipArtiId = AV20TipARtcod ;
            /* Using cursor P04UE3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno1");
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
            A9713Tb1_Cod = W9713Tb1_Cod ;
            A11736CCArtCod = W11736CCArtCod ;
            A11748TipArtiId = W11748TipArtiId ;
            /* End Insert */
            /* Using cursor P04UE4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A11749CCCTc = P04UE4_A11749CCCTc[0] ;
               A11738CCColNum = P04UE4_A11738CCColNum[0] ;
               A11737CCColNom = P04UE4_A11737CCColNom[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W9713Tb1_Cod = A9713Tb1_Cod ;
               W11736CCArtCod = A11736CCArtCod ;
               W11748TipArtiId = A11748TipArtiId ;
               /*
                  INSERT RECORD ON TABLE TXPCCCno3

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W9713Tb1_Cod = A9713Tb1_Cod ;
               W11736CCArtCod = A11736CCArtCod ;
               W11748TipArtiId = A11748TipArtiId ;
               W11737CCColNom = A11737CCColNom ;
               W11738CCColNum = A11738CCColNum ;
               W11749CCCTc = A11749CCCTc ;
               A11748TipArtiId = AV20TipARtcod ;
               /* Using cursor P04UE5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
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
               A9713Tb1_Cod = W9713Tb1_Cod ;
               A11736CCArtCod = W11736CCArtCod ;
               A11748TipArtiId = W11748TipArtiId ;
               A11737CCColNom = W11737CCColNom ;
               A11738CCColNum = W11738CCColNum ;
               A11749CCCTc = W11749CCCTc ;
               /* End Insert */
               /* Using cursor P04UE6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A11750IntId = P04UE6_A11750IntId[0] ;
                  W396EmprCod = A396EmprCod ;
                  W252CliCod = A252CliCod ;
                  W9713Tb1_Cod = A9713Tb1_Cod ;
                  W11736CCArtCod = A11736CCArtCod ;
                  W11748TipArtiId = A11748TipArtiId ;
                  W11737CCColNom = A11737CCColNom ;
                  W11738CCColNum = A11738CCColNum ;
                  W11749CCCTc = A11749CCCTc ;
                  /*
                     INSERT RECORD ON TABLE TXPCCCno4

                  */
                  W396EmprCod = A396EmprCod ;
                  W252CliCod = A252CliCod ;
                  W9713Tb1_Cod = A9713Tb1_Cod ;
                  W11736CCArtCod = A11736CCArtCod ;
                  W11748TipArtiId = A11748TipArtiId ;
                  W11737CCColNom = A11737CCColNom ;
                  W11738CCColNum = A11738CCColNum ;
                  W11749CCCTc = A11749CCCTc ;
                  W11750IntId = A11750IntId ;
                  A11748TipArtiId = AV20TipARtcod ;
                  /* Using cursor P04UE7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
                  if ( (pr_default.getStatus(5) == 1) )
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
                  A9713Tb1_Cod = W9713Tb1_Cod ;
                  A11736CCArtCod = W11736CCArtCod ;
                  A11748TipArtiId = W11748TipArtiId ;
                  A11737CCColNom = W11737CCColNom ;
                  A11738CCColNum = W11738CCColNum ;
                  A11749CCCTc = W11749CCCTc ;
                  A11750IntId = W11750IntId ;
                  /* End Insert */
                  /* Using cursor P04UE8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A4031CCTCod = P04UE8_A4031CCTCod[0] ;
                     W396EmprCod = A396EmprCod ;
                     W252CliCod = A252CliCod ;
                     W9713Tb1_Cod = A9713Tb1_Cod ;
                     W11736CCArtCod = A11736CCArtCod ;
                     W11748TipArtiId = A11748TipArtiId ;
                     W11737CCColNom = A11737CCColNom ;
                     W11738CCColNum = A11738CCColNum ;
                     W11749CCCTc = A11749CCCTc ;
                     W11750IntId = A11750IntId ;
                     /*
                        INSERT RECORD ON TABLE TXPCCCno5

                     */
                     W396EmprCod = A396EmprCod ;
                     W252CliCod = A252CliCod ;
                     W9713Tb1_Cod = A9713Tb1_Cod ;
                     W11736CCArtCod = A11736CCArtCod ;
                     W11748TipArtiId = A11748TipArtiId ;
                     W11737CCColNom = A11737CCColNom ;
                     W11738CCColNum = A11738CCColNum ;
                     W11749CCCTc = A11749CCCTc ;
                     W11750IntId = A11750IntId ;
                     W4031CCTCod = A4031CCTCod ;
                     A11748TipArtiId = AV20TipARtcod ;
                     /* Using cursor P04UE9 */
                     pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno5");
                     if ( (pr_default.getStatus(7) == 1) )
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
                     A9713Tb1_Cod = W9713Tb1_Cod ;
                     A11736CCArtCod = W11736CCArtCod ;
                     A11748TipArtiId = W11748TipArtiId ;
                     A11737CCColNom = W11737CCColNom ;
                     A11738CCColNum = W11738CCColNum ;
                     A11749CCCTc = W11749CCCTc ;
                     A11750IntId = W11750IntId ;
                     A4031CCTCod = W4031CCTCod ;
                     /* End Insert */
                     A396EmprCod = W396EmprCod ;
                     A252CliCod = W252CliCod ;
                     A9713Tb1_Cod = W9713Tb1_Cod ;
                     A11736CCArtCod = W11736CCArtCod ;
                     A11748TipArtiId = W11748TipArtiId ;
                     A11737CCColNom = W11737CCColNom ;
                     A11738CCColNum = W11738CCColNum ;
                     A11749CCCTc = W11749CCCTc ;
                     A11750IntId = W11750IntId ;
                     pr_default.readNext(6);
                  }
                  pr_default.close(6);
                  A396EmprCod = W396EmprCod ;
                  A252CliCod = W252CliCod ;
                  A9713Tb1_Cod = W9713Tb1_Cod ;
                  A11736CCArtCod = W11736CCArtCod ;
                  A11748TipArtiId = W11748TipArtiId ;
                  A11737CCColNom = W11737CCColNom ;
                  A11738CCColNum = W11738CCColNum ;
                  A11749CCCTc = W11749CCCTc ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A9713Tb1_Cod = W9713Tb1_Cod ;
               A11736CCArtCod = W11736CCArtCod ;
               A11748TipArtiId = W11748TipArtiId ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            A11736CCArtCod = W11736CCArtCod ;
            A11748TipArtiId = W11748TipArtiId ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV19i = (short)(AV19i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopy3.this.A396EmprCod;
      this.aP1[0] = pcopy3.this.A252CliCod;
      this.aP2[0] = pcopy3.this.A9713Tb1_Cod;
      this.aP3[0] = pcopy3.this.A11736CCArtCod;
      this.aP4[0] = pcopy3.this.AV17TipArtiId;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopy3");
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
      P04UE2_A396EmprCod = new String[] {""} ;
      P04UE2_A252CliCod = new int[1] ;
      P04UE2_A9713Tb1_Cod = new short[1] ;
      P04UE2_A11736CCArtCod = new String[] {""} ;
      P04UE2_A11748TipArtiId = new short[1] ;
      W396EmprCod = "" ;
      W11736CCArtCod = "" ;
      Gx_emsg = "" ;
      P04UE4_A396EmprCod = new String[] {""} ;
      P04UE4_A252CliCod = new int[1] ;
      P04UE4_A9713Tb1_Cod = new short[1] ;
      P04UE4_A11736CCArtCod = new String[] {""} ;
      P04UE4_A11748TipArtiId = new short[1] ;
      P04UE4_A11749CCCTc = new byte[1] ;
      P04UE4_A11738CCColNum = new int[1] ;
      P04UE4_A11737CCColNom = new String[] {""} ;
      A11737CCColNom = "" ;
      W11737CCColNom = "" ;
      P04UE6_A396EmprCod = new String[] {""} ;
      P04UE6_A252CliCod = new int[1] ;
      P04UE6_A9713Tb1_Cod = new short[1] ;
      P04UE6_A11736CCArtCod = new String[] {""} ;
      P04UE6_A11748TipArtiId = new short[1] ;
      P04UE6_A11737CCColNom = new String[] {""} ;
      P04UE6_A11738CCColNum = new int[1] ;
      P04UE6_A11749CCCTc = new byte[1] ;
      P04UE6_A11750IntId = new short[1] ;
      P04UE8_A396EmprCod = new String[] {""} ;
      P04UE8_A252CliCod = new int[1] ;
      P04UE8_A9713Tb1_Cod = new short[1] ;
      P04UE8_A11736CCArtCod = new String[] {""} ;
      P04UE8_A11748TipArtiId = new short[1] ;
      P04UE8_A11737CCColNom = new String[] {""} ;
      P04UE8_A11738CCColNum = new int[1] ;
      P04UE8_A11749CCCTc = new byte[1] ;
      P04UE8_A11750IntId = new short[1] ;
      P04UE8_A4031CCTCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopy3__default(),
         new Object[] {
             new Object[] {
            P04UE2_A396EmprCod, P04UE2_A252CliCod, P04UE2_A9713Tb1_Cod, P04UE2_A11736CCArtCod, P04UE2_A11748TipArtiId
            }
            , new Object[] {
            }
            , new Object[] {
            P04UE4_A396EmprCod, P04UE4_A252CliCod, P04UE4_A9713Tb1_Cod, P04UE4_A11736CCArtCod, P04UE4_A11748TipArtiId, P04UE4_A11749CCCTc, P04UE4_A11738CCColNum, P04UE4_A11737CCColNom
            }
            , new Object[] {
            }
            , new Object[] {
            P04UE6_A396EmprCod, P04UE6_A252CliCod, P04UE6_A9713Tb1_Cod, P04UE6_A11736CCArtCod, P04UE6_A11748TipArtiId, P04UE6_A11737CCColNom, P04UE6_A11738CCColNum, P04UE6_A11749CCCTc, P04UE6_A11750IntId
            }
            , new Object[] {
            }
            , new Object[] {
            P04UE8_A396EmprCod, P04UE8_A252CliCod, P04UE8_A9713Tb1_Cod, P04UE8_A11736CCArtCod, P04UE8_A11748TipArtiId, P04UE8_A11737CCColNom, P04UE8_A11738CCColNum, P04UE8_A11749CCCTc, P04UE8_A11750IntId, P04UE8_A4031CCTCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11749CCCTc ;
   private byte W11749CCCTc ;
   private short A9713Tb1_Cod ;
   private short AV17TipArtiId ;
   private short AV19i ;
   private short AV20TipARtcod ;
   private short A11748TipArtiId ;
   private short W9713Tb1_Cod ;
   private short W11748TipArtiId ;
   private short Gx_err ;
   private short A11750IntId ;
   private short W11750IntId ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS1648 ;
   private int A11738CCColNum ;
   private int GX_INS1649 ;
   private int W11738CCColNum ;
   private int GX_INS1650 ;
   private int A4031CCTCod ;
   private int GX_INS1651 ;
   private int W4031CCTCod ;
   private String A396EmprCod ;
   private String A11736CCArtCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String W11736CCArtCod ;
   private String Gx_emsg ;
   private String A11737CCColNom ;
   private String W11737CCColNom ;
   private short[] AV18Tab_tart ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04UE2_A396EmprCod ;
   private int[] P04UE2_A252CliCod ;
   private short[] P04UE2_A9713Tb1_Cod ;
   private String[] P04UE2_A11736CCArtCod ;
   private short[] P04UE2_A11748TipArtiId ;
   private String[] P04UE4_A396EmprCod ;
   private int[] P04UE4_A252CliCod ;
   private short[] P04UE4_A9713Tb1_Cod ;
   private String[] P04UE4_A11736CCArtCod ;
   private short[] P04UE4_A11748TipArtiId ;
   private byte[] P04UE4_A11749CCCTc ;
   private int[] P04UE4_A11738CCColNum ;
   private String[] P04UE4_A11737CCColNom ;
   private String[] P04UE6_A396EmprCod ;
   private int[] P04UE6_A252CliCod ;
   private short[] P04UE6_A9713Tb1_Cod ;
   private String[] P04UE6_A11736CCArtCod ;
   private short[] P04UE6_A11748TipArtiId ;
   private String[] P04UE6_A11737CCColNom ;
   private int[] P04UE6_A11738CCColNum ;
   private byte[] P04UE6_A11749CCCTc ;
   private short[] P04UE6_A11750IntId ;
   private String[] P04UE8_A396EmprCod ;
   private int[] P04UE8_A252CliCod ;
   private short[] P04UE8_A9713Tb1_Cod ;
   private String[] P04UE8_A11736CCArtCod ;
   private short[] P04UE8_A11748TipArtiId ;
   private String[] P04UE8_A11737CCColNom ;
   private int[] P04UE8_A11738CCColNum ;
   private byte[] P04UE8_A11749CCCTc ;
   private short[] P04UE8_A11750IntId ;
   private int[] P04UE8_A4031CCTCod ;
}

final  class pcopy3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UE2", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId FROM TXPCCCno1 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04UE3", "INSERT INTO TXPCCCno1(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno1")
         ,new ForEachCursor("P04UE4", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCCTc, CCColNum, CCColNom FROM TXPCCCno3 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UE5", "INSERT INTO TXPCCCno3(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno3")
         ,new ForEachCursor("P04UE6", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCno4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UE7", "INSERT INTO TXPCCCno4(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno4")
         ,new ForEachCursor("P04UE8", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? and IntId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UE9", "INSERT INTO TXPCCCno5(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno5")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
      }
   }

}

