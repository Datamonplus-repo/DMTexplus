package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelate extends GXProcedure
{
   public pdelate( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelate.class ), "" );
   }

   public pdelate( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      pdelate.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             byte[] aP2 )
   {
      pdelate.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelate.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pdelate.this.AV15Tipo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV17HueAlb ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HUEALB", ""), GXv_int1) ;
      pdelate.this.AV17HueAlb = GXv_int1[0] ;
      /* Using cursor P01912 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A39AlbProPri = P01912_A39AlbProPri[0] ;
         /* Using cursor P01913 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1265BarAlbPie = P01913_A1265BarAlbPie[0] ;
            A129BarCod = P01913_A129BarCod[0] ;
            A132BarCodReo = P01913_A132BarCodReo[0] ;
            A130BarCodPar = P01913_A130BarCodPar[0] ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A30AlbProCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_int6[0] = AV15Tipo ;
            new app.pelihte(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_int1, GXv_char5, GXv_int6) ;
            pdelate.this.A396EmprCod = GXv_char2[0] ;
            pdelate.this.A30AlbProCod = GXv_int3[0] ;
            pdelate.this.A129BarCod = GXv_int4[0] ;
            pdelate.this.A132BarCodReo = GXv_int1[0] ;
            pdelate.this.A130BarCodPar = GXv_char5[0] ;
            pdelate.this.AV15Tipo = GXv_int6[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized DELETE. */
         /* Using cursor P01914 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01915 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         /* End optimized DELETE. */
         if ( AV17HueAlb == 1 )
         {
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV16ContCod = "555555" ;
            }
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV16ContCod = "666666" ;
            }
            /* Using cursor P01916 */
            pr_default.execute(4, new Object[] {A396EmprCod, AV16ContCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A313ContCod = P01916_A313ContCod[0] ;
               A316ContVal = P01916_A316ContVal[0] ;
               A316ContVal = (int)(A30AlbProCod-1) ;
               /* Using cursor P01917 */
               pr_default.execute(5, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
         }
         /* Using cursor P01918 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelate.this.A396EmprCod;
      this.aP1[0] = pdelate.this.A30AlbProCod;
      this.aP2[0] = pdelate.this.AV15Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelate");
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
      P01912_A396EmprCod = new String[] {""} ;
      P01912_A30AlbProCod = new long[1] ;
      P01912_A39AlbProPri = new String[] {""} ;
      A39AlbProPri = "" ;
      P01913_A396EmprCod = new String[] {""} ;
      P01913_A30AlbProCod = new long[1] ;
      P01913_A1265BarAlbPie = new int[1] ;
      P01913_A129BarCod = new int[1] ;
      P01913_A132BarCodReo = new byte[1] ;
      P01913_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV16ContCod = "" ;
      P01916_A396EmprCod = new String[] {""} ;
      P01916_A313ContCod = new String[] {""} ;
      P01916_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelate__default(),
         new Object[] {
             new Object[] {
            P01912_A396EmprCod, P01912_A30AlbProCod, P01912_A39AlbProPri
            }
            , new Object[] {
            P01913_A396EmprCod, P01913_A30AlbProCod, P01913_A1265BarAlbPie, P01913_A129BarCod, P01913_A132BarCodReo, P01913_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01916_A396EmprCod, P01916_A313ContCod, P01916_A316ContVal
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

   private byte AV15Tipo ;
   private byte AV17HueAlb ;
   private byte A132BarCodReo ;
   private byte GXv_int1[] ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private int A316ContVal ;
   private long A30AlbProCod ;
   private long GXv_int3[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A130BarCodPar ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String AV16ContCod ;
   private String A313ContCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01912_A396EmprCod ;
   private long[] P01912_A30AlbProCod ;
   private String[] P01912_A39AlbProPri ;
   private String[] P01913_A396EmprCod ;
   private long[] P01913_A30AlbProCod ;
   private int[] P01913_A1265BarAlbPie ;
   private int[] P01913_A129BarCod ;
   private byte[] P01913_A132BarCodReo ;
   private String[] P01913_A130BarCodPar ;
   private String[] P01916_A396EmprCod ;
   private String[] P01916_A313ContCod ;
   private int[] P01916_A316ContVal ;
}

final  class pdelate__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01912", "SELECT EmprCod, AlbProCod, AlbProPri FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01913", "SELECT EmprCod, AlbProCod, BarAlbPie, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01914", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P01915", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P01916", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01917", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new UpdateCursor("P01918", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

