package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumfas extends GXProcedure
{
   public pnumfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumfas.class ), "" );
   }

   public pnumfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pnumfas.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pnumfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumfas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnumfas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnumfas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnumfas.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pnumfas.this.AV15BarOrdLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Profaslin = (short)(0) ;
      /* Using cursor P00972 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P00972_A194BarOrdLin[0] ;
         AV16Profaslin = A194BarOrdLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00973 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A761ProFasLin = P00973_A761ProFasLin[0] ;
         n761ProFasLin = P00973_n761ProFasLin[0] ;
         if ( AV16Profaslin != A761ProFasLin )
         {
            AV15BarOrdLin = (short)(AV16Profaslin+100) ;
         }
         else
         {
            AV15BarOrdLin = (short)(A761ProFasLin+100) ;
         }
         A761ProFasLin = AV15BarOrdLin ;
         n761ProFasLin = false ;
         /* Using cursor P00974 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumfas.this.A396EmprCod;
      this.aP1[0] = pnumfas.this.A129BarCod;
      this.aP2[0] = pnumfas.this.A132BarCodReo;
      this.aP3[0] = pnumfas.this.A130BarCodPar;
      this.aP4[0] = pnumfas.this.A758ProCod;
      this.aP5[0] = pnumfas.this.AV15BarOrdLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumfas");
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
      P00972_A396EmprCod = new String[] {""} ;
      P00972_A129BarCod = new int[1] ;
      P00972_A132BarCodReo = new byte[1] ;
      P00972_A130BarCodPar = new String[] {""} ;
      P00972_A758ProCod = new String[] {""} ;
      P00972_A194BarOrdLin = new short[1] ;
      P00973_A396EmprCod = new String[] {""} ;
      P00973_A129BarCod = new int[1] ;
      P00973_A132BarCodReo = new byte[1] ;
      P00973_A130BarCodPar = new String[] {""} ;
      P00973_A758ProCod = new String[] {""} ;
      P00973_A761ProFasLin = new short[1] ;
      P00973_n761ProFasLin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumfas__default(),
         new Object[] {
             new Object[] {
            P00972_A396EmprCod, P00972_A129BarCod, P00972_A132BarCodReo, P00972_A130BarCodPar, P00972_A758ProCod, P00972_A194BarOrdLin
            }
            , new Object[] {
            P00973_A396EmprCod, P00973_A129BarCod, P00973_A132BarCodReo, P00973_A130BarCodPar, P00973_A758ProCod, P00973_A761ProFasLin, P00973_n761ProFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV15BarOrdLin ;
   private short AV16Profaslin ;
   private short A194BarOrdLin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private boolean n761ProFasLin ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00972_A396EmprCod ;
   private int[] P00972_A129BarCod ;
   private byte[] P00972_A132BarCodReo ;
   private String[] P00972_A130BarCodPar ;
   private String[] P00972_A758ProCod ;
   private short[] P00972_A194BarOrdLin ;
   private String[] P00973_A396EmprCod ;
   private int[] P00973_A129BarCod ;
   private byte[] P00973_A132BarCodReo ;
   private String[] P00973_A130BarCodPar ;
   private String[] P00973_A758ProCod ;
   private short[] P00973_A761ProFasLin ;
   private boolean[] P00973_n761ProFasLin ;
}

final  class pnumfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00972", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00973", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00974", "UPDATE TXPBARPRO SET ProFasLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               return;
      }
   }

}

