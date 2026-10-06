package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexintf extends GXProcedure
{
   public pexintf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexintf.class ), "" );
   }

   public pexintf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           byte[] aP1 )
   {
      pexintf.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 )
   {
      pexintf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexintf.this.A5362IntCodF = aP1[0];
      this.aP1 = aP1;
      pexintf.this.AV8Ctrl_i = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ctrl_i = (byte)(0) ;
      /* Using cursor P01PH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A5362IntCodF)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8Ctrl_i = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexintf.this.A396EmprCod;
      this.aP1[0] = pexintf.this.A5362IntCodF;
      this.aP2[0] = pexintf.this.AV8Ctrl_i;
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
      P01PH2_A396EmprCod = new String[] {""} ;
      P01PH2_A5362IntCodF = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexintf__default(),
         new Object[] {
             new Object[] {
            P01PH2_A396EmprCod, P01PH2_A5362IntCodF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5362IntCodF ;
   private byte AV8Ctrl_i ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PH2_A396EmprCod ;
   private byte[] P01PH2_A5362IntCodF ;
}

final  class pexintf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PH2", "SELECT EmprCod, IntCodF FROM TXPINTFAC WHERE EmprCod = ? and IntCodF = ? ORDER BY EmprCod, IntCodF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

