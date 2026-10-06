package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppz8019c extends GXProcedure
{
   public ppz8019c( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppz8019c.class ), "" );
   }

   public ppz8019c( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      ppz8019c.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      ppz8019c.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppz8019c.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppz8019c.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppz8019c.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppz8019c.this.AV8Num_p = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Num_p = 0 ;
      /* Optimized group. */
      /* Using cursor P03SE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      cV8Num_p = P03SE2_AV8Num_p[0] ;
      pr_default.close(0);
      AV8Num_p = (int)(AV8Num_p+cV8Num_p*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppz8019c.this.A396EmprCod;
      this.aP1[0] = ppz8019c.this.A129BarCod;
      this.aP2[0] = ppz8019c.this.A132BarCodReo;
      this.aP3[0] = ppz8019c.this.A130BarCodPar;
      this.aP4[0] = ppz8019c.this.AV8Num_p;
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
      P03SE2_AV8Num_p = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppz8019c__default(),
         new Object[] {
             new Object[] {
            P03SE2_AV8Num_p
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Num_p ;
   private int cV8Num_p ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P03SE2_AV8Num_p ;
}

final  class ppz8019c__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SE2", "SELECT COUNT(*) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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

