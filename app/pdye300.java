package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdye300 extends GXProcedure
{
   public pdye300( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdye300.class ), "" );
   }

   public pdye300( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           int[] aP7 )
   {
      pdye300.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      pdye300.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      pdye300.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pdye300.this.AV9BarcodReo = aP2[0];
      this.aP2 = aP2;
      pdye300.this.AV10BarcodPar = aP3[0];
      this.aP3 = aP3;
      pdye300.this.AV11RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pdye300.this.AV34RecipeNo = aP5[0];
      this.aP5 = aP5;
      pdye300.this.AV35Dyelot = aP6[0];
      this.aP6 = aP6;
      pdye300.this.AV36ReDye = aP7[0];
      this.aP7 = aP7;
      pdye300.this.AV40Ok30 = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40Ok30 = (byte)(0) ;
      /* Using cursor P058M2 */
      pr_default.execute(0, new Object[] {AV35Dyelot, Integer.valueOf(AV36ReDye)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12314ReDye = P058M2_A12314ReDye[0] ;
         A12313Dyelot = P058M2_A12313Dyelot[0] ;
         A12312ImportStat = P058M2_A12312ImportStat[0] ;
         A12312ImportStat = 30 ;
         AV12Control = httpContext.getMessage( "UPDATE tabla DEYLOTS ", "") + GXutil.trim( AV35Dyelot) + "-" + GXutil.str( AV36ReDye, 5, 0) ;
         System.out.println( AV12Control );
         AV40Ok30 = (byte)(1) ;
         /* Using cursor P058M3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A12312ImportStat), A12313Dyelot, Integer.valueOf(A12314ReDye)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdye300.this.AV17EmprCod;
      this.aP1[0] = pdye300.this.AV8Barcod;
      this.aP2[0] = pdye300.this.AV9BarcodReo;
      this.aP3[0] = pdye300.this.AV10BarcodPar;
      this.aP4[0] = pdye300.this.AV11RecLinMaq;
      this.aP5[0] = pdye300.this.AV34RecipeNo;
      this.aP6[0] = pdye300.this.AV35Dyelot;
      this.aP7[0] = pdye300.this.AV36ReDye;
      this.aP8[0] = pdye300.this.AV40Ok30;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdye300");
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
      P058M2_A12314ReDye = new int[1] ;
      P058M2_A12313Dyelot = new String[] {""} ;
      P058M2_A12312ImportStat = new int[1] ;
      A12313Dyelot = "" ;
      AV12Control = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdye300__default(),
         new Object[] {
             new Object[] {
            P058M2_A12314ReDye, P058M2_A12313Dyelot, P058M2_A12312ImportStat
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarcodReo ;
   private byte AV40Ok30 ;
   private short AV11RecLinMaq ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV36ReDye ;
   private int A12314ReDye ;
   private int A12312ImportStat ;
   private String AV17EmprCod ;
   private String AV10BarcodPar ;
   private String scmdbuf ;
   private String AV34RecipeNo ;
   private String AV35Dyelot ;
   private String A12313Dyelot ;
   private String AV12Control ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private int[] P058M2_A12314ReDye ;
   private String[] P058M2_A12313Dyelot ;
   private int[] P058M2_A12312ImportStat ;
}

final  class pdye300__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P058M2", "SELECT ReDye, Dyelot, ImportStat FROM TXPDYE001 WHERE Dyelot = ? and ReDye = ? ORDER BY Dyelot, ReDye ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P058M3", "UPDATE TXPDYE001 SET ImportStat=?  WHERE Dyelot = ? AND ReDye = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDYE001")
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setVarchar(1, (String)parms[0], 20);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

