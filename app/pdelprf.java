package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelprf extends GXProcedure
{
   public pdelprf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelprf.class ), "" );
   }

   public pdelprf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pdelprf.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pdelprf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelprf.this.A2792TermiCod = aP1[0];
      this.aP1 = aP1;
      pdelprf.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pdelprf.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pdelprf.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00GD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P00GD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2794BarLinMaq = P00GD3_A2794BarLinMaq[0] ;
            /* Optimized DELETE. */
            /* Using cursor P00GD4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
            /* End optimized DELETE. */
            /* Using cursor P00GD5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00GD6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelprf.this.A396EmprCod;
      this.aP1[0] = pdelprf.this.A2792TermiCod;
      this.aP2[0] = pdelprf.this.A129BarCod;
      this.aP3[0] = pdelprf.this.A132BarCodReo;
      this.aP4[0] = pdelprf.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelprf");
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
      P00GD2_A396EmprCod = new String[] {""} ;
      P00GD2_A2792TermiCod = new String[] {""} ;
      P00GD2_A129BarCod = new int[1] ;
      P00GD2_A132BarCodReo = new byte[1] ;
      P00GD2_A130BarCodPar = new String[] {""} ;
      P00GD3_A396EmprCod = new String[] {""} ;
      P00GD3_A2792TermiCod = new String[] {""} ;
      P00GD3_A129BarCod = new int[1] ;
      P00GD3_A132BarCodReo = new byte[1] ;
      P00GD3_A130BarCodPar = new String[] {""} ;
      P00GD3_A2794BarLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelprf__default(),
         new Object[] {
             new Object[] {
            P00GD2_A396EmprCod, P00GD2_A2792TermiCod, P00GD2_A129BarCod, P00GD2_A132BarCodReo, P00GD2_A130BarCodPar
            }
            , new Object[] {
            P00GD3_A396EmprCod, P00GD3_A2792TermiCod, P00GD3_A129BarCod, P00GD3_A132BarCodReo, P00GD3_A130BarCodPar, P00GD3_A2794BarLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2794BarLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A2792TermiCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00GD2_A396EmprCod ;
   private String[] P00GD2_A2792TermiCod ;
   private int[] P00GD2_A129BarCod ;
   private byte[] P00GD2_A132BarCodReo ;
   private String[] P00GD2_A130BarCodPar ;
   private String[] P00GD3_A396EmprCod ;
   private String[] P00GD3_A2792TermiCod ;
   private int[] P00GD3_A129BarCod ;
   private byte[] P00GD3_A132BarCodReo ;
   private String[] P00GD3_A130BarCodPar ;
   private short[] P00GD3_A2794BarLinMaq ;
}

final  class pdelprf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00GD2", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00GD3", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00GD4", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P00GD5", "DELETE FROM TXPBARMAQ  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P00GD6", "DELETE FROM TXPBARTER  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

