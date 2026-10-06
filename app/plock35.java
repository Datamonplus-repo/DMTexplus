package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock35 extends GXProcedure
{
   public plock35( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock35.class ), "" );
   }

   public plock35( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          short[] aP5 )
   {
      plock35.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 )
   {
      plock35.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock35.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      plock35.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      plock35.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      plock35.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      plock35.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      plock35.this.A4031CCTCod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04K72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4032CCOpeCod = P04K72_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P04K72_n4032CCOpeCod[0] ;
         AV9CCOpeCod = A4032CCOpeCod ;
         A4032CCOpeCod = AV9CCOpeCod ;
         n4032CCOpeCod = false ;
         /* Using cursor P04K73 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock35.this.A396EmprCod;
      this.aP1[0] = plock35.this.A129BarCod;
      this.aP2[0] = plock35.this.A132BarCodReo;
      this.aP3[0] = plock35.this.A130BarCodPar;
      this.aP4[0] = plock35.this.A758ProCod;
      this.aP5[0] = plock35.this.A194BarOrdLin;
      this.aP6[0] = plock35.this.A4031CCTCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock35");
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
      P04K72_A396EmprCod = new String[] {""} ;
      P04K72_A129BarCod = new int[1] ;
      P04K72_A132BarCodReo = new byte[1] ;
      P04K72_A130BarCodPar = new String[] {""} ;
      P04K72_A758ProCod = new String[] {""} ;
      P04K72_A194BarOrdLin = new short[1] ;
      P04K72_A4031CCTCod = new int[1] ;
      P04K72_A4032CCOpeCod = new int[1] ;
      P04K72_n4032CCOpeCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock35__default(),
         new Object[] {
             new Object[] {
            P04K72_A396EmprCod, P04K72_A129BarCod, P04K72_A132BarCodReo, P04K72_A130BarCodPar, P04K72_A758ProCod, P04K72_A194BarOrdLin, P04K72_A4031CCTCod, P04K72_A4032CCOpeCod, P04K72_n4032CCOpeCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int A4032CCOpeCod ;
   private int AV9CCOpeCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private boolean n4032CCOpeCod ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04K72_A396EmprCod ;
   private int[] P04K72_A129BarCod ;
   private byte[] P04K72_A132BarCodReo ;
   private String[] P04K72_A130BarCodPar ;
   private String[] P04K72_A758ProCod ;
   private short[] P04K72_A194BarOrdLin ;
   private int[] P04K72_A4031CCTCod ;
   private int[] P04K72_A4032CCOpeCod ;
   private boolean[] P04K72_n4032CCOpeCod ;
}

final  class plock35__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04K72", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCOpeCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04K73", "UPDATE TXPCC SET CCOpeCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
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
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setInt(8, ((Number) parms[8]).intValue());
               return;
      }
   }

}

