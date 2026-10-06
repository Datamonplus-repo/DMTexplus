package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasanti extends GXProcedure
{
   public pfasanti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasanti.class ), "" );
   }

   public pfasanti( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            byte[] aP5 )
   {
      pfasanti.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 )
   {
      pfasanti.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasanti.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasanti.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasanti.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasanti.this.AV18BarOrdlin = aP4[0];
      this.aP4 = aP4;
      pfasanti.this.AV15FlagAnt = aP5[0];
      this.aP5 = aP5;
      pfasanti.this.AV19Linea = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagAnt = (byte)(0) ;
      /* Using cursor P00KP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV18BarOrdlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P00KP2_A194BarOrdLin[0] ;
         A153BarFasEst = P00KP2_A153BarFasEst[0] ;
         A758ProCod = P00KP2_A758ProCod[0] ;
         AV15FlagAnt = A153BarFasEst ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasanti.this.A396EmprCod;
      this.aP1[0] = pfasanti.this.A129BarCod;
      this.aP2[0] = pfasanti.this.A132BarCodReo;
      this.aP3[0] = pfasanti.this.A130BarCodPar;
      this.aP4[0] = pfasanti.this.AV18BarOrdlin;
      this.aP5[0] = pfasanti.this.AV15FlagAnt;
      this.aP6[0] = pfasanti.this.AV19Linea;
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
      P00KP2_A396EmprCod = new String[] {""} ;
      P00KP2_A129BarCod = new int[1] ;
      P00KP2_A132BarCodReo = new byte[1] ;
      P00KP2_A130BarCodPar = new String[] {""} ;
      P00KP2_A194BarOrdLin = new short[1] ;
      P00KP2_A153BarFasEst = new byte[1] ;
      P00KP2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasanti__default(),
         new Object[] {
             new Object[] {
            P00KP2_A396EmprCod, P00KP2_A129BarCod, P00KP2_A132BarCodReo, P00KP2_A130BarCodPar, P00KP2_A194BarOrdLin, P00KP2_A153BarFasEst, P00KP2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15FlagAnt ;
   private byte A153BarFasEst ;
   private short AV18BarOrdlin ;
   private short AV19Linea ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A758ProCod ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00KP2_A396EmprCod ;
   private int[] P00KP2_A129BarCod ;
   private byte[] P00KP2_A132BarCodReo ;
   private String[] P00KP2_A130BarCodPar ;
   private short[] P00KP2_A194BarOrdLin ;
   private byte[] P00KP2_A153BarFasEst ;
   private String[] P00KP2_A758ProCod ;
}

final  class pfasanti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00KP2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               return;
      }
   }

}

