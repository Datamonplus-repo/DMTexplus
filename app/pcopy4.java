package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopy4 extends GXProcedure
{
   public pcopy4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopy4.class ), "" );
   }

   public pcopy4( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 ,
                            int[] aP6 ,
                            byte[] aP7 )
   {
      pcopy4.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 )
   {
      pcopy4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopy4.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcopy4.this.A9713Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pcopy4.this.A11736CCArtCod = aP3[0];
      this.aP3 = aP3;
      pcopy4.this.A11748TipArtiId = aP4[0];
      this.aP4 = aP4;
      pcopy4.this.A11737CCColNom = aP5[0];
      this.aP5 = aP5;
      pcopy4.this.A11738CCColNum = aP6[0];
      this.aP6 = aP6;
      pcopy4.this.A11749CCCTc = aP7[0];
      this.aP7 = aP7;
      pcopy4.this.AV8IntId = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04UF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV8IntId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P04UF2_A583IntCod[0] ;
         AV9Intcod = A583IntCod ;
         /* Execute user subroutine: 'COPIAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COPIAR' Routine */
      returnInSub = false ;
      /* Using cursor P04UF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(AV8IntId)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A11750IntId = P04UF3_A11750IntId[0] ;
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
         A11750IntId = AV9Intcod ;
         /* Using cursor P04UF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
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
         /* Using cursor P04UF5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4031CCTCod = P04UF5_A4031CCTCod[0] ;
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
            A11750IntId = AV9Intcod ;
            /* Using cursor P04UF6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno5");
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
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A9713Tb1_Cod = W9713Tb1_Cod ;
         A11736CCArtCod = W11736CCArtCod ;
         A11748TipArtiId = W11748TipArtiId ;
         A11737CCColNom = W11737CCColNom ;
         A11738CCColNum = W11738CCColNum ;
         A11749CCCTc = W11749CCCTc ;
         A11750IntId = W11750IntId ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopy4.this.A396EmprCod;
      this.aP1[0] = pcopy4.this.A252CliCod;
      this.aP2[0] = pcopy4.this.A9713Tb1_Cod;
      this.aP3[0] = pcopy4.this.A11736CCArtCod;
      this.aP4[0] = pcopy4.this.A11748TipArtiId;
      this.aP5[0] = pcopy4.this.A11737CCColNom;
      this.aP6[0] = pcopy4.this.A11738CCColNum;
      this.aP7[0] = pcopy4.this.A11749CCCTc;
      this.aP8[0] = pcopy4.this.AV8IntId;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopy4");
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
      P04UF2_A396EmprCod = new String[] {""} ;
      P04UF2_A583IntCod = new byte[1] ;
      P04UF3_A396EmprCod = new String[] {""} ;
      P04UF3_A252CliCod = new int[1] ;
      P04UF3_A9713Tb1_Cod = new short[1] ;
      P04UF3_A11736CCArtCod = new String[] {""} ;
      P04UF3_A11748TipArtiId = new short[1] ;
      P04UF3_A11737CCColNom = new String[] {""} ;
      P04UF3_A11738CCColNum = new int[1] ;
      P04UF3_A11749CCCTc = new byte[1] ;
      P04UF3_A11750IntId = new short[1] ;
      W396EmprCod = "" ;
      W11736CCArtCod = "" ;
      W11737CCColNom = "" ;
      Gx_emsg = "" ;
      P04UF5_A396EmprCod = new String[] {""} ;
      P04UF5_A252CliCod = new int[1] ;
      P04UF5_A9713Tb1_Cod = new short[1] ;
      P04UF5_A11736CCArtCod = new String[] {""} ;
      P04UF5_A11748TipArtiId = new short[1] ;
      P04UF5_A11737CCColNom = new String[] {""} ;
      P04UF5_A11738CCColNum = new int[1] ;
      P04UF5_A11749CCCTc = new byte[1] ;
      P04UF5_A11750IntId = new short[1] ;
      P04UF5_A4031CCTCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopy4__default(),
         new Object[] {
             new Object[] {
            P04UF2_A396EmprCod, P04UF2_A583IntCod
            }
            , new Object[] {
            P04UF3_A396EmprCod, P04UF3_A252CliCod, P04UF3_A9713Tb1_Cod, P04UF3_A11736CCArtCod, P04UF3_A11748TipArtiId, P04UF3_A11737CCColNom, P04UF3_A11738CCColNum, P04UF3_A11749CCCTc, P04UF3_A11750IntId
            }
            , new Object[] {
            }
            , new Object[] {
            P04UF5_A396EmprCod, P04UF5_A252CliCod, P04UF5_A9713Tb1_Cod, P04UF5_A11736CCArtCod, P04UF5_A11748TipArtiId, P04UF5_A11737CCColNom, P04UF5_A11738CCColNum, P04UF5_A11749CCCTc, P04UF5_A11750IntId, P04UF5_A4031CCTCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11749CCCTc ;
   private byte A583IntCod ;
   private byte AV9Intcod ;
   private byte W11749CCCTc ;
   private short A9713Tb1_Cod ;
   private short A11748TipArtiId ;
   private short AV8IntId ;
   private short A11750IntId ;
   private short W9713Tb1_Cod ;
   private short W11748TipArtiId ;
   private short W11750IntId ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A11738CCColNum ;
   private int W252CliCod ;
   private int W11738CCColNum ;
   private int GX_INS1650 ;
   private int A4031CCTCod ;
   private int GX_INS1651 ;
   private int W4031CCTCod ;
   private String A396EmprCod ;
   private String A11736CCArtCod ;
   private String A11737CCColNom ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String W11736CCArtCod ;
   private String W11737CCColNom ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private short[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04UF2_A396EmprCod ;
   private byte[] P04UF2_A583IntCod ;
   private String[] P04UF3_A396EmprCod ;
   private int[] P04UF3_A252CliCod ;
   private short[] P04UF3_A9713Tb1_Cod ;
   private String[] P04UF3_A11736CCArtCod ;
   private short[] P04UF3_A11748TipArtiId ;
   private String[] P04UF3_A11737CCColNom ;
   private int[] P04UF3_A11738CCColNum ;
   private byte[] P04UF3_A11749CCCTc ;
   private short[] P04UF3_A11750IntId ;
   private String[] P04UF5_A396EmprCod ;
   private int[] P04UF5_A252CliCod ;
   private short[] P04UF5_A9713Tb1_Cod ;
   private String[] P04UF5_A11736CCArtCod ;
   private short[] P04UF5_A11748TipArtiId ;
   private String[] P04UF5_A11737CCColNom ;
   private int[] P04UF5_A11738CCColNum ;
   private byte[] P04UF5_A11749CCCTc ;
   private short[] P04UF5_A11750IntId ;
   private int[] P04UF5_A4031CCTCod ;
}

final  class pcopy4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UF2", "SELECT EmprCod, IntCod FROM TXPINTENS WHERE (EmprCod = ?) AND (IntCod <> ?) ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04UF3", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCno4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? and IntId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04UF4", "INSERT INTO TXPCCCno4(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno4")
         ,new ForEachCursor("P04UF5", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? and IntId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UF6", "INSERT INTO TXPCCCno5(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno5")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 1 :
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
            case 3 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
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
            case 2 :
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
            case 3 :
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
            case 4 :
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

