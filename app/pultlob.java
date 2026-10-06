package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultlob extends GXProcedure
{
   public pultlob( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultlob.class ), "" );
   }

   public pultlob( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pultlob.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pultlob.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pultlob.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pultlob.this.AV8UltLinea = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01LD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A376DisObsLin = P01LD2_A376DisObsLin[0] ;
         AV8UltLinea = A376DisObsLin ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8UltLinea = (byte)(AV8UltLinea+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pultlob.this.A396EmprCod;
      this.aP1[0] = pultlob.this.A361DisCod;
      this.aP2[0] = pultlob.this.AV8UltLinea;
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
      P01LD2_A396EmprCod = new String[] {""} ;
      P01LD2_A361DisCod = new int[1] ;
      P01LD2_A376DisObsLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultlob__default(),
         new Object[] {
             new Object[] {
            P01LD2_A396EmprCod, P01LD2_A361DisCod, P01LD2_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8UltLinea ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LD2_A396EmprCod ;
   private int[] P01LD2_A361DisCod ;
   private byte[] P01LD2_A376DisObsLin ;
}

final  class pultlob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LD2", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
      }
   }

}

