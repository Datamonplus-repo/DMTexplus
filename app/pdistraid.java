package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdistraid extends GXProcedure
{
   public pdistraid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdistraid.class ), "" );
   }

   public pdistraid( int remoteHandle ,
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
      pdistraid.this.aP4 = new String[] {""};
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
      pdistraid.this.A396EmprCod = aP0;
      pdistraid.this.A129BarCod = aP1;
      pdistraid.this.A132BarCodReo = aP2;
      pdistraid.this.A130BarCodPar = aP3;
      pdistraid.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A7G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P0A7G2_A361DisCod[0] ;
         AV8Distraid = "" ;
         /* Using cursor P0A7G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13376DisTraID = P0A7G3_A13376DisTraID[0] ;
            AV8Distraid = A13376DisTraID ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P0A7G4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13905BarTraID = P0A7G4_A13905BarTraID[0] ;
            AV8Distraid = A13905BarTraID ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pdistraid.this.AV8Distraid;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Distraid = "" ;
      scmdbuf = "" ;
      P0A7G2_A396EmprCod = new String[] {""} ;
      P0A7G2_A129BarCod = new int[1] ;
      P0A7G2_A132BarCodReo = new byte[1] ;
      P0A7G2_A130BarCodPar = new String[] {""} ;
      P0A7G2_A361DisCod = new int[1] ;
      P0A7G3_A396EmprCod = new String[] {""} ;
      P0A7G3_A361DisCod = new int[1] ;
      P0A7G3_A13376DisTraID = new String[] {""} ;
      A13376DisTraID = "" ;
      P0A7G4_A396EmprCod = new String[] {""} ;
      P0A7G4_A129BarCod = new int[1] ;
      P0A7G4_A132BarCodReo = new byte[1] ;
      P0A7G4_A130BarCodPar = new String[] {""} ;
      P0A7G4_A13905BarTraID = new String[] {""} ;
      A13905BarTraID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdistraid__default(),
         new Object[] {
             new Object[] {
            P0A7G2_A396EmprCod, P0A7G2_A129BarCod, P0A7G2_A132BarCodReo, P0A7G2_A130BarCodPar, P0A7G2_A361DisCod
            }
            , new Object[] {
            P0A7G3_A396EmprCod, P0A7G3_A361DisCod, P0A7G3_A13376DisTraID
            }
            , new Object[] {
            P0A7G4_A396EmprCod, P0A7G4_A129BarCod, P0A7G4_A132BarCodReo, P0A7G4_A130BarCodPar, P0A7G4_A13905BarTraID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Distraid ;
   private String scmdbuf ;
   private String A13376DisTraID ;
   private String A13905BarTraID ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A7G2_A396EmprCod ;
   private int[] P0A7G2_A129BarCod ;
   private byte[] P0A7G2_A132BarCodReo ;
   private String[] P0A7G2_A130BarCodPar ;
   private int[] P0A7G2_A361DisCod ;
   private String[] P0A7G3_A396EmprCod ;
   private int[] P0A7G3_A361DisCod ;
   private String[] P0A7G3_A13376DisTraID ;
   private String[] P0A7G4_A396EmprCod ;
   private int[] P0A7G4_A129BarCod ;
   private byte[] P0A7G4_A132BarCodReo ;
   private String[] P0A7G4_A130BarCodPar ;
   private String[] P0A7G4_A13905BarTraID ;
}

final  class pdistraid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7G2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A7G3", "SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7G4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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

