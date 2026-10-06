package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbustco extends GXProcedure
{
   public pbustco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbustco.class ), "" );
   }

   public pbustco( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 ,
                           String[] aP2 )
   {
      pbustco.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pbustco.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbustco.this.A996TipCon = aP1[0];
      this.aP1 = aP1;
      pbustco.this.AV8TipConDsc = aP2[0];
      this.aP2 = aP2;
      pbustco.this.AV9FlagCon = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9FlagCon = (byte)(0) ;
      /* Using cursor P00IE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A996TipCon)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A997TipConDsc = P00IE2_A997TipConDsc[0] ;
         n997TipConDsc = P00IE2_n997TipConDsc[0] ;
         AV9FlagCon = (byte)(1) ;
         AV8TipConDsc = A997TipConDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbustco.this.A396EmprCod;
      this.aP1[0] = pbustco.this.A996TipCon;
      this.aP2[0] = pbustco.this.AV8TipConDsc;
      this.aP3[0] = pbustco.this.AV9FlagCon;
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
      P00IE2_A396EmprCod = new String[] {""} ;
      P00IE2_A996TipCon = new short[1] ;
      P00IE2_A997TipConDsc = new String[] {""} ;
      P00IE2_n997TipConDsc = new boolean[] {false} ;
      A997TipConDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbustco__default(),
         new Object[] {
             new Object[] {
            P00IE2_A396EmprCod, P00IE2_A996TipCon, P00IE2_A997TipConDsc, P00IE2_n997TipConDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9FlagCon ;
   private short A996TipCon ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8TipConDsc ;
   private String scmdbuf ;
   private String A997TipConDsc ;
   private boolean n997TipConDsc ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00IE2_A396EmprCod ;
   private short[] P00IE2_A996TipCon ;
   private String[] P00IE2_A997TipConDsc ;
   private boolean[] P00IE2_n997TipConDsc ;
}

final  class pbustco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00IE2", "SELECT EmprCod, TipCon, TipConDsc FROM TXPTIPCON WHERE EmprCod = ? and TipCon = ? ORDER BY EmprCod, TipCon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

