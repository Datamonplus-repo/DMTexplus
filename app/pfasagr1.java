package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasagr1 extends GXProcedure
{
   public pfasagr1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasagr1.class ), "" );
   }

   public pfasagr1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           int[] aP5 ,
                           byte[] aP6 )
   {
      pfasagr1.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 )
   {
      pfasagr1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasagr1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasagr1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasagr1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasagr1.this.AV10BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pfasagr1.this.AV13BarFasLot = aP5[0];
      this.aP5 = aP5;
      pfasagr1.this.AV11FlagCtrl = aP6[0];
      this.aP6 = aP6;
      pfasagr1.this.AV12FlagRec = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11FlagCtrl = (byte)(0) ;
      /* Using cursor P01DR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV10BarOrdLin), Integer.valueOf(AV13BarFasLot)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4643BarFasLot = P01DR2_A4643BarFasLot[0] ;
         A194BarOrdLin = P01DR2_A194BarOrdLin[0] ;
         A758ProCod = P01DR2_A758ProCod[0] ;
         AV11FlagCtrl = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV12FlagRec = (byte)(0) ;
      /* Using cursor P01DR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV10BarOrdLin), Integer.valueOf(AV13BarFasLot)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P01DR3_A2804RecLinMaq[0] ;
         A4654RecNroPar = P01DR3_A4654RecNroPar[0] ;
         n4654RecNroPar = P01DR3_n4654RecNroPar[0] ;
         A4268RecOrdLin = P01DR3_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P01DR3_n4268RecOrdLin[0] ;
         /* Using cursor P01DR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4695RecVolPrf = P01DR4_A4695RecVolPrf[0] ;
            A1273RecLinPro = P01DR4_A1273RecLinPro[0] ;
            AV12FlagRec = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasagr1.this.A396EmprCod;
      this.aP1[0] = pfasagr1.this.A129BarCod;
      this.aP2[0] = pfasagr1.this.A132BarCodReo;
      this.aP3[0] = pfasagr1.this.A130BarCodPar;
      this.aP4[0] = pfasagr1.this.AV10BarOrdLin;
      this.aP5[0] = pfasagr1.this.AV13BarFasLot;
      this.aP6[0] = pfasagr1.this.AV11FlagCtrl;
      this.aP7[0] = pfasagr1.this.AV12FlagRec;
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
      P01DR2_A396EmprCod = new String[] {""} ;
      P01DR2_A129BarCod = new int[1] ;
      P01DR2_A132BarCodReo = new byte[1] ;
      P01DR2_A130BarCodPar = new String[] {""} ;
      P01DR2_A4643BarFasLot = new int[1] ;
      P01DR2_A194BarOrdLin = new short[1] ;
      P01DR2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P01DR3_A396EmprCod = new String[] {""} ;
      P01DR3_A129BarCod = new int[1] ;
      P01DR3_A132BarCodReo = new byte[1] ;
      P01DR3_A130BarCodPar = new String[] {""} ;
      P01DR3_A2804RecLinMaq = new short[1] ;
      P01DR3_A4654RecNroPar = new int[1] ;
      P01DR3_n4654RecNroPar = new boolean[] {false} ;
      P01DR3_A4268RecOrdLin = new short[1] ;
      P01DR3_n4268RecOrdLin = new boolean[] {false} ;
      P01DR4_A396EmprCod = new String[] {""} ;
      P01DR4_A129BarCod = new int[1] ;
      P01DR4_A132BarCodReo = new byte[1] ;
      P01DR4_A130BarCodPar = new String[] {""} ;
      P01DR4_A2804RecLinMaq = new short[1] ;
      P01DR4_A4695RecVolPrf = new int[1] ;
      P01DR4_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasagr1__default(),
         new Object[] {
             new Object[] {
            P01DR2_A396EmprCod, P01DR2_A129BarCod, P01DR2_A132BarCodReo, P01DR2_A130BarCodPar, P01DR2_A4643BarFasLot, P01DR2_A194BarOrdLin, P01DR2_A758ProCod
            }
            , new Object[] {
            P01DR3_A396EmprCod, P01DR3_A129BarCod, P01DR3_A132BarCodReo, P01DR3_A130BarCodPar, P01DR3_A2804RecLinMaq, P01DR3_A4654RecNroPar, P01DR3_n4654RecNroPar, P01DR3_A4268RecOrdLin, P01DR3_n4268RecOrdLin
            }
            , new Object[] {
            P01DR4_A396EmprCod, P01DR4_A129BarCod, P01DR4_A132BarCodReo, P01DR4_A130BarCodPar, P01DR4_A2804RecLinMaq, P01DR4_A4695RecVolPrf, P01DR4_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11FlagCtrl ;
   private byte AV12FlagRec ;
   private byte A1273RecLinPro ;
   private short AV10BarOrdLin ;
   private short A194BarOrdLin ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV13BarFasLot ;
   private int A4643BarFasLot ;
   private int A4654RecNroPar ;
   private int A4695RecVolPrf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A758ProCod ;
   private boolean n4654RecNroPar ;
   private boolean n4268RecOrdLin ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01DR2_A396EmprCod ;
   private int[] P01DR2_A129BarCod ;
   private byte[] P01DR2_A132BarCodReo ;
   private String[] P01DR2_A130BarCodPar ;
   private int[] P01DR2_A4643BarFasLot ;
   private short[] P01DR2_A194BarOrdLin ;
   private String[] P01DR2_A758ProCod ;
   private String[] P01DR3_A396EmprCod ;
   private int[] P01DR3_A129BarCod ;
   private byte[] P01DR3_A132BarCodReo ;
   private String[] P01DR3_A130BarCodPar ;
   private short[] P01DR3_A2804RecLinMaq ;
   private int[] P01DR3_A4654RecNroPar ;
   private boolean[] P01DR3_n4654RecNroPar ;
   private short[] P01DR3_A4268RecOrdLin ;
   private boolean[] P01DR3_n4268RecOrdLin ;
   private String[] P01DR4_A396EmprCod ;
   private int[] P01DR4_A129BarCod ;
   private byte[] P01DR4_A132BarCodReo ;
   private String[] P01DR4_A130BarCodPar ;
   private short[] P01DR4_A2804RecLinMaq ;
   private int[] P01DR4_A4695RecVolPrf ;
   private byte[] P01DR4_A1273RecLinPro ;
}

final  class pfasagr1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01DR2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasLot, BarOrdLin, ProCod FROM TXPFASMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (BarFasLot = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01DR3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecNroPar, RecOrdLin FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecOrdLin = ?) AND (RecNroPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01DR4", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

