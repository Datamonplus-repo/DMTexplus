package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbushrp extends GXProcedure
{
   public pbushrp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbushrp.class ), "" );
   }

   public pbushrp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 ,
                           byte[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 ,
                           byte[] aP5 )
   {
      pbushrp.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pbushrp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbushrp.this.AV19ManCod = aP1[0];
      this.aP1 = aP1;
      pbushrp.this.AV20OpeManCod = aP2[0];
      this.aP2 = aP2;
      pbushrp.this.AV16ParManHdr = aP3[0];
      this.aP3 = aP3;
      pbushrp.this.AV18ParManPar = aP4[0];
      this.aP4 = aP4;
      pbushrp.this.AV17ParManReo = aP5[0];
      this.aP5 = aP5;
      pbushrp.this.AV15Flag = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P00Q62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16ParManHdr), Byte.valueOf(AV17ParManReo), AV18ParManPar, Short.valueOf(AV19ManCod), Byte.valueOf(AV20OpeManCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3413OpeManCod = P00Q62_A3413OpeManCod[0] ;
         n3413OpeManCod = P00Q62_n3413OpeManCod[0] ;
         A2248ManCod = P00Q62_A2248ManCod[0] ;
         n2248ManCod = P00Q62_n2248ManCod[0] ;
         A3419ParManPar = P00Q62_A3419ParManPar[0] ;
         n3419ParManPar = P00Q62_n3419ParManPar[0] ;
         A3418ParManReo = P00Q62_A3418ParManReo[0] ;
         n3418ParManReo = P00Q62_n3418ParManReo[0] ;
         A3417ParManHdr = P00Q62_A3417ParManHdr[0] ;
         n3417ParManHdr = P00Q62_n3417ParManHdr[0] ;
         A3415ParManNum = P00Q62_A3415ParManNum[0] ;
         AV15Flag = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbushrp.this.A396EmprCod;
      this.aP1[0] = pbushrp.this.AV19ManCod;
      this.aP2[0] = pbushrp.this.AV20OpeManCod;
      this.aP3[0] = pbushrp.this.AV16ParManHdr;
      this.aP4[0] = pbushrp.this.AV18ParManPar;
      this.aP5[0] = pbushrp.this.AV17ParManReo;
      this.aP6[0] = pbushrp.this.AV15Flag;
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
      P00Q62_A396EmprCod = new String[] {""} ;
      P00Q62_A3413OpeManCod = new byte[1] ;
      P00Q62_n3413OpeManCod = new boolean[] {false} ;
      P00Q62_A2248ManCod = new short[1] ;
      P00Q62_n2248ManCod = new boolean[] {false} ;
      P00Q62_A3419ParManPar = new String[] {""} ;
      P00Q62_n3419ParManPar = new boolean[] {false} ;
      P00Q62_A3418ParManReo = new byte[1] ;
      P00Q62_n3418ParManReo = new boolean[] {false} ;
      P00Q62_A3417ParManHdr = new int[1] ;
      P00Q62_n3417ParManHdr = new boolean[] {false} ;
      P00Q62_A3415ParManNum = new int[1] ;
      A3419ParManPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbushrp__default(),
         new Object[] {
             new Object[] {
            P00Q62_A396EmprCod, P00Q62_A3413OpeManCod, P00Q62_n3413OpeManCod, P00Q62_A2248ManCod, P00Q62_n2248ManCod, P00Q62_A3419ParManPar, P00Q62_n3419ParManPar, P00Q62_A3418ParManReo, P00Q62_n3418ParManReo, P00Q62_A3417ParManHdr,
            P00Q62_n3417ParManHdr, P00Q62_A3415ParManNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20OpeManCod ;
   private byte AV17ParManReo ;
   private byte AV15Flag ;
   private byte A3413OpeManCod ;
   private byte A3418ParManReo ;
   private short AV19ManCod ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int AV16ParManHdr ;
   private int A3417ParManHdr ;
   private int A3415ParManNum ;
   private String A396EmprCod ;
   private String AV18ParManPar ;
   private String scmdbuf ;
   private String A3419ParManPar ;
   private boolean n3413OpeManCod ;
   private boolean n2248ManCod ;
   private boolean n3419ParManPar ;
   private boolean n3418ParManReo ;
   private boolean n3417ParManHdr ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private byte[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Q62_A396EmprCod ;
   private byte[] P00Q62_A3413OpeManCod ;
   private boolean[] P00Q62_n3413OpeManCod ;
   private short[] P00Q62_A2248ManCod ;
   private boolean[] P00Q62_n2248ManCod ;
   private String[] P00Q62_A3419ParManPar ;
   private boolean[] P00Q62_n3419ParManPar ;
   private byte[] P00Q62_A3418ParManReo ;
   private boolean[] P00Q62_n3418ParManReo ;
   private int[] P00Q62_A3417ParManHdr ;
   private boolean[] P00Q62_n3417ParManHdr ;
   private int[] P00Q62_A3415ParManNum ;
}

final  class pbushrp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Q62", "SELECT EmprCod, OpeManCod, ManCod, ParManPar, ParManReo, ParManHdr, ParManNum FROM TXPPARMAN WHERE (EmprCod = ?) AND (ParManHdr = ?) AND (ParManReo = ?) AND (ParManPar = ?) AND (ManCod = ?) AND (OpeManCod = ?) ORDER BY EmprCod, ParManNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

