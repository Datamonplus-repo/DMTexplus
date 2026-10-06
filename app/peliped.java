package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliped extends GXProcedure
{
   public peliped( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliped.class ), "" );
   }

   public peliped( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      peliped.this.aP1 = new int[] {0};
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
      peliped.this.AV25EmprCod = aP0[0];
      this.aP0 = aP0;
      peliped.this.AV23PedCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      peliped.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      peliped.this.AV25EmprCod = GXv_char2[0] ;
      peliped.this.AV20EmprNom = GXv_char3[0] ;
      peliped.this.AV21UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV26carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      peliped.this.GXt_int5 = GXv_int6[0] ;
      AV26carvema = GXt_int5 ;
      AV16PedCanEnt = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P00402 */
      pr_default.execute(0, new Object[] {AV25EmprCod, Integer.valueOf(AV23PedCod)});
      c657PedCanEnt = P00402_A657PedCanEnt[0] ;
      pr_default.close(0);
      AV16PedCanEnt = AV16PedCanEnt.add(c657PedCanEnt) ;
      /* End optimized group. */
      if ( AV16PedCanEnt.doubleValue() == 0 )
      {
         AV24Lineas = (short)(0) ;
         /* Using cursor P00403 */
         pr_default.execute(1, new Object[] {AV25EmprCod, Integer.valueOf(AV23PedCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P00403_A396EmprCod[0] ;
            A658PedCod = P00403_A658PedCod[0] ;
            A795PrvNum = P00403_A795PrvNum[0] ;
            AV15PrvNum = A795PrvNum ;
            /* Using cursor P00404 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A669PedUni = P00404_A669PedUni[0] ;
               A719PrdNum = P00404_A719PrdNum[0] ;
               AV18PrdNum = A719PrdNum ;
               if ( AV26carvema == 1 )
               {
                  /* Execute user subroutine: 'PRESOL1' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(1);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               GXv_char4[0] = A396EmprCod ;
               GXv_int7[0] = AV15PrvNum ;
               GXv_char3[0] = A719PrdNum ;
               new app.pelipre2(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
               peliped.this.A396EmprCod = GXv_char4[0] ;
               peliped.this.AV15PrvNum = GXv_int7[0] ;
               peliped.this.A719PrdNum = GXv_char3[0] ;
               /* Using cursor P00405 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = A719PrdNum ;
               GXv_int7[0] = A658PedCod ;
               new app.pclospe2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
               peliped.this.A396EmprCod = GXv_char4[0] ;
               peliped.this.A719PrdNum = GXv_char3[0] ;
               peliped.this.A658PedCod = GXv_int7[0] ;
               AV24Lineas = (short)(AV24Lineas+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV24Lineas > 0 )
         {
            AV22Texto_i = httpContext.getMessage( "Tabla LPEDID, Total registros eliminados ", "") + GXutil.trim( GXutil.str( AV24Lineas, 4, 0)) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV21UsurCod, AV19Station, AV22Texto_i, AV23PedCod, (byte)(0), " ") ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Hay cantidad entregada", ""));
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PRESOL1' Routine */
      returnInSub = false ;
      n6299PrePedCod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00406 */
      pr_default.execute(4, new Object[] {AV25EmprCod, Integer.valueOf(AV17PRECONUM), AV18PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRESO1");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliped.this.AV25EmprCod;
      this.aP1[0] = peliped.this.AV23PedCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliped");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20EmprNom = "" ;
      AV21UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV16PedCanEnt = DecimalUtil.ZERO ;
      c657PedCanEnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00402_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A396EmprCod = new String[] {""} ;
      P00403_A658PedCod = new int[1] ;
      P00403_A795PrvNum = new int[1] ;
      A396EmprCod = "" ;
      P00404_A396EmprCod = new String[] {""} ;
      P00404_A658PedCod = new int[1] ;
      P00404_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00404_A719PrdNum = new String[] {""} ;
      A669PedUni = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV18PrdNum = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      AV22Texto_i = "" ;
      AV32Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliped__default(),
         new Object[] {
             new Object[] {
            P00402_A657PedCanEnt
            }
            , new Object[] {
            P00403_A396EmprCod, P00403_A658PedCod, P00403_A795PrvNum
            }
            , new Object[] {
            P00404_A396EmprCod, P00404_A658PedCod, P00404_A669PedUni, P00404_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV32Pgmname = "PELIPED" ;
      /* GeneXus formulas. */
      AV32Pgmname = "PELIPED" ;
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV26carvema ;
   private short AV24Lineas ;
   private short Gx_err ;
   private int AV23PedCod ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV15PrvNum ;
   private int GXv_int7[] ;
   private int AV17PRECONUM ;
   private java.math.BigDecimal AV16PedCanEnt ;
   private java.math.BigDecimal c657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private String AV25EmprCod ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20EmprNom ;
   private String AV21UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV18PrdNum ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV32Pgmname ;
   private boolean returnInSub ;
   private boolean n6299PrePedCod ;
   private String AV22Texto_i ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00402_A657PedCanEnt ;
   private String[] P00403_A396EmprCod ;
   private int[] P00403_A658PedCod ;
   private int[] P00403_A795PrvNum ;
   private String[] P00404_A396EmprCod ;
   private int[] P00404_A658PedCod ;
   private java.math.BigDecimal[] P00404_A669PedUni ;
   private String[] P00404_A719PrdNum ;
}

final  class peliped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00402", "SELECT SUM(PedCanEnt) FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00403", "SELECT EmprCod, PedCod, PrvNum FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00404", "SELECT EmprCod, PedCod, PedUni, PrdNum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00405", "DELETE FROM TXPLPEDID  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
         ,new UpdateCursor("P00406", "UPDATE TXPPRESO1 SET PrePedCod=0  WHERE EmprCod = ? and PreCoNum = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRESO1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

