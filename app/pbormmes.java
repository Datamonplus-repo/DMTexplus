package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbormmes extends GXProcedure
{
   public pbormmes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbormmes.class ), "" );
   }

   public pbormmes( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            byte[] aP2 )
   {
      pbormmes.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             short[] aP3 )
   {
      pbormmes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbormmes.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pbormmes.this.A614MaqMes = aP2[0];
      this.aP2 = aP2;
      pbormmes.this.A599MaqAny = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV15IntHnp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTHNP", ""), GXv_int1) ;
      pbormmes.this.AV15IntHnp = GXv_int1[0] ;
      /* Using cursor P003D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A610MaqHNPMes = P003D2_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P003D2_n610MaqHNPMes[0] ;
         if ( AV15IntHnp == 1 )
         {
            /* Optimized DELETE. */
            /* Using cursor P003D3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
            /* End optimized DELETE. */
         }
         /* Using cursor P003D4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbormmes.this.A396EmprCod;
      this.aP1[0] = pbormmes.this.A602MaqCod;
      this.aP2[0] = pbormmes.this.A614MaqMes;
      this.aP3[0] = pbormmes.this.A599MaqAny;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbormmes");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P003D2_A396EmprCod = new String[] {""} ;
      P003D2_A602MaqCod = new String[] {""} ;
      P003D2_A599MaqAny = new short[1] ;
      P003D2_A614MaqMes = new byte[1] ;
      P003D2_A610MaqHNPMes = new String[] {""} ;
      P003D2_n610MaqHNPMes = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbormmes__default(),
         new Object[] {
             new Object[] {
            P003D2_A396EmprCod, P003D2_A602MaqCod, P003D2_A599MaqAny, P003D2_A614MaqMes, P003D2_A610MaqHNPMes, P003D2_n610MaqHNPMes
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

   private byte A614MaqMes ;
   private byte AV15IntHnp ;
   private byte GXv_int1[] ;
   private short A599MaqAny ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private boolean n610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P003D2_A396EmprCod ;
   private String[] P003D2_A602MaqCod ;
   private short[] P003D2_A599MaqAny ;
   private byte[] P003D2_A614MaqMes ;
   private String[] P003D2_A610MaqHNPMes ;
   private boolean[] P003D2_n610MaqHNPMes ;
}

final  class pbormmes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003D2", "SELECT EmprCod, MaqCod, MaqAny, MaqMes, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003D3", "DELETE FROM TXPINTHNP  WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINTHNP")
         ,new UpdateCursor("P003D4", "DELETE FROM TXPMAQHNP  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQHNP")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

