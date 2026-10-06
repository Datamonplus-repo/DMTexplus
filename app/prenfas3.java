package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenfas3 extends GXProcedure
{
   public prenfas3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenfas3.class ), "" );
   }

   public prenfas3( int remoteHandle ,
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
                             byte[] aP5 ,
                             String[] aP6 )
   {
      prenfas3.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      prenfas3.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      prenfas3.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      prenfas3.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      prenfas3.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      prenfas3.this.AV39ExisParFas = aP4[0];
      this.aP4 = aP4;
      prenfas3.this.AV67FasMin = aP5[0];
      this.aP5 = aP5;
      prenfas3.this.AV112Usurcod = aP6[0];
      this.aP6 = aP6;
      prenfas3.this.AV114station = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03WQ2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P03WQ2_A194BarOrdLin[0] ;
         A758ProCod = P03WQ2_A758ProCod[0] ;
         A130BarCodPar = P03WQ2_A130BarCodPar[0] ;
         A132BarCodReo = P03WQ2_A132BarCodReo[0] ;
         A129BarCod = P03WQ2_A129BarCod[0] ;
         A396EmprCod = P03WQ2_A396EmprCod[0] ;
         A460FasDsc = P03WQ2_A460FasDsc[0] ;
         A457FasCod = P03WQ2_A457FasCod[0] ;
         A460FasDsc = P03WQ2_A460FasDsc[0] ;
         /* Using cursor P03WQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* Optimized DELETE. */
         /* Using cursor P03WQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
         /* End optimized DELETE. */
         AV110Inc_obs = httpContext.getMessage( "ELIMINACION BARFAS.Prenfas3", "") + GXutil.newLine( ) ;
         AV110Inc_obs += httpContext.getMessage( "Valor &Contador=0", "") + GXutil.newLine( ) ;
         AV110Inc_obs += httpContext.getMessage( "Proceso ", "") + GXutil.trim( A758ProCod) + GXutil.newLine( ) ;
         AV110Inc_obs += httpContext.getMessage( "Orden ", "") + GXutil.str( A194BarOrdLin, 4, 0) + " " + A460FasDsc + GXutil.newLine( ) ;
         AV110Inc_obs += httpContext.getMessage( "Fase ", "") + A457FasCod + " " + A460FasDsc + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV119Pgmname, AV112Usurcod, AV114station, AV110Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenfas3.this.AV15EmprCod;
      this.aP1[0] = prenfas3.this.AV16BarCod;
      this.aP2[0] = prenfas3.this.AV17BarCodReo;
      this.aP3[0] = prenfas3.this.AV18BarCodPar;
      this.aP4[0] = prenfas3.this.AV39ExisParFas;
      this.aP5[0] = prenfas3.this.AV67FasMin;
      this.aP6[0] = prenfas3.this.AV112Usurcod;
      this.aP7[0] = prenfas3.this.AV114station;
      Application.commitDataStores(context, remoteHandle, pr_default, "prenfas3");
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
      P03WQ2_A194BarOrdLin = new short[1] ;
      P03WQ2_A758ProCod = new String[] {""} ;
      P03WQ2_A130BarCodPar = new String[] {""} ;
      P03WQ2_A132BarCodReo = new byte[1] ;
      P03WQ2_A129BarCod = new int[1] ;
      P03WQ2_A396EmprCod = new String[] {""} ;
      P03WQ2_A460FasDsc = new String[] {""} ;
      P03WQ2_A457FasCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      AV110Inc_obs = "" ;
      AV119Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenfas3__default(),
         new Object[] {
             new Object[] {
            P03WQ2_A194BarOrdLin, P03WQ2_A758ProCod, P03WQ2_A130BarCodPar, P03WQ2_A132BarCodReo, P03WQ2_A129BarCod, P03WQ2_A396EmprCod, P03WQ2_A460FasDsc, P03WQ2_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV119Pgmname = "PRENFAS3" ;
      /* GeneXus formulas. */
      AV119Pgmname = "PRENFAS3" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV67FasMin ;
   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV39ExisParFas ;
   private String AV112Usurcod ;
   private String AV114station ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV119Pgmname ;
   private String AV110Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P03WQ2_A194BarOrdLin ;
   private String[] P03WQ2_A758ProCod ;
   private String[] P03WQ2_A130BarCodPar ;
   private byte[] P03WQ2_A132BarCodReo ;
   private int[] P03WQ2_A129BarCod ;
   private String[] P03WQ2_A396EmprCod ;
   private String[] P03WQ2_A460FasDsc ;
   private String[] P03WQ2_A457FasCod ;
}

final  class prenfas3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WQ2", "SELECT T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.FasDsc, T1.FasCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03WQ3", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P03WQ4", "DELETE FROM TXPBarPar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

