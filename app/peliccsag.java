package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliccsag extends GXProcedure
{
   public peliccsag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliccsag.class ), "" );
   }

   public peliccsag( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 )
   {
      peliccsag.this.A396EmprCod = aP0;
      peliccsag.this.A719PrdNum = aP1;
      peliccsag.this.A3353CCStkPed = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03DG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A3353CCStkPed)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3357CCStkDsc = P03DG2_A3357CCStkDsc[0] ;
         A3345TipMovCc = P03DG2_A3345TipMovCc[0] ;
         A3342CCStkLin = P03DG2_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            if ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,TCONMAC", "")) == 0 )
            {
               /* Using cursor P03DG3 */
               pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "peliccsag");
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
      P03DG2_A396EmprCod = new String[] {""} ;
      P03DG2_A719PrdNum = new String[] {""} ;
      P03DG2_A3353CCStkPed = new int[1] ;
      P03DG2_A3357CCStkDsc = new String[] {""} ;
      P03DG2_A3345TipMovCc = new String[] {""} ;
      P03DG2_A3342CCStkLin = new long[1] ;
      A3357CCStkDsc = "" ;
      A3345TipMovCc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliccsag__default(),
         new Object[] {
             new Object[] {
            P03DG2_A396EmprCod, P03DG2_A719PrdNum, P03DG2_A3353CCStkPed, P03DG2_A3357CCStkDsc, P03DG2_A3345TipMovCc, P03DG2_A3342CCStkLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A3353CCStkPed ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A3357CCStkDsc ;
   private String A3345TipMovCc ;
   private IDataStoreProvider pr_default ;
   private String[] P03DG2_A396EmprCod ;
   private String[] P03DG2_A719PrdNum ;
   private int[] P03DG2_A3353CCStkPed ;
   private String[] P03DG2_A3357CCStkDsc ;
   private String[] P03DG2_A3345TipMovCc ;
   private long[] P03DG2_A3342CCStkLin ;
}

final  class peliccsag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DG2", "SELECT EmprCod, PrdNum, CCStkPed, CCStkDsc, TipMovCc, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkPed = ? ORDER BY EmprCod, PrdNum, CCStkPed ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03DG3", "DELETE FROM TXPCCSTKS  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

