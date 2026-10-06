package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenfas4 extends GXProcedure
{
   public prenfas4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenfas4.class ), "" );
   }

   public prenfas4( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      prenfas4.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      prenfas4.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      prenfas4.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      prenfas4.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      prenfas4.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      prenfas4.this.AV39ExisParFas = aP4[0];
      this.aP4 = aP4;
      prenfas4.this.AV67FasMin = aP5[0];
      this.aP5 = aP5;
      prenfas4.this.AV39ExisParFas = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV39ExisParFas, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Using cursor P03X32 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P03X32_A130BarCodPar[0] ;
            A132BarCodReo = P03X32_A132BarCodReo[0] ;
            A129BarCod = P03X32_A129BarCod[0] ;
            A396EmprCod = P03X32_A396EmprCod[0] ;
            if ( GXutil.strcmp(A396EmprCod, httpContext.getMessage( "XYZ", "")) == 0 )
            {
               /* Using cursor P03X33 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      System.out.println( "" );
      if ( AV67FasMin == 1 )
      {
         GXv_char1[0] = AV15EmprCod ;
         GXv_int2[0] = AV16BarCod ;
         GXv_int3[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         new app.pminagf(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
         prenfas4.this.AV15EmprCod = GXv_char1[0] ;
         prenfas4.this.AV16BarCod = GXv_int2[0] ;
         prenfas4.this.AV17BarCodReo = GXv_int3[0] ;
         prenfas4.this.AV18BarCodPar = GXv_char4[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenfas4.this.AV15EmprCod;
      this.aP1[0] = prenfas4.this.AV16BarCod;
      this.aP2[0] = prenfas4.this.AV17BarCodReo;
      this.aP3[0] = prenfas4.this.AV18BarCodPar;
      this.aP4[0] = prenfas4.this.AV39ExisParFas;
      this.aP5[0] = prenfas4.this.AV67FasMin;
      this.aP6[0] = prenfas4.this.AV39ExisParFas;
      Application.commitDataStores(context, remoteHandle, pr_default, "prenfas4");
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
      P03X32_A130BarCodPar = new String[] {""} ;
      P03X32_A132BarCodReo = new byte[1] ;
      P03X32_A129BarCod = new int[1] ;
      P03X32_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenfas4__default(),
         new Object[] {
             new Object[] {
            P03X32_A130BarCodPar, P03X32_A132BarCodReo, P03X32_A129BarCod, P03X32_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV67FasMin ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV39ExisParFas ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03X32_A130BarCodPar ;
   private byte[] P03X32_A132BarCodReo ;
   private int[] P03X32_A129BarCod ;
   private String[] P03X32_A396EmprCod ;
}

final  class prenfas4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03X32", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPBARCAD WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03X33", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

