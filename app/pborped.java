package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pborped extends GXProcedure
{
   public pborped( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pborped.class ), "" );
   }

   public pborped( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            java.util.Date[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pborped.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pborped.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pborped.this.AV15FecBor = aP1[0];
      this.aP1 = aP1;
      pborped.this.AV16Tipo = aP2[0];
      this.aP2 = aP2;
      pborped.this.AV17UsurCod = aP3[0];
      this.aP3 = aP3;
      pborped.this.AV18Station = aP4[0];
      this.aP4 = aP4;
      pborped.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Lineas = (short)(0) ;
      AV21Npedidos = (short)(0) ;
      /* Using cursor P001J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15FecBor, Byte.valueOf(AV16Tipo), Byte.valueOf(AV16Tipo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P001J2_A658PedCod[0] ;
         A667PedSit = P001J2_A667PedSit[0] ;
         A661PedFec = P001J2_A661PedFec[0] ;
         if ( (( GXutil.resetTime(A661PedFec).before( GXutil.resetTime( AV15FecBor )) ) || ( GXutil.dateCompare(GXutil.resetTime(A661PedFec), GXutil.resetTime(AV15FecBor)) )) )
         {
            if ( ( ( GXutil.strcmp(A667PedSit, "S") == 0 ) && ( AV16Tipo == 6 ) ) || ( ( GXutil.strcmp(A667PedSit, "N") == 0 ) && ( AV16Tipo == 7 ) ) )
            {
               AV19Lineas = (short)(0) ;
               /* Using cursor P001J3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), A396EmprCod, Integer.valueOf(A658PedCod)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A719PrdNum = P001J3_A719PrdNum[0] ;
                  A659PedCum = P001J3_A659PedCum[0] ;
                  A669PedUni = P001J3_A669PedUni[0] ;
                  A657PedCanEnt = P001J3_A657PedCanEnt[0] ;
                  /* Using cursor P001J4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
                  A684PrdCanPen = P001J4_A684PrdCanPen[0] ;
                  if ( GXutil.strcmp(A667PedSit, httpContext.getMessage( "N", "")) == 0 )
                  {
                     if ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", "")) == 0 )
                     {
                        if ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 )
                        {
                           A684PrdCanPen = A684PrdCanPen.subtract((A669PedUni.subtract(A657PedCanEnt))) ;
                        }
                     }
                  }
                  /* Using cursor P001J5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
                  AV19Lineas = (short)(AV19Lineas+1) ;
                  /* Using cursor P001J6 */
                  pr_default.execute(4, new Object[] {A684PrdCanPen, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               pr_default.close(2);
               /* Using cursor P001J7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
               AV21Npedidos = (short)(AV21Npedidos+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV21Npedidos > 0 )
      {
         AV20Inc_obs = httpContext.getMessage( "Eliminacion Tablas Pedidos: CPEDID,LPEDID", "") + GXutil.newLine( ) ;
         AV20Inc_obs += httpContext.getMessage( "Pedidos CPEDID, ", "") + GXutil.trim( GXutil.str( AV21Npedidos, 4, 0)) + GXutil.newLine( ) ;
         AV20Inc_obs += httpContext.getMessage( "Lineas LPEDID, ", "") + GXutil.trim( GXutil.str( AV19Lineas, 4, 0)) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV26Pgmname, AV17UsurCod, AV18Station, AV20Inc_obs, 111111, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pborped.this.A396EmprCod;
      this.aP1[0] = pborped.this.AV15FecBor;
      this.aP2[0] = pborped.this.AV16Tipo;
      this.aP3[0] = pborped.this.AV17UsurCod;
      this.aP4[0] = pborped.this.AV18Station;
      this.aP5[0] = pborped.this.AV21Npedidos;
      Application.commitDataStores(context, remoteHandle, pr_default, "pborped");
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
      P001J2_A396EmprCod = new String[] {""} ;
      P001J2_A658PedCod = new int[1] ;
      P001J2_A667PedSit = new String[] {""} ;
      P001J2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      A667PedSit = "" ;
      A661PedFec = GXutil.nullDate() ;
      P001J3_A719PrdNum = new String[] {""} ;
      P001J3_A396EmprCod = new String[] {""} ;
      P001J3_A658PedCod = new int[1] ;
      P001J3_A659PedCum = new String[] {""} ;
      P001J3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001J3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A659PedCum = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      P001J4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      AV20Inc_obs = "" ;
      AV26Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pborped__default(),
         new Object[] {
             new Object[] {
            P001J2_A396EmprCod, P001J2_A658PedCod, P001J2_A667PedSit, P001J2_A661PedFec
            }
            , new Object[] {
            P001J3_A719PrdNum, P001J3_A396EmprCod, P001J3_A658PedCod, P001J3_A659PedCum, P001J3_A669PedUni, P001J3_A657PedCanEnt
            }
            , new Object[] {
            P001J4_A684PrdCanPen
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV26Pgmname = "PBORPED" ;
      /* GeneXus formulas. */
      AV26Pgmname = "PBORPED" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16Tipo ;
   private short AV21Npedidos ;
   private short AV19Lineas ;
   private short Gx_err ;
   private int A658PedCod ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A684PrdCanPen ;
   private String A396EmprCod ;
   private String AV17UsurCod ;
   private String AV18Station ;
   private String scmdbuf ;
   private String A667PedSit ;
   private String A719PrdNum ;
   private String A659PedCum ;
   private String AV26Pgmname ;
   private java.util.Date AV15FecBor ;
   private java.util.Date A661PedFec ;
   private String AV20Inc_obs ;
   private short[] aP5 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P001J2_A396EmprCod ;
   private int[] P001J2_A658PedCod ;
   private String[] P001J2_A667PedSit ;
   private java.util.Date[] P001J2_A661PedFec ;
   private String[] P001J3_A719PrdNum ;
   private String[] P001J3_A396EmprCod ;
   private int[] P001J3_A658PedCod ;
   private String[] P001J3_A659PedCum ;
   private java.math.BigDecimal[] P001J3_A669PedUni ;
   private java.math.BigDecimal[] P001J3_A657PedCanEnt ;
   private java.math.BigDecimal[] P001J4_A684PrdCanPen ;
}

final  class pborped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001J2", "SELECT EmprCod, PedCod, PedSit, PedFec FROM TXPCPEDID WHERE (EmprCod = ?) AND (PedFec <= ?) AND (( PedSit = 'S' and ? = 6) or ( PedSit = 'N' and ? = 7)) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001J3", "SELECT PrdNum, EmprCod, PedCod, PedCum, PedUni, PedCanEnt FROM TXPLPEDID WHERE (EmprCod = ? AND PedCod = ?) AND (EmprCod = ? and PedCod = ?) ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001J4", "SELECT PrdCanPen FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001J5", "DELETE FROM TXPLPEDID  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
         ,new UpdateCursor("P001J6", "UPDATE TXPPRODUC SET PrdCanPen=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P001J7", "DELETE FROM TXPCPEDID  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

