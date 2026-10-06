package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbustdi extends GXProcedure
{
   public pbustdi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbustdi.class ), "" );
   }

   public pbustdi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           String aP1 ,
                           String[] aP2 )
   {
      pbustdi.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pbustdi.this.A396EmprCod = aP0;
      pbustdi.this.A5098TipDisCod = aP1;
      pbustdi.this.aP2 = aP2;
      pbustdi.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9TipDisDsc = "" ;
      AV10ExisTipDis = (byte)(0) ;
      /* Using cursor P01IR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A5098TipDisCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5097TipDisDsc = P01IR2_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P01IR2_n5097TipDisDsc[0] ;
         AV9TipDisDsc = A5097TipDisDsc ;
         AV10ExisTipDis = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pbustdi.this.AV9TipDisDsc;
      this.aP3[0] = pbustdi.this.AV10ExisTipDis;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9TipDisDsc = "" ;
      scmdbuf = "" ;
      P01IR2_A396EmprCod = new String[] {""} ;
      P01IR2_A5098TipDisCod = new String[] {""} ;
      P01IR2_A5097TipDisDsc = new String[] {""} ;
      P01IR2_n5097TipDisDsc = new boolean[] {false} ;
      A5097TipDisDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbustdi__default(),
         new Object[] {
             new Object[] {
            P01IR2_A396EmprCod, P01IR2_A5098TipDisCod, P01IR2_A5097TipDisDsc, P01IR2_n5097TipDisDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10ExisTipDis ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A5098TipDisCod ;
   private String AV9TipDisDsc ;
   private String scmdbuf ;
   private String A5097TipDisDsc ;
   private boolean n5097TipDisDsc ;
   private byte[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IR2_A396EmprCod ;
   private String[] P01IR2_A5098TipDisCod ;
   private String[] P01IR2_A5097TipDisDsc ;
   private boolean[] P01IR2_n5097TipDisDsc ;
}

final  class pbustdi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IR2", "SELECT EmprCod, TipDisCod, TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? and TipDisCod = ? ORDER BY EmprCod, TipDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setString(2, (String)parms[1], 1);
               return;
      }
   }

}

