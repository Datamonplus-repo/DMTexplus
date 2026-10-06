package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmaq extends GXProcedure
{
   public pbusmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmaq.class ), "" );
   }

   public pbusmaq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pbusmaq.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      pbusmaq.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusmaq.this.AV16MaqCod = aP1[0];
      this.aP1 = aP1;
      pbusmaq.this.AV17Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Flag = (byte)(0) ;
      /* Using cursor P000R2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P000R2_A602MaqCod[0] ;
         A396EmprCod = P000R2_A396EmprCod[0] ;
         AV17Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusmaq.this.AV15EmprCod;
      this.aP1[0] = pbusmaq.this.AV16MaqCod;
      this.aP2[0] = pbusmaq.this.AV17Flag;
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
      P000R2_A602MaqCod = new String[] {""} ;
      P000R2_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmaq__default(),
         new Object[] {
             new Object[] {
            P000R2_A602MaqCod, P000R2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Flag ;
   private short Gx_err ;
   private String AV15EmprCod ;
   private String AV16MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000R2_A602MaqCod ;
   private String[] P000R2_A396EmprCod ;
}

final  class pbusmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000R2", "SELECT MaqCod, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

