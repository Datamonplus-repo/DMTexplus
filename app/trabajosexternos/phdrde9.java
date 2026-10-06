package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrde9 extends GXProcedure
{
   public phdrde9( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrde9.class ), "" );
   }

   public phdrde9( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      phdrde9.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      phdrde9.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrde9.this.AV16SalExtAlb = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Flag = (byte)(0) ;
      GXt_int1 = AV18Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      phdrde9.this.GXt_int1 = GXv_int2[0] ;
      AV18Firmad = GXt_int1 ;
      /* Using cursor P050P2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2253SalExtAlb = P050P2_A2253SalExtAlb[0] ;
         A396EmprCod = P050P2_A396EmprCod[0] ;
         A2256SalExtFec = P050P2_A2256SalExtFec[0] ;
         A10080SalSts = P050P2_A10080SalSts[0] ;
         /* Using cursor P050P3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A8654ObsM = P050P3_A8654ObsM[0] ;
            n8654ObsM = P050P3_n8654ObsM[0] ;
            A6248SalExNln = P050P3_A6248SalExNln[0] ;
            AV17Flag = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( AV17Flag == 0 ) && ( AV18Firmad == 0 ) )
         {
            /* Using cursor P050P4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         }
         A10080SalSts = ((AV17Flag==1) ? " " : ((AV17Flag==0)&&(AV18Firmad==1) ? " " : " ")) ;
         /* Using cursor P050P5 */
         pr_default.execute(3, new Object[] {A10080SalSts, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrde9.this.AV15EmprCod;
      this.aP1[0] = phdrde9.this.AV16SalExtAlb;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.phdrde9");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P050P2_A2253SalExtAlb = new int[1] ;
      P050P2_A396EmprCod = new String[] {""} ;
      P050P2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P050P2_A10080SalSts = new String[] {""} ;
      A396EmprCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10080SalSts = "" ;
      P050P3_A396EmprCod = new String[] {""} ;
      P050P3_A2253SalExtAlb = new int[1] ;
      P050P3_A8654ObsM = new String[] {""} ;
      P050P3_n8654ObsM = new boolean[] {false} ;
      P050P3_A6248SalExNln = new short[1] ;
      A8654ObsM = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.phdrde9__default(),
         new Object[] {
             new Object[] {
            P050P2_A2253SalExtAlb, P050P2_A396EmprCod, P050P2_A2256SalExtFec, P050P2_A10080SalSts
            }
            , new Object[] {
            P050P3_A396EmprCod, P050P3_A2253SalExtAlb, P050P3_A8654ObsM, P050P3_n8654ObsM, P050P3_A6248SalExNln
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Flag ;
   private byte AV18Firmad ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int AV16SalExtAlb ;
   private int A2253SalExtAlb ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10080SalSts ;
   private java.util.Date A2256SalExtFec ;
   private boolean n8654ObsM ;
   private String A8654ObsM ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P050P2_A2253SalExtAlb ;
   private String[] P050P2_A396EmprCod ;
   private java.util.Date[] P050P2_A2256SalExtFec ;
   private String[] P050P2_A10080SalSts ;
   private String[] P050P3_A396EmprCod ;
   private int[] P050P3_A2253SalExtAlb ;
   private String[] P050P3_A8654ObsM ;
   private boolean[] P050P3_n8654ObsM ;
   private short[] P050P3_A6248SalExNln ;
}

final  class phdrde9__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P050P2", "SELECT SalExtAlb, EmprCod, SalExtFec, SalSts FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P050P3", "SELECT EmprCod, SalExtAlb, ObsM, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P050P4", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new UpdateCursor("P050P5", "UPDATE TXPCEXTSA SET SalSts=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

