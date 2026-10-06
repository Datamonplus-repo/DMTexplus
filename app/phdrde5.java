package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrde5 extends GXProcedure
{
   public phdrde5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrde5.class ), "" );
   }

   public phdrde5( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      phdrde5.this.aP1 = new int[] {0};
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
      phdrde5.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrde5.this.AV16SalExtAlb = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Flag = (byte)(0) ;
      GXt_int1 = AV18FirmaD ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      phdrde5.this.GXt_int1 = GXv_int2[0] ;
      AV18FirmaD = GXt_int1 ;
      /* Using cursor P02JP2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2253SalExtAlb = P02JP2_A2253SalExtAlb[0] ;
         A396EmprCod = P02JP2_A396EmprCod[0] ;
         A2256SalExtFec = P02JP2_A2256SalExtFec[0] ;
         A10080SalSts = P02JP2_A10080SalSts[0] ;
         /* Using cursor P02JP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P02JP3_A130BarCodPar[0] ;
            A132BarCodReo = P02JP3_A132BarCodReo[0] ;
            A129BarCod = P02JP3_A129BarCod[0] ;
            AV17Flag = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( AV17Flag == 0 ) && ( AV18FirmaD == 0 ) )
         {
            /* Using cursor P02JP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         }
         if ( ( AV17Flag == 0 ) && ( AV18FirmaD == 1 ) )
         {
            A10080SalSts = httpContext.getMessage( "A", "") ;
         }
         if ( ( AV17Flag == 1 ) && ( GXutil.strcmp(A10080SalSts, httpContext.getMessage( "A", "")) == 0 ) && ( AV18FirmaD == 1 ) )
         {
            A10080SalSts = " " ;
         }
         /* Using cursor P02JP5 */
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
      this.aP0[0] = phdrde5.this.AV15EmprCod;
      this.aP1[0] = phdrde5.this.AV16SalExtAlb;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrde5");
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
      P02JP2_A2253SalExtAlb = new int[1] ;
      P02JP2_A396EmprCod = new String[] {""} ;
      P02JP2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02JP2_A10080SalSts = new String[] {""} ;
      A396EmprCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10080SalSts = "" ;
      P02JP3_A396EmprCod = new String[] {""} ;
      P02JP3_A2253SalExtAlb = new int[1] ;
      P02JP3_A130BarCodPar = new String[] {""} ;
      P02JP3_A132BarCodReo = new byte[1] ;
      P02JP3_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrde5__default(),
         new Object[] {
             new Object[] {
            P02JP2_A2253SalExtAlb, P02JP2_A396EmprCod, P02JP2_A2256SalExtFec, P02JP2_A10080SalSts
            }
            , new Object[] {
            P02JP3_A396EmprCod, P02JP3_A2253SalExtAlb, P02JP3_A130BarCodPar, P02JP3_A132BarCodReo, P02JP3_A129BarCod
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
   private byte AV18FirmaD ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16SalExtAlb ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10080SalSts ;
   private String A130BarCodPar ;
   private java.util.Date A2256SalExtFec ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P02JP2_A2253SalExtAlb ;
   private String[] P02JP2_A396EmprCod ;
   private java.util.Date[] P02JP2_A2256SalExtFec ;
   private String[] P02JP2_A10080SalSts ;
   private String[] P02JP3_A396EmprCod ;
   private int[] P02JP3_A2253SalExtAlb ;
   private String[] P02JP3_A130BarCodPar ;
   private byte[] P02JP3_A132BarCodReo ;
   private int[] P02JP3_A129BarCod ;
}

final  class phdrde5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02JP2", "SELECT SalExtAlb, EmprCod, SalExtFec, SalSts FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JP3", "SELECT EmprCod, SalExtAlb, BarCodPar, BarCodReo, BarCod FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02JP4", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new UpdateCursor("P02JP5", "UPDATE TXPCEXTSA SET SalSts=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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

