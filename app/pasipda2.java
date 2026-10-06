package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pasipda2 extends GXProcedure
{
   public pasipda2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pasipda2.class ), "" );
   }

   public pasipda2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 )
   {
      pasipda2.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 )
   {
      pasipda2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pasipda2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pasipda2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pasipda2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pasipda2.this.AV11DisCod = aP4[0];
      this.aP4 = aP4;
      pasipda2.this.AV12BarMacCod = aP5[0];
      this.aP5 = aP5;
      pasipda2.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12BarMacCod = 0 ;
      Gx_msg = " " ;
      /* Using cursor P02DR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02DR2_A361DisCod[0] ;
         A3595BarMacCod = P02DR2_A3595BarMacCod[0] ;
         AV11DisCod = A361DisCod ;
         AV12BarMacCod = A3595BarMacCod ;
         if ( ! (0==A3595BarMacCod) )
         {
            Gx_msg = httpContext.getMessage( "Atencion esta HDR ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) + httpContext.getMessage( "Tiene Nº Partida ", "") + GXutil.str( A3595BarMacCod, 8, 0) + GXutil.newLine( ) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pasipda2.this.A396EmprCod;
      this.aP1[0] = pasipda2.this.A129BarCod;
      this.aP2[0] = pasipda2.this.A132BarCodReo;
      this.aP3[0] = pasipda2.this.A130BarCodPar;
      this.aP4[0] = pasipda2.this.AV11DisCod;
      this.aP5[0] = pasipda2.this.AV12BarMacCod;
      this.aP6[0] = pasipda2.this.Gx_msg;
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
      P02DR2_A396EmprCod = new String[] {""} ;
      P02DR2_A129BarCod = new int[1] ;
      P02DR2_A132BarCodReo = new byte[1] ;
      P02DR2_A130BarCodPar = new String[] {""} ;
      P02DR2_A361DisCod = new int[1] ;
      P02DR2_A3595BarMacCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pasipda2__default(),
         new Object[] {
             new Object[] {
            P02DR2_A396EmprCod, P02DR2_A129BarCod, P02DR2_A132BarCodReo, P02DR2_A130BarCodPar, P02DR2_A361DisCod, P02DR2_A3595BarMacCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11DisCod ;
   private int AV12BarMacCod ;
   private int A361DisCod ;
   private int A3595BarMacCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DR2_A396EmprCod ;
   private int[] P02DR2_A129BarCod ;
   private byte[] P02DR2_A132BarCodReo ;
   private String[] P02DR2_A130BarCodPar ;
   private int[] P02DR2_A361DisCod ;
   private int[] P02DR2_A3595BarMacCod ;
}

final  class pasipda2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DR2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod, BarMacCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

