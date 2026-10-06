package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbjbp extends GXProcedure
{
   public pbjbp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbjbp.class ), "" );
   }

   public pbjbp( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pbjbp.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pbjbp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbjbp.this.AV15AlbComcod = aP1[0];
      this.aP1 = aP1;
      pbjbp.this.AV16AlbComLin = aP2[0];
      this.aP2 = aP2;
      pbjbp.this.AV20Op = aP3[0];
      this.aP3 = aP3;
      pbjbp.this.AV18Usurcod = aP4[0];
      this.aP4 = aP4;
      pbjbp.this.AV19Station = aP5[0];
      this.aP5 = aP5;
      pbjbp.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Proceso NO REALIZADO ¡¡¡", "") ;
      if ( GXutil.strcmp(AV20Op, httpContext.getMessage( "C", "")) == 0 )
      {
         /* Using cursor P012Q2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15AlbComcod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14AlbComCod = P012Q2_A14AlbComCod[0] ;
            /* Using cursor P012Q3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A10355AlbComHd = P012Q3_A10355AlbComHd[0] ;
               A10356ALbComR = P012Q3_A10356ALbComR[0] ;
               A10357AlbComP = P012Q3_A10357AlbComP[0] ;
               A20AlbComLin = P012Q3_A20AlbComLin[0] ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A10355AlbComHd ;
               GXv_int3[0] = A10356ALbComR ;
               GXv_char4[0] = A10357AlbComP ;
               GXv_char5[0] = AV18Usurcod ;
               GXv_char6[0] = AV19Station ;
               GXv_int7[0] = AV15AlbComcod ;
               new app.pinduyco(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_int7) ;
               pbjbp.this.A396EmprCod = GXv_char1[0] ;
               pbjbp.this.A10355AlbComHd = GXv_int2[0] ;
               pbjbp.this.A10356ALbComR = GXv_int3[0] ;
               pbjbp.this.A10357AlbComP = GXv_char4[0] ;
               pbjbp.this.AV18Usurcod = GXv_char5[0] ;
               pbjbp.this.AV19Station = GXv_char6[0] ;
               pbjbp.this.AV15AlbComcod = GXv_int7[0] ;
               /* Using cursor P012Q4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Optimized DELETE. */
            /* Using cursor P012Q5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALC");
            /* End optimized DELETE. */
            AV17Texto_i = httpContext.getMessage( "TALBCOM-MANTENIMIENTO ALBARAN COMERCIAL", "") + GXutil.chr( (short)(13)) ;
            AV17Texto_i += httpContext.getMessage( "ELIMINACION TOTAL ALBARAN TIPO EN DEPOSITO ", "") + GXutil.str( AV15AlbComcod, 8, 0) + GXutil.chr( (short)(13)) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TALBCOM", ""), AV18Usurcod, AV19Station, AV17Texto_i, 99999999, (byte)(0), " ") ;
            /* Using cursor P012Q6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            Gx_msg = httpContext.getMessage( "Proceso REALIZADO ¡¡¡", "") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( GXutil.strcmp(AV20Op, httpContext.getMessage( "L", "")) == 0 )
      {
         /* Using cursor P012Q7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV15AlbComcod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A14AlbComCod = P012Q7_A14AlbComCod[0] ;
            A10355AlbComHd = P012Q7_A10355AlbComHd[0] ;
            A10356ALbComR = P012Q7_A10356ALbComR[0] ;
            A10357AlbComP = P012Q7_A10357AlbComP[0] ;
            A20AlbComLin = P012Q7_A20AlbComLin[0] ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int7[0] = A10355AlbComHd ;
            GXv_int3[0] = A10356ALbComR ;
            GXv_char5[0] = A10357AlbComP ;
            GXv_char4[0] = AV18Usurcod ;
            GXv_char1[0] = AV19Station ;
            GXv_int2[0] = AV15AlbComcod ;
            new app.pinduyco(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int3, GXv_char5, GXv_char4, GXv_char1, GXv_int2) ;
            pbjbp.this.A396EmprCod = GXv_char6[0] ;
            pbjbp.this.A10355AlbComHd = GXv_int7[0] ;
            pbjbp.this.A10356ALbComR = GXv_int3[0] ;
            pbjbp.this.A10357AlbComP = GXv_char5[0] ;
            pbjbp.this.AV18Usurcod = GXv_char4[0] ;
            pbjbp.this.AV19Station = GXv_char1[0] ;
            pbjbp.this.AV15AlbComcod = GXv_int2[0] ;
            /* Using cursor P012Q8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
            Gx_msg = httpContext.getMessage( "Proceso REALIZADO ¡¡¡", "") ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbjbp.this.A396EmprCod;
      this.aP1[0] = pbjbp.this.AV15AlbComcod;
      this.aP2[0] = pbjbp.this.AV16AlbComLin;
      this.aP3[0] = pbjbp.this.AV20Op;
      this.aP4[0] = pbjbp.this.AV18Usurcod;
      this.aP5[0] = pbjbp.this.AV19Station;
      this.aP6[0] = pbjbp.this.Gx_msg;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbjbp");
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
      P012Q2_A396EmprCod = new String[] {""} ;
      P012Q2_A14AlbComCod = new int[1] ;
      P012Q3_A396EmprCod = new String[] {""} ;
      P012Q3_A14AlbComCod = new int[1] ;
      P012Q3_A10355AlbComHd = new int[1] ;
      P012Q3_A10356ALbComR = new byte[1] ;
      P012Q3_A10357AlbComP = new String[] {""} ;
      P012Q3_A20AlbComLin = new short[1] ;
      A10357AlbComP = "" ;
      AV17Texto_i = "" ;
      P012Q7_A396EmprCod = new String[] {""} ;
      P012Q7_A14AlbComCod = new int[1] ;
      P012Q7_A10355AlbComHd = new int[1] ;
      P012Q7_A10356ALbComR = new byte[1] ;
      P012Q7_A10357AlbComP = new String[] {""} ;
      P012Q7_A20AlbComLin = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbjbp__default(),
         new Object[] {
             new Object[] {
            P012Q2_A396EmprCod, P012Q2_A14AlbComCod
            }
            , new Object[] {
            P012Q3_A396EmprCod, P012Q3_A14AlbComCod, P012Q3_A10355AlbComHd, P012Q3_A10356ALbComR, P012Q3_A10357AlbComP, P012Q3_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P012Q7_A396EmprCod, P012Q7_A14AlbComCod, P012Q7_A10355AlbComHd, P012Q7_A10356ALbComR, P012Q7_A10357AlbComP, P012Q7_A20AlbComLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10356ALbComR ;
   private byte GXv_int3[] ;
   private short AV16AlbComLin ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV15AlbComcod ;
   private int A14AlbComCod ;
   private int A10355AlbComHd ;
   private int GXv_int7[] ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV20Op ;
   private String AV18Usurcod ;
   private String AV19Station ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A10357AlbComP ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String AV17Texto_i ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P012Q2_A396EmprCod ;
   private int[] P012Q2_A14AlbComCod ;
   private String[] P012Q3_A396EmprCod ;
   private int[] P012Q3_A14AlbComCod ;
   private int[] P012Q3_A10355AlbComHd ;
   private byte[] P012Q3_A10356ALbComR ;
   private String[] P012Q3_A10357AlbComP ;
   private short[] P012Q3_A20AlbComLin ;
   private String[] P012Q7_A396EmprCod ;
   private int[] P012Q7_A14AlbComCod ;
   private int[] P012Q7_A10355AlbComHd ;
   private byte[] P012Q7_A10356ALbComR ;
   private String[] P012Q7_A10357AlbComP ;
   private short[] P012Q7_A20AlbComLin ;
}

final  class pbjbp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012Q2", "SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P012Q3", "SELECT EmprCod, AlbComCod, AlbComHd, ALbComR, AlbComP, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012Q4", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALCOM")
         ,new UpdateCursor("P012Q5", "DELETE FROM TXPOBSALC  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALC")
         ,new UpdateCursor("P012Q6", "DELETE FROM TXPCALCOM  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P012Q7", "SELECT EmprCod, AlbComCod, AlbComHd, ALbComR, AlbComP, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012Q8", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALCOM")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

