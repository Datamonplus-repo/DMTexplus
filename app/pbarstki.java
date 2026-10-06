package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarstki extends GXProcedure
{
   public pbarstki( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarstki.class ), "" );
   }

   public pbarstki( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pbarstki.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pbarstki.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarstki.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbarstki.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarstki.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarstki.this.AV8StkI = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01932 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P01932_A159BarFecGen[0] ;
         A361DisCod = P01932_A361DisCod[0] ;
         AV9DisCod = A361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P01933 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9DisCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A361DisCod = P01933_A361DisCod[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarstki.this.A396EmprCod;
      this.aP1[0] = pbarstki.this.A129BarCod;
      this.aP2[0] = pbarstki.this.A132BarCodReo;
      this.aP3[0] = pbarstki.this.A130BarCodPar;
      this.aP4[0] = pbarstki.this.AV8StkI;
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
      P01932_A396EmprCod = new String[] {""} ;
      P01932_A129BarCod = new int[1] ;
      P01932_A132BarCodReo = new byte[1] ;
      P01932_A130BarCodPar = new String[] {""} ;
      P01932_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P01932_A361DisCod = new int[1] ;
      A159BarFecGen = GXutil.nullDate() ;
      P01933_A396EmprCod = new String[] {""} ;
      P01933_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarstki__default(),
         new Object[] {
             new Object[] {
            P01932_A396EmprCod, P01932_A129BarCod, P01932_A132BarCodReo, P01932_A130BarCodPar, P01932_A159BarFecGen, P01932_A361DisCod
            }
            , new Object[] {
            P01933_A396EmprCod, P01933_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV9DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8StkI ;
   private String scmdbuf ;
   private java.util.Date A159BarFecGen ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01932_A396EmprCod ;
   private int[] P01932_A129BarCod ;
   private byte[] P01932_A132BarCodReo ;
   private String[] P01932_A130BarCodPar ;
   private java.util.Date[] P01932_A159BarFecGen ;
   private int[] P01932_A361DisCod ;
   private String[] P01933_A396EmprCod ;
   private int[] P01933_A361DisCod ;
}

final  class pbarstki__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01932", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFecGen, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01933", "SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

