package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdye301 extends GXProcedure
{
   public pdye301( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdye301.class ), "" );
   }

   public pdye301( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 )
   {
      pdye301.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      pdye301.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      pdye301.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pdye301.this.AV9BarcodReo = aP2[0];
      this.aP2 = aP2;
      pdye301.this.AV10BarcodPar = aP3[0];
      this.aP3 = aP3;
      pdye301.this.AV11RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pdye301.this.AV34RecipeNo = aP5[0];
      this.aP5 = aP5;
      pdye301.this.AV35Dyelot = aP6[0];
      this.aP6 = aP6;
      pdye301.this.AV36ReDye = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P058N2 */
      pr_default.execute(0, new Object[] {AV34RecipeNo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12324RecipeNo = P058N2_A12324RecipeNo[0] ;
         /* Using cursor P058N3 */
         pr_default.execute(1, new Object[] {A12324RecipeNo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE004");
         AV12Control = httpContext.getMessage( "DEL tabla RECIPES ", "") + GXutil.trim( AV34RecipeNo) ;
         System.out.println( AV12Control );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P058N4 */
      pr_default.execute(2, new Object[] {AV35Dyelot, Integer.valueOf(AV36ReDye)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A12314ReDye = P058N4_A12314ReDye[0] ;
         A12313Dyelot = P058N4_A12313Dyelot[0] ;
         /* Using cursor P058N5 */
         pr_default.execute(3, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE001");
         AV12Control = httpContext.getMessage( "DEL tabla DEYLOTS ", "") + GXutil.trim( AV35Dyelot) + "-" + GXutil.str( AV36ReDye, 5, 0) ;
         System.out.println( AV12Control );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P058N6 */
      pr_default.execute(4, new Object[] {AV35Dyelot, Integer.valueOf(AV36ReDye)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A12314ReDye = P058N6_A12314ReDye[0] ;
         A12313Dyelot = P058N6_A12313Dyelot[0] ;
         A12320Correction = P058N6_A12320Correction[0] ;
         A12321CallOff = P058N6_A12321CallOff[0] ;
         A12322Counter = P058N6_A12322Counter[0] ;
         /* Using cursor P058N7 */
         pr_default.execute(5, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE002");
         AV12Control = httpContext.getMessage( "DEL tabla DEYLOTS ", "") + GXutil.trim( AV35Dyelot) + "-" + GXutil.str( AV36ReDye, 5, 0) ;
         System.out.println( AV12Control );
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P058N8 */
      pr_default.execute(6, new Object[] {AV35Dyelot, Integer.valueOf(AV36ReDye)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A12314ReDye = P058N8_A12314ReDye[0] ;
         A12313Dyelot = P058N8_A12313Dyelot[0] ;
         A12325TreatmentC = P058N8_A12325TreatmentC[0] ;
         /* Using cursor P058N9 */
         pr_default.execute(7, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12325TreatmentC)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE003");
         AV12Control = httpContext.getMessage( "DEL tabla DEYLOTS ", "") + GXutil.trim( AV35Dyelot) + "-" + GXutil.str( AV36ReDye, 5, 0) ;
         System.out.println( AV12Control );
         pr_default.readNext(6);
      }
      pr_default.close(6);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdye301.this.AV17EmprCod;
      this.aP1[0] = pdye301.this.AV8Barcod;
      this.aP2[0] = pdye301.this.AV9BarcodReo;
      this.aP3[0] = pdye301.this.AV10BarcodPar;
      this.aP4[0] = pdye301.this.AV11RecLinMaq;
      this.aP5[0] = pdye301.this.AV34RecipeNo;
      this.aP6[0] = pdye301.this.AV35Dyelot;
      this.aP7[0] = pdye301.this.AV36ReDye;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdye301");
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
      P058N2_A12324RecipeNo = new String[] {""} ;
      A12324RecipeNo = "" ;
      AV12Control = "" ;
      P058N4_A12314ReDye = new int[1] ;
      P058N4_A12313Dyelot = new String[] {""} ;
      A12313Dyelot = "" ;
      P058N6_A12314ReDye = new int[1] ;
      P058N6_A12313Dyelot = new String[] {""} ;
      P058N6_A12320Correction = new int[1] ;
      P058N6_A12321CallOff = new int[1] ;
      P058N6_A12322Counter = new int[1] ;
      P058N8_A12314ReDye = new int[1] ;
      P058N8_A12313Dyelot = new String[] {""} ;
      P058N8_A12325TreatmentC = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdye301__default(),
         new Object[] {
             new Object[] {
            P058N2_A12324RecipeNo
            }
            , new Object[] {
            }
            , new Object[] {
            P058N4_A12314ReDye, P058N4_A12313Dyelot
            }
            , new Object[] {
            }
            , new Object[] {
            P058N6_A12314ReDye, P058N6_A12313Dyelot, P058N6_A12320Correction, P058N6_A12321CallOff, P058N6_A12322Counter
            }
            , new Object[] {
            }
            , new Object[] {
            P058N8_A12314ReDye, P058N8_A12313Dyelot, P058N8_A12325TreatmentC
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarcodReo ;
   private short AV11RecLinMaq ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV36ReDye ;
   private int A12314ReDye ;
   private int A12320Correction ;
   private int A12321CallOff ;
   private int A12322Counter ;
   private int A12325TreatmentC ;
   private String AV17EmprCod ;
   private String AV10BarcodPar ;
   private String scmdbuf ;
   private String AV34RecipeNo ;
   private String AV35Dyelot ;
   private String A12324RecipeNo ;
   private String AV12Control ;
   private String A12313Dyelot ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P058N2_A12324RecipeNo ;
   private int[] P058N4_A12314ReDye ;
   private String[] P058N4_A12313Dyelot ;
   private int[] P058N6_A12314ReDye ;
   private String[] P058N6_A12313Dyelot ;
   private int[] P058N6_A12320Correction ;
   private int[] P058N6_A12321CallOff ;
   private int[] P058N6_A12322Counter ;
   private int[] P058N8_A12314ReDye ;
   private String[] P058N8_A12313Dyelot ;
   private int[] P058N8_A12325TreatmentC ;
}

final  class pdye301__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P058N2", "SELECT RecipeNo FROM TXPDYE004 WHERE RecipeNo = ? ORDER BY RecipeNo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P058N3", "DELETE FROM TXPDYE004  WHERE RecipeNo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDYE004")
         ,new ForEachCursor("P058N4", "SELECT ReDye, Dyelot FROM TXPDYE001 WHERE Dyelot = ? and ReDye = ? ORDER BY Dyelot, ReDye ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P058N5", "DELETE FROM TXPDYE001  WHERE Dyelot = ? AND ReDye = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDYE001")
         ,new ForEachCursor("P058N6", "SELECT ReDye, Dyelot, Correction, CallOff, Counter FROM TXPDYE002 WHERE Dyelot = ? and ReDye = ? ORDER BY Dyelot, ReDye ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P058N7", "DELETE FROM TXPDYE002  WHERE Dyelot = ? AND ReDye = ? AND Correction = ? AND CallOff = ? AND Counter = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDYE002")
         ,new ForEachCursor("P058N8", "SELECT ReDye, Dyelot, TreatmentC FROM TXPDYE003 WHERE Dyelot = ? and ReDye = ? ORDER BY Dyelot, ReDye ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P058N9", "DELETE FROM TXPDYE003  WHERE Dyelot = ? AND ReDye = ? AND TreatmentC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDYE003")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 6 :
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
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 20);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

