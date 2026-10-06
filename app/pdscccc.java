package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdscccc extends GXProcedure
{
   public pdscccc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdscccc.class ), "" );
   }

   public pdscccc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pdscccc.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pdscccc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdscccc.this.A4031CCTCod = aP1[0];
      this.aP1 = aP1;
      pdscccc.this.A4034CCTLin = aP2[0];
      this.aP2 = aP2;
      pdscccc.this.AV8Cctlindsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P04HS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4043CCTLinDsc = P04HS2_A4043CCTLinDsc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8Cctlindsc = A4043CCTLinDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8Cctlindsc = httpContext.getMessage( "No Existe", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdscccc.this.A396EmprCod;
      this.aP1[0] = pdscccc.this.A4031CCTCod;
      this.aP2[0] = pdscccc.this.A4034CCTLin;
      this.aP3[0] = pdscccc.this.AV8Cctlindsc;
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
      P04HS2_A396EmprCod = new String[] {""} ;
      P04HS2_A4031CCTCod = new int[1] ;
      P04HS2_A4034CCTLin = new short[1] ;
      P04HS2_A4043CCTLinDsc = new String[] {""} ;
      A4043CCTLinDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdscccc__default(),
         new Object[] {
             new Object[] {
            P04HS2_A396EmprCod, P04HS2_A4031CCTCod, P04HS2_A4034CCTLin, P04HS2_A4043CCTLinDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String AV8Cctlindsc ;
   private String scmdbuf ;
   private String A4043CCTLinDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04HS2_A396EmprCod ;
   private int[] P04HS2_A4031CCTCod ;
   private short[] P04HS2_A4034CCTLin ;
   private String[] P04HS2_A4043CCTLinDsc ;
}

final  class pdscccc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04HS2", "SELECT EmprCod, CCTCod, CCTLin, CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

