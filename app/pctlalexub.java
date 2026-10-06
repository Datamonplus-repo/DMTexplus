package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctlalexub extends GXProcedure
{
   public pctlalexub( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctlalexub.class ), "" );
   }

   public pctlalexub( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            int[] aP3 ,
                            String[] aP4 )
   {
      pctlalexub.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pctlalexub.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctlalexub.this.A2333ExtPdoAlb = aP1[0];
      this.aP1 = aP1;
      pctlalexub.this.A966PartCod = aP2[0];
      this.aP2 = aP2;
      pctlalexub.this.A252CliCod = aP3[0];
      this.aP3 = aP3;
      pctlalexub.this.AV9ExtPdoLoc = aP4[0];
      this.aP4 = aP4;
      pctlalexub.this.AV8ExisLoc = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ExisLoc = (short)(0) ;
      /* Using cursor P00TE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A2333ExtPdoAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2360ExtPdoLoc = P00TE2_A2360ExtPdoLoc[0] ;
         n2360ExtPdoLoc = P00TE2_n2360ExtPdoLoc[0] ;
         A2790ExtPdoLin = P00TE2_A2790ExtPdoLin[0] ;
         if ( GXutil.strcmp(AV9ExtPdoLoc, A2360ExtPdoLoc) == 0 )
         {
            AV8ExisLoc = A2790ExtPdoLin ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctlalexub.this.A396EmprCod;
      this.aP1[0] = pctlalexub.this.A2333ExtPdoAlb;
      this.aP2[0] = pctlalexub.this.A966PartCod;
      this.aP3[0] = pctlalexub.this.A252CliCod;
      this.aP4[0] = pctlalexub.this.AV9ExtPdoLoc;
      this.aP5[0] = pctlalexub.this.AV8ExisLoc;
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
      P00TE2_A396EmprCod = new String[] {""} ;
      P00TE2_A2333ExtPdoAlb = new int[1] ;
      P00TE2_A966PartCod = new String[] {""} ;
      P00TE2_n966PartCod = new boolean[] {false} ;
      P00TE2_A252CliCod = new int[1] ;
      P00TE2_n252CliCod = new boolean[] {false} ;
      P00TE2_A2360ExtPdoLoc = new String[] {""} ;
      P00TE2_n2360ExtPdoLoc = new boolean[] {false} ;
      P00TE2_A2790ExtPdoLin = new short[1] ;
      A2360ExtPdoLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctlalexub__default(),
         new Object[] {
             new Object[] {
            P00TE2_A396EmprCod, P00TE2_A2333ExtPdoAlb, P00TE2_A966PartCod, P00TE2_n966PartCod, P00TE2_A252CliCod, P00TE2_n252CliCod, P00TE2_A2360ExtPdoLoc, P00TE2_n2360ExtPdoLoc, P00TE2_A2790ExtPdoLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8ExisLoc ;
   private short A2790ExtPdoLin ;
   private short Gx_err ;
   private int A2333ExtPdoAlb ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV9ExtPdoLoc ;
   private String scmdbuf ;
   private String A2360ExtPdoLoc ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n2360ExtPdoLoc ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00TE2_A396EmprCod ;
   private int[] P00TE2_A2333ExtPdoAlb ;
   private String[] P00TE2_A966PartCod ;
   private boolean[] P00TE2_n966PartCod ;
   private int[] P00TE2_A252CliCod ;
   private boolean[] P00TE2_n252CliCod ;
   private String[] P00TE2_A2360ExtPdoLoc ;
   private boolean[] P00TE2_n2360ExtPdoLoc ;
   private short[] P00TE2_A2790ExtPdoLin ;
}

final  class pctlalexub__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TE2", "SELECT EmprCod, ExtPdoAlb, PartCod, CliCod, ExtPdoLoc, ExtPdoLin FROM TXPLEXTPD WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (ExtPdoAlb = ?) ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
      }
   }

}

