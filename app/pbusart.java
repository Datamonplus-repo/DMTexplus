package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusart extends GXProcedure
{
   public pbusart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusart.class ), "" );
   }

   public pbusart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 )
   {
      pbusart.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte[] aP3 )
   {
      pbusart.this.AV15EmprCod = aP0;
      pbusart.this.AV17CliOri = aP1;
      pbusart.this.AV16ArtOri = aP2;
      pbusart.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      AV21GXLvl3 = (byte)(0) ;
      /* Using cursor P00082 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17CliOri), AV16ArtOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P00082_A65ArtCod[0] ;
         A252CliCod = P00082_A252CliCod[0] ;
         A396EmprCod = P00082_A396EmprCod[0] ;
         AV21GXLvl3 = (byte)(1) ;
         AV18Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV21GXLvl3 == 0 )
      {
         AV18Flag = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pbusart.this.AV18Flag;
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
      P00082_A65ArtCod = new String[] {""} ;
      P00082_A252CliCod = new int[1] ;
      P00082_A396EmprCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusart__default(),
         new Object[] {
             new Object[] {
            P00082_A65ArtCod, P00082_A252CliCod, P00082_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Flag ;
   private byte AV21GXLvl3 ;
   private short Gx_err ;
   private int AV17CliOri ;
   private int A252CliCod ;
   private String AV15EmprCod ;
   private String AV16ArtOri ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00082_A65ArtCod ;
   private int[] P00082_A252CliCod ;
   private String[] P00082_A396EmprCod ;
}

final  class pbusart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00082", "SELECT ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

