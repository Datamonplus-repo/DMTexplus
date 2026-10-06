package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pasipda3 extends GXProcedure
{
   public pasipda3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pasipda3.class ), "" );
   }

   public pasipda3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pasipda3.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pasipda3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pasipda3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pasipda3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pasipda3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pasipda3.this.AV12BarMacCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13OK = httpContext.getMessage( "N", "") ;
      /* Using cursor P02DS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3595BarMacCod = P02DS2_A3595BarMacCod[0] ;
         A3595BarMacCod = AV12BarMacCod ;
         AV13OK = httpContext.getMessage( "S", "") ;
         /* Using cursor P02DS3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A3595BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char5[0] = "" ;
         GXv_char6[0] = "" ;
         GXv_char7[0] = httpContext.getMessage( "ASP", "") ;
         new app.pvxgrain(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
         pasipda3.this.A396EmprCod = GXv_char1[0] ;
         pasipda3.this.A129BarCod = GXv_int2[0] ;
         pasipda3.this.A132BarCodReo = GXv_int3[0] ;
         pasipda3.this.A130BarCodPar = GXv_char4[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pasipda3.this.A396EmprCod;
      this.aP1[0] = pasipda3.this.A129BarCod;
      this.aP2[0] = pasipda3.this.A132BarCodReo;
      this.aP3[0] = pasipda3.this.A130BarCodPar;
      this.aP4[0] = pasipda3.this.AV12BarMacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pasipda3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13OK = "" ;
      scmdbuf = "" ;
      P02DS2_A396EmprCod = new String[] {""} ;
      P02DS2_A129BarCod = new int[1] ;
      P02DS2_A132BarCodReo = new byte[1] ;
      P02DS2_A130BarCodPar = new String[] {""} ;
      P02DS2_A3595BarMacCod = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pasipda3__default(),
         new Object[] {
             new Object[] {
            P02DS2_A396EmprCod, P02DS2_A129BarCod, P02DS2_A132BarCodReo, P02DS2_A130BarCodPar, P02DS2_A3595BarMacCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12BarMacCod ;
   private int A3595BarMacCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV13OK ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DS2_A396EmprCod ;
   private int[] P02DS2_A129BarCod ;
   private byte[] P02DS2_A132BarCodReo ;
   private String[] P02DS2_A130BarCodPar ;
   private int[] P02DS2_A3595BarMacCod ;
}

final  class pasipda3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DS2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMacCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02DS3", "UPDATE TXPBARCAD SET BarMacCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

