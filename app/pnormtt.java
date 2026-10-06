package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnormtt extends GXProcedure
{
   public pnormtt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnormtt.class ), "" );
   }

   public pnormtt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String[] aP5 )
   {
      pnormtt.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pnormtt.this.A396EmprCod = aP0;
      pnormtt.this.AV12BarCod = aP1;
      pnormtt.this.AV11BarCodReo = aP2;
      pnormtt.this.AV10BarCodPar = aP3;
      pnormtt.this.A361DisCod = aP4;
      pnormtt.this.aP5 = aP5;
      pnormtt.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A7F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13213DisNormID = P0A7F2_A13213DisNormID[0] ;
         AV9DisNormID = A13213DisNormID ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P0A7F3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13376DisTraID = P0A7F3_A13376DisTraID[0] ;
         AV8DisTraID = A13376DisTraID ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P0A7F4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P0A7F4_A130BarCodPar[0] ;
         A132BarCodReo = P0A7F4_A132BarCodReo[0] ;
         A129BarCod = P0A7F4_A129BarCod[0] ;
         A13905BarTraID = P0A7F4_A13905BarTraID[0] ;
         AV8DisTraID = A13905BarTraID ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pnormtt.this.AV9DisNormID;
      this.aP6[0] = pnormtt.this.AV8DisTraID;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9DisNormID = "" ;
      AV8DisTraID = "" ;
      scmdbuf = "" ;
      P0A7F2_A396EmprCod = new String[] {""} ;
      P0A7F2_A361DisCod = new int[1] ;
      P0A7F2_A13213DisNormID = new String[] {""} ;
      A13213DisNormID = "" ;
      P0A7F3_A396EmprCod = new String[] {""} ;
      P0A7F3_A361DisCod = new int[1] ;
      P0A7F3_A13376DisTraID = new String[] {""} ;
      A13376DisTraID = "" ;
      P0A7F4_A396EmprCod = new String[] {""} ;
      P0A7F4_A130BarCodPar = new String[] {""} ;
      P0A7F4_A132BarCodReo = new byte[1] ;
      P0A7F4_A129BarCod = new int[1] ;
      P0A7F4_A13905BarTraID = new String[] {""} ;
      A130BarCodPar = "" ;
      A13905BarTraID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnormtt__default(),
         new Object[] {
             new Object[] {
            P0A7F2_A396EmprCod, P0A7F2_A361DisCod, P0A7F2_A13213DisNormID
            }
            , new Object[] {
            P0A7F3_A396EmprCod, P0A7F3_A361DisCod, P0A7F3_A13376DisTraID
            }
            , new Object[] {
            P0A7F4_A396EmprCod, P0A7F4_A130BarCodPar, P0A7F4_A132BarCodReo, P0A7F4_A129BarCod, P0A7F4_A13905BarTraID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV12BarCod ;
   private int A361DisCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV9DisNormID ;
   private String AV8DisTraID ;
   private String scmdbuf ;
   private String A13213DisNormID ;
   private String A13376DisTraID ;
   private String A130BarCodPar ;
   private String A13905BarTraID ;
   private String[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A7F2_A396EmprCod ;
   private int[] P0A7F2_A361DisCod ;
   private String[] P0A7F2_A13213DisNormID ;
   private String[] P0A7F3_A396EmprCod ;
   private int[] P0A7F3_A361DisCod ;
   private String[] P0A7F3_A13376DisTraID ;
   private String[] P0A7F4_A396EmprCod ;
   private String[] P0A7F4_A130BarCodPar ;
   private byte[] P0A7F4_A132BarCodReo ;
   private int[] P0A7F4_A129BarCod ;
   private String[] P0A7F4_A13905BarTraID ;
}

final  class pnormtt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7F2", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7F3", "SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7F4", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTraID FROM TXPBARTTI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

