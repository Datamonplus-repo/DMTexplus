package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class poddisobs extends GXProcedure
{
   public poddisobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( poddisobs.class ), "" );
   }

   public poddisobs( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      poddisobs.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      poddisobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      poddisobs.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      poddisobs.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      poddisobs.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8vDisCod = 0 ;
      /* Using cursor P00M22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00M22_A361DisCod[0] ;
         AV8vDisCod = A361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (0==AV8vDisCod) )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = poddisobs.this.A396EmprCod;
      this.aP1[0] = poddisobs.this.A129BarCod;
      this.aP2[0] = poddisobs.this.A132BarCodReo;
      this.aP3[0] = poddisobs.this.A130BarCodPar;
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
      P00M22_A396EmprCod = new String[] {""} ;
      P00M22_A129BarCod = new int[1] ;
      P00M22_A132BarCodReo = new byte[1] ;
      P00M22_A130BarCodPar = new String[] {""} ;
      P00M22_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.poddisobs__default(),
         new Object[] {
             new Object[] {
            P00M22_A396EmprCod, P00M22_A129BarCod, P00M22_A132BarCodReo, P00M22_A130BarCodPar, P00M22_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8vDisCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00M22_A396EmprCod ;
   private int[] P00M22_A129BarCod ;
   private byte[] P00M22_A132BarCodReo ;
   private String[] P00M22_A130BarCodPar ;
   private int[] P00M22_A361DisCod ;
}

final  class poddisobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00M22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
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

