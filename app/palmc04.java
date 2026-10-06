package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmc04 extends GXProcedure
{
   public palmc04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmc04.class ), "" );
   }

   public palmc04( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      palmc04.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      palmc04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palmc04.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      palmc04.this.A3358CCStkLen = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03EH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A3358CCStkLen)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3345TipMovCc = P03EH2_A3345TipMovCc[0] ;
         A3342CCStkLin = P03EH2_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EC", "")) == 0 )
         {
            /* Using cursor P03EH3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmc04.this.A396EmprCod;
      this.aP1[0] = palmc04.this.A719PrdNum;
      this.aP2[0] = palmc04.this.A3358CCStkLen;
      Application.commitDataStores(context, remoteHandle, pr_default, "palmc04");
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
      P03EH2_A396EmprCod = new String[] {""} ;
      P03EH2_A719PrdNum = new String[] {""} ;
      P03EH2_A3358CCStkLen = new short[1] ;
      P03EH2_A3345TipMovCc = new String[] {""} ;
      P03EH2_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmc04__default(),
         new Object[] {
             new Object[] {
            P03EH2_A396EmprCod, P03EH2_A719PrdNum, P03EH2_A3358CCStkLen, P03EH2_A3345TipMovCc, P03EH2_A3342CCStkLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A3358CCStkLen ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A3345TipMovCc ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03EH2_A396EmprCod ;
   private String[] P03EH2_A719PrdNum ;
   private short[] P03EH2_A3358CCStkLen ;
   private String[] P03EH2_A3345TipMovCc ;
   private long[] P03EH2_A3342CCStkLin ;
}

final  class palmc04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03EH2", "SELECT EmprCod, PrdNum, CCStkLen, TipMovCc, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLen = ? ORDER BY EmprCod, PrdNum, CCStkLen ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03EH3", "DELETE FROM TXPCCSTKS  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

