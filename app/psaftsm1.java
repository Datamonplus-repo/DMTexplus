package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psaftsm1 extends GXProcedure
{
   public psaftsm1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psaftsm1.class ), "" );
   }

   public psaftsm1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      psaftsm1.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      psaftsm1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psaftsm1.this.A323DevGenCod = aP1[0];
      this.aP1 = aP1;
      psaftsm1.this.AV16ALbLic = aP2[0];
      this.aP2 = aP2;
      psaftsm1.this.AV17AlbEnvFtp = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P041R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10736DevEnvAT = P041R2_A10736DevEnvAT[0] ;
         n10736DevEnvAT = P041R2_n10736DevEnvAT[0] ;
         A10737DevATCodeI = P041R2_A10737DevATCodeI[0] ;
         n10737DevATCodeI = P041R2_n10737DevATCodeI[0] ;
         A10766DevGenAT = P041R2_A10766DevGenAT[0] ;
         n10766DevGenAT = P041R2_n10766DevGenAT[0] ;
         A10736DevEnvAT = AV17AlbEnvFtp ;
         n10736DevEnvAT = false ;
         A10737DevATCodeI = AV16ALbLic ;
         n10737DevATCodeI = false ;
         A10766DevGenAT = httpContext.getMessage( "M", "") ;
         n10766DevGenAT = false ;
         /* Using cursor P041R3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n10736DevEnvAT), Byte.valueOf(A10736DevEnvAT), Boolean.valueOf(n10737DevATCodeI), A10737DevATCodeI, Boolean.valueOf(n10766DevGenAT), A10766DevGenAT, A396EmprCod, Integer.valueOf(A323DevGenCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psaftsm1.this.A396EmprCod;
      this.aP1[0] = psaftsm1.this.A323DevGenCod;
      this.aP2[0] = psaftsm1.this.AV16ALbLic;
      this.aP3[0] = psaftsm1.this.AV17AlbEnvFtp;
      Application.commitDataStores(context, remoteHandle, pr_default, "psaftsm1");
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
      P041R2_A396EmprCod = new String[] {""} ;
      P041R2_A323DevGenCod = new int[1] ;
      P041R2_A10736DevEnvAT = new byte[1] ;
      P041R2_n10736DevEnvAT = new boolean[] {false} ;
      P041R2_A10737DevATCodeI = new String[] {""} ;
      P041R2_n10737DevATCodeI = new boolean[] {false} ;
      P041R2_A10766DevGenAT = new String[] {""} ;
      P041R2_n10766DevGenAT = new boolean[] {false} ;
      A10737DevATCodeI = "" ;
      A10766DevGenAT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psaftsm1__default(),
         new Object[] {
             new Object[] {
            P041R2_A396EmprCod, P041R2_A323DevGenCod, P041R2_A10736DevEnvAT, P041R2_n10736DevEnvAT, P041R2_A10737DevATCodeI, P041R2_n10737DevATCodeI, P041R2_A10766DevGenAT, P041R2_n10766DevGenAT
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17AlbEnvFtp ;
   private byte A10736DevEnvAT ;
   private short Gx_err ;
   private int A323DevGenCod ;
   private String A396EmprCod ;
   private String AV16ALbLic ;
   private String scmdbuf ;
   private String A10737DevATCodeI ;
   private String A10766DevGenAT ;
   private boolean n10736DevEnvAT ;
   private boolean n10737DevATCodeI ;
   private boolean n10766DevGenAT ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P041R2_A396EmprCod ;
   private int[] P041R2_A323DevGenCod ;
   private byte[] P041R2_A10736DevEnvAT ;
   private boolean[] P041R2_n10736DevEnvAT ;
   private String[] P041R2_A10737DevATCodeI ;
   private boolean[] P041R2_n10737DevATCodeI ;
   private String[] P041R2_A10766DevGenAT ;
   private boolean[] P041R2_n10766DevGenAT ;
}

final  class psaftsm1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P041R2", "SELECT EmprCod, DevGenCod, DevEnvAT, DevATCodeI, DevGenAT FROM TXPDEVGEN WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P041R3", "UPDATE TXPDEVGEN SET DevEnvAT=?, DevATCodeI=?, DevGenAT=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVGEN")
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
      }
   }

}

