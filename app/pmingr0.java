package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmingr0 extends GXProcedure
{
   public pmingr0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmingr0.class ), "" );
   }

   public pmingr0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pmingr0.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pmingr0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmingr0.this.A1794GruLecMaq = aP1[0];
      this.aP1 = aP1;
      pmingr0.this.AV15BarCod = aP2[0];
      this.aP2 = aP2;
      pmingr0.this.AV16BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmingr0.this.AV17BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15BarCod = 0 ;
      AV16BarCodReo = (byte)(0) ;
      AV17BarCodPar = "" ;
      /* Using cursor P01MA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1794GruLecMaq});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1795GruOrd = P01MA2_A1795GruOrd[0] ;
         A1792GruBarPar = P01MA2_A1792GruBarPar[0] ;
         A1793GruBarReo = P01MA2_A1793GruBarReo[0] ;
         A1791GruBarCod = P01MA2_A1791GruBarCod[0] ;
         AV15BarCod = A1791GruBarCod ;
         AV16BarCodReo = A1793GruBarReo ;
         AV17BarCodPar = A1792GruBarPar ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmingr0.this.A396EmprCod;
      this.aP1[0] = pmingr0.this.A1794GruLecMaq;
      this.aP2[0] = pmingr0.this.AV15BarCod;
      this.aP3[0] = pmingr0.this.AV16BarCodReo;
      this.aP4[0] = pmingr0.this.AV17BarCodPar;
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
      P01MA2_A396EmprCod = new String[] {""} ;
      P01MA2_A1794GruLecMaq = new String[] {""} ;
      P01MA2_A1795GruOrd = new byte[1] ;
      P01MA2_A1792GruBarPar = new String[] {""} ;
      P01MA2_A1793GruBarReo = new byte[1] ;
      P01MA2_A1791GruBarCod = new int[1] ;
      A1792GruBarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmingr0__default(),
         new Object[] {
             new Object[] {
            P01MA2_A396EmprCod, P01MA2_A1794GruLecMaq, P01MA2_A1795GruOrd, P01MA2_A1792GruBarPar, P01MA2_A1793GruBarReo, P01MA2_A1791GruBarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte A1795GruOrd ;
   private byte A1793GruBarReo ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A1791GruBarCod ;
   private String A396EmprCod ;
   private String A1794GruLecMaq ;
   private String AV17BarCodPar ;
   private String scmdbuf ;
   private String A1792GruBarPar ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01MA2_A396EmprCod ;
   private String[] P01MA2_A1794GruLecMaq ;
   private byte[] P01MA2_A1795GruOrd ;
   private String[] P01MA2_A1792GruBarPar ;
   private byte[] P01MA2_A1793GruBarReo ;
   private int[] P01MA2_A1791GruBarCod ;
}

final  class pmingr0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01MA2", "SELECT * FROM (SELECT EmprCod, GruLecMaq, GruOrd, GruBarPar, GruBarReo, GruBarCod FROM TXPGRULEC WHERE EmprCod = ? and GruLecMaq = ? and GruOrd = 0 ORDER BY EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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

