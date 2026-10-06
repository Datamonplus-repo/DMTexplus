package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrsituacion extends GXProcedure
{
   public phdrsituacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrsituacion.class ), "" );
   }

   public phdrsituacion( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 )
   {
      phdrsituacion.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             byte[] aP4 )
   {
      phdrsituacion.this.A396EmprCod = aP0;
      phdrsituacion.this.A129BarCod = aP1;
      phdrsituacion.this.A132BarCodReo = aP2;
      phdrsituacion.this.A130BarCodPar = aP3;
      phdrsituacion.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Barsit = (byte)(0) ;
      /* Using cursor P05GM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P05GM2_A213BarSit[0] ;
         AV8Barsit = A213BarSit ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = phdrsituacion.this.AV8Barsit;
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
      P05GM2_A396EmprCod = new String[] {""} ;
      P05GM2_A129BarCod = new int[1] ;
      P05GM2_A132BarCodReo = new byte[1] ;
      P05GM2_A130BarCodPar = new String[] {""} ;
      P05GM2_A213BarSit = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrsituacion__default(),
         new Object[] {
             new Object[] {
            P05GM2_A396EmprCod, P05GM2_A129BarCod, P05GM2_A132BarCodReo, P05GM2_A130BarCodPar, P05GM2_A213BarSit
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Barsit ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05GM2_A396EmprCod ;
   private int[] P05GM2_A129BarCod ;
   private byte[] P05GM2_A132BarCodReo ;
   private String[] P05GM2_A130BarCodPar ;
   private byte[] P05GM2_A213BarSit ;
}

final  class phdrsituacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GM2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

