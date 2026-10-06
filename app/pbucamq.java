package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbucamq extends GXProcedure
{
   public pbucamq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbucamq.class ), "" );
   }

   public pbucamq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 ,
                           short[] aP3 )
   {
      pbucamq.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 )
   {
      pbucamq.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbucamq.this.AV16MaqCod = aP1[0];
      this.aP1 = aP1;
      pbucamq.this.AV18MaqCapac = aP2[0];
      this.aP2 = aP2;
      pbucamq.this.AV19MaqNhd = aP3[0];
      this.aP3 = aP3;
      pbucamq.this.AV17Flag = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Flag = (byte)(0) ;
      AV18MaqCapac = (short)(0) ;
      AV19MaqNhd = (short)(0) ;
      /* Using cursor P00NE2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P00NE2_A602MaqCod[0] ;
         A396EmprCod = P00NE2_A396EmprCod[0] ;
         A2998MaqCapac = P00NE2_A2998MaqCapac[0] ;
         n2998MaqCapac = P00NE2_n2998MaqCapac[0] ;
         A3000MaqNhd = P00NE2_A3000MaqNhd[0] ;
         n3000MaqNhd = P00NE2_n3000MaqNhd[0] ;
         AV17Flag = (byte)(1) ;
         AV18MaqCapac = A2998MaqCapac ;
         AV19MaqNhd = A3000MaqNhd ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbucamq.this.AV15EmprCod;
      this.aP1[0] = pbucamq.this.AV16MaqCod;
      this.aP2[0] = pbucamq.this.AV18MaqCapac;
      this.aP3[0] = pbucamq.this.AV19MaqNhd;
      this.aP4[0] = pbucamq.this.AV17Flag;
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
      P00NE2_A602MaqCod = new String[] {""} ;
      P00NE2_A396EmprCod = new String[] {""} ;
      P00NE2_A2998MaqCapac = new short[1] ;
      P00NE2_n2998MaqCapac = new boolean[] {false} ;
      P00NE2_A3000MaqNhd = new short[1] ;
      P00NE2_n3000MaqNhd = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbucamq__default(),
         new Object[] {
             new Object[] {
            P00NE2_A602MaqCod, P00NE2_A396EmprCod, P00NE2_A2998MaqCapac, P00NE2_n2998MaqCapac, P00NE2_A3000MaqNhd, P00NE2_n3000MaqNhd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Flag ;
   private short AV18MaqCapac ;
   private short AV19MaqNhd ;
   private short A2998MaqCapac ;
   private short A3000MaqNhd ;
   private short Gx_err ;
   private String AV15EmprCod ;
   private String AV16MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private boolean n2998MaqCapac ;
   private boolean n3000MaqNhd ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NE2_A602MaqCod ;
   private String[] P00NE2_A396EmprCod ;
   private short[] P00NE2_A2998MaqCapac ;
   private boolean[] P00NE2_n2998MaqCapac ;
   private short[] P00NE2_A3000MaqNhd ;
   private boolean[] P00NE2_n3000MaqNhd ;
}

final  class pbucamq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NE2", "SELECT MaqCod, EmprCod, MaqCapac, MaqNhd FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
               return;
      }
   }

}

