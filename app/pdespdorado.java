package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdespdorado extends GXProcedure
{
   public pdespdorado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdespdorado.class ), "" );
   }

   public pdespdorado( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pdespdorado.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pdespdorado.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdespdorado.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pdespdorado.this.AV11usurcod = aP2[0];
      this.aP2 = aP2;
      pdespdorado.this.AV12Station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Numl = (byte)(0) ;
      AV9numlre = (byte)(0) ;
      /* Using cursor P04S22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P04S22_A129BarCod[0] ;
         A132BarCodReo = P04S22_A132BarCodReo[0] ;
         A130BarCodPar = P04S22_A130BarCodPar[0] ;
         A148BarEstReo = P04S22_A148BarEstReo[0] ;
         A148BarEstReo = P04S22_A148BarEstReo[0] ;
         if ( A148BarEstReo == 2 )
         {
            AV9numlre = (byte)(AV9numlre+1) ;
         }
         AV8Numl = (byte)(AV8Numl+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( AV8Numl > 0 ) && ( AV8Numl == AV9numlre ) )
      {
         /* Using cursor P04S23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A33AlbProEst = P04S23_A33AlbProEst[0] ;
            A1782AlbProEso = P04S23_A1782AlbProEso[0] ;
            AV10inc_obs = httpContext.getMessage( "Hdrs Rep Externo", "") + GXutil.newLine( ) ;
            AV10inc_obs += httpContext.getMessage( "Se deja Despacho como FACTURADO", "") + GXutil.newLine( ) ;
            AV10inc_obs += httpContext.getMessage( "Estado = ", "") + GXutil.str( A33AlbProEst, 1, 0) + " <- " + "2" ;
            A1782AlbProEso = (byte)(2) ;
            A33AlbProEst = (byte)(2) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV17Pgmname, AV11usurcod, AV12Station, AV10inc_obs, (int)(A30AlbProCod), (byte)(0), " ") ;
            /* Using cursor P04S24 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdespdorado.this.A396EmprCod;
      this.aP1[0] = pdespdorado.this.A30AlbProCod;
      this.aP2[0] = pdespdorado.this.AV11usurcod;
      this.aP3[0] = pdespdorado.this.AV12Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdespdorado");
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
      P04S22_A129BarCod = new int[1] ;
      P04S22_A132BarCodReo = new byte[1] ;
      P04S22_A130BarCodPar = new String[] {""} ;
      P04S22_A396EmprCod = new String[] {""} ;
      P04S22_A30AlbProCod = new long[1] ;
      P04S22_A148BarEstReo = new byte[1] ;
      A130BarCodPar = "" ;
      P04S23_A396EmprCod = new String[] {""} ;
      P04S23_A30AlbProCod = new long[1] ;
      P04S23_A33AlbProEst = new byte[1] ;
      P04S23_A1782AlbProEso = new byte[1] ;
      AV10inc_obs = "" ;
      AV17Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdespdorado__default(),
         new Object[] {
             new Object[] {
            P04S22_A129BarCod, P04S22_A132BarCodReo, P04S22_A130BarCodPar, P04S22_A396EmprCod, P04S22_A30AlbProCod, P04S22_A148BarEstReo
            }
            , new Object[] {
            P04S23_A396EmprCod, P04S23_A30AlbProCod, P04S23_A33AlbProEst, P04S23_A1782AlbProEso
            }
            , new Object[] {
            }
         }
      );
      AV17Pgmname = "PDespDorado" ;
      /* GeneXus formulas. */
      AV17Pgmname = "PDespDorado" ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Numl ;
   private byte AV9numlre ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV11usurcod ;
   private String AV12Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV17Pgmname ;
   private String AV10inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P04S22_A129BarCod ;
   private byte[] P04S22_A132BarCodReo ;
   private String[] P04S22_A130BarCodPar ;
   private String[] P04S22_A396EmprCod ;
   private long[] P04S22_A30AlbProCod ;
   private byte[] P04S22_A148BarEstReo ;
   private String[] P04S23_A396EmprCod ;
   private long[] P04S23_A30AlbProCod ;
   private byte[] P04S23_A33AlbProEst ;
   private byte[] P04S23_A1782AlbProEso ;
}

final  class pdespdorado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04S22", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.AlbProCod, T2.BarEstReo FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04S23", "SELECT EmprCod, AlbProCod, AlbProEst, AlbProEso FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04S24", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

