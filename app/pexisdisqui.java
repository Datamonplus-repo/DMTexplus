package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexisdisqui extends GXProcedure
{
   public pexisdisqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexisdisqui.class ), "" );
   }

   public pexisdisqui( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           short[] aP3 ,
                           byte[] aP4 )
   {
      pexisdisqui.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 )
   {
      pexisdisqui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexisdisqui.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pexisdisqui.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      pexisdisqui.this.A368DisFasLin = aP3[0];
      this.aP3 = aP3;
      pexisdisqui.this.AV8Disqui = aP4[0];
      this.aP4 = aP4;
      pexisdisqui.this.AV9Dt004 = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Disqui = (byte)(0) ;
      AV9Dt004 = (byte)(0) ;
      /* Using cursor P04E42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5377DisQuiLin = P04E42_A5377DisQuiLin[0] ;
         AV8Disqui = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04E43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A7919Dta_Ordl = P04E43_A7919Dta_Ordl[0] ;
         AV9Dt004 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexisdisqui.this.A396EmprCod;
      this.aP1[0] = pexisdisqui.this.A361DisCod;
      this.aP2[0] = pexisdisqui.this.A758ProCod;
      this.aP3[0] = pexisdisqui.this.A368DisFasLin;
      this.aP4[0] = pexisdisqui.this.AV8Disqui;
      this.aP5[0] = pexisdisqui.this.AV9Dt004;
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
      P04E42_A396EmprCod = new String[] {""} ;
      P04E42_A361DisCod = new int[1] ;
      P04E42_A758ProCod = new String[] {""} ;
      P04E42_A368DisFasLin = new short[1] ;
      P04E42_A5377DisQuiLin = new short[1] ;
      P04E43_A396EmprCod = new String[] {""} ;
      P04E43_A361DisCod = new int[1] ;
      P04E43_A758ProCod = new String[] {""} ;
      P04E43_A368DisFasLin = new short[1] ;
      P04E43_A7919Dta_Ordl = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexisdisqui__default(),
         new Object[] {
             new Object[] {
            P04E42_A396EmprCod, P04E42_A361DisCod, P04E42_A758ProCod, P04E42_A368DisFasLin, P04E42_A5377DisQuiLin
            }
            , new Object[] {
            P04E43_A396EmprCod, P04E43_A361DisCod, P04E43_A758ProCod, P04E43_A368DisFasLin, P04E43_A7919Dta_Ordl
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Disqui ;
   private byte AV9Dt004 ;
   private short A368DisFasLin ;
   private short A5377DisQuiLin ;
   private short A7919Dta_Ordl ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04E42_A396EmprCod ;
   private int[] P04E42_A361DisCod ;
   private String[] P04E42_A758ProCod ;
   private short[] P04E42_A368DisFasLin ;
   private short[] P04E42_A5377DisQuiLin ;
   private String[] P04E43_A396EmprCod ;
   private int[] P04E43_A361DisCod ;
   private String[] P04E43_A758ProCod ;
   private short[] P04E43_A368DisFasLin ;
   private short[] P04E43_A7919Dta_Ordl ;
}

final  class pexisdisqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04E42", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04E43", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

