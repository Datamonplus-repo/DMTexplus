package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_barfassig extends GXProcedure
{
   public pget_barfassig( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_barfassig.class ), "" );
   }

   public pget_barfassig( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      pget_barfassig.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      pget_barfassig.this.AV13EmprCod = aP0;
      pget_barfassig.this.AV10BarCod = aP1;
      pget_barfassig.this.AV11BarCodReo = aP2;
      pget_barfassig.this.AV12BarCodPar = aP3;
      pget_barfassig.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9BarOrdLin = (short)(0) ;
      AV8FasCod = "" ;
      /* Using cursor P0AAL2 */
      pr_default.execute(0, new Object[] {AV13EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AAL2_A396EmprCod[0] ;
         A129BarCod = P0AAL2_A129BarCod[0] ;
         A132BarCodReo = P0AAL2_A132BarCodReo[0] ;
         A130BarCodPar = P0AAL2_A130BarCodPar[0] ;
         A153BarFasEst = P0AAL2_A153BarFasEst[0] ;
         A194BarOrdLin = P0AAL2_A194BarOrdLin[0] ;
         A758ProCod = P0AAL2_A758ProCod[0] ;
         AV9BarOrdLin = A194BarOrdLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P0AAL3 */
      pr_default.execute(1, new Object[] {AV13EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, Short.valueOf(AV9BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A153BarFasEst = P0AAL3_A153BarFasEst[0] ;
         A194BarOrdLin = P0AAL3_A194BarOrdLin[0] ;
         A130BarCodPar = P0AAL3_A130BarCodPar[0] ;
         A132BarCodReo = P0AAL3_A132BarCodReo[0] ;
         A129BarCod = P0AAL3_A129BarCod[0] ;
         A396EmprCod = P0AAL3_A396EmprCod[0] ;
         A457FasCod = P0AAL3_A457FasCod[0] ;
         A758ProCod = P0AAL3_A758ProCod[0] ;
         AV8FasCod = A457FasCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV14BarOrdLinOut = AV8FasCod ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pget_barfassig.this.AV14BarOrdLinOut;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14BarOrdLinOut = "" ;
      AV8FasCod = "" ;
      scmdbuf = "" ;
      P0AAL2_A396EmprCod = new String[] {""} ;
      P0AAL2_A129BarCod = new int[1] ;
      P0AAL2_A132BarCodReo = new byte[1] ;
      P0AAL2_A130BarCodPar = new String[] {""} ;
      P0AAL2_A153BarFasEst = new byte[1] ;
      P0AAL2_A194BarOrdLin = new short[1] ;
      P0AAL2_A758ProCod = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      P0AAL3_A153BarFasEst = new byte[1] ;
      P0AAL3_A194BarOrdLin = new short[1] ;
      P0AAL3_A130BarCodPar = new String[] {""} ;
      P0AAL3_A132BarCodReo = new byte[1] ;
      P0AAL3_A129BarCod = new int[1] ;
      P0AAL3_A396EmprCod = new String[] {""} ;
      P0AAL3_A457FasCod = new String[] {""} ;
      P0AAL3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pget_barfassig__default(),
         new Object[] {
             new Object[] {
            P0AAL2_A396EmprCod, P0AAL2_A129BarCod, P0AAL2_A132BarCodReo, P0AAL2_A130BarCodPar, P0AAL2_A153BarFasEst, P0AAL2_A194BarOrdLin, P0AAL2_A758ProCod
            }
            , new Object[] {
            P0AAL3_A153BarFasEst, P0AAL3_A194BarOrdLin, P0AAL3_A130BarCodPar, P0AAL3_A132BarCodReo, P0AAL3_A129BarCod, P0AAL3_A396EmprCod, P0AAL3_A457FasCod, P0AAL3_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodReo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short AV9BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV10BarCod ;
   private int A129BarCod ;
   private String AV13EmprCod ;
   private String AV12BarCodPar ;
   private String AV14BarOrdLinOut ;
   private String AV8FasCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAL2_A396EmprCod ;
   private int[] P0AAL2_A129BarCod ;
   private byte[] P0AAL2_A132BarCodReo ;
   private String[] P0AAL2_A130BarCodPar ;
   private byte[] P0AAL2_A153BarFasEst ;
   private short[] P0AAL2_A194BarOrdLin ;
   private String[] P0AAL2_A758ProCod ;
   private byte[] P0AAL3_A153BarFasEst ;
   private short[] P0AAL3_A194BarOrdLin ;
   private String[] P0AAL3_A130BarCodPar ;
   private byte[] P0AAL3_A132BarCodReo ;
   private int[] P0AAL3_A129BarCod ;
   private String[] P0AAL3_A396EmprCod ;
   private String[] P0AAL3_A457FasCod ;
   private String[] P0AAL3_A758ProCod ;
}

final  class pget_barfassig__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAL2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst <> 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AAL3", "SELECT * FROM (SELECT BarFasEst, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, FasCod, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin > ?) AND (BarFasEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
      }
   }

}

