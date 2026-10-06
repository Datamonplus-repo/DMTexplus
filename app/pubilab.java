package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubilab extends GXProcedure
{
   public pubilab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubilab.class ), "" );
   }

   public pubilab( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 )
   {
      pubilab.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      pubilab.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubilab.this.AV15PartCod = aP1[0];
      this.aP1 = aP1;
      pubilab.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      pubilab.this.AV17Albaran = aP3[0];
      this.aP3 = aP3;
      pubilab.this.AV18Kilos = aP4[0];
      this.aP4 = aP4;
      pubilab.this.AV19Conos = aP5[0];
      this.aP5 = aP5;
      pubilab.this.AV20Locali = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00FR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15PartCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2272MovParULi = P00FR2_A2272MovParULi[0] ;
         n2272MovParULi = P00FR2_n2272MovParULi[0] ;
         A252CliCod = P00FR2_A252CliCod[0] ;
         A2268MovParCod = P00FR2_A2268MovParCod[0] ;
         W2268MovParCod = A2268MovParCod ;
         W252CliCod = A252CliCod ;
         /*
            INSERT RECORD ON TABLE TXPLMOVPD

         */
         W2268MovParCod = A2268MovParCod ;
         W252CliCod = A252CliCod ;
         A2268MovParCod = AV15PartCod ;
         A252CliCod = AV16CliCod ;
         A2276MovParLin = (short)(A2272MovParULi+1) ;
         A2277MovParLiT = httpContext.getMessage( "D", "") ;
         n2277MovParLiT = false ;
         A2278MovParAlb = AV17Albaran ;
         n2278MovParAlb = false ;
         A2280MovParFec = Gx_date ;
         n2280MovParFec = false ;
         A2283MovParKU = AV18Kilos ;
         n2283MovParKU = false ;
         A2284MovParCU = AV19Conos ;
         n2284MovParCU = false ;
         A2279MovParSit = httpContext.getMessage( "SALIDA A LABORATORIO", "") ;
         n2279MovParSit = false ;
         A2285MovParLoc = AV20Locali ;
         n2285MovParLoc = false ;
         /* Using cursor P00FR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2268MovParCod, Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin), Boolean.valueOf(n2277MovParLiT), A2277MovParLiT, Boolean.valueOf(n2278MovParAlb), Integer.valueOf(A2278MovParAlb), Boolean.valueOf(n2279MovParSit), A2279MovParSit, Boolean.valueOf(n2280MovParFec), A2280MovParFec, Boolean.valueOf(n2283MovParKU), A2283MovParKU, Boolean.valueOf(n2284MovParCU), Short.valueOf(A2284MovParCU), Boolean.valueOf(n2285MovParLoc), A2285MovParLoc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A2268MovParCod = W2268MovParCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         A2272MovParULi = (short)(A2272MovParULi+1) ;
         n2272MovParULi = false ;
         /* Using cursor P00FR4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n2272MovParULi), Short.valueOf(A2272MovParULi), A396EmprCod, A2268MovParCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMOVPD");
         A2268MovParCod = W2268MovParCod ;
         A252CliCod = W252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubilab.this.A396EmprCod;
      this.aP1[0] = pubilab.this.AV15PartCod;
      this.aP2[0] = pubilab.this.AV16CliCod;
      this.aP3[0] = pubilab.this.AV17Albaran;
      this.aP4[0] = pubilab.this.AV18Kilos;
      this.aP5[0] = pubilab.this.AV19Conos;
      this.aP6[0] = pubilab.this.AV20Locali;
      Application.commitDataStores(context, remoteHandle, pr_default, "pubilab");
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
      P00FR2_A396EmprCod = new String[] {""} ;
      P00FR2_A2272MovParULi = new short[1] ;
      P00FR2_n2272MovParULi = new boolean[] {false} ;
      P00FR2_A252CliCod = new int[1] ;
      P00FR2_A2268MovParCod = new String[] {""} ;
      A2268MovParCod = "" ;
      W2268MovParCod = "" ;
      A2277MovParLiT = "" ;
      A2280MovParFec = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A2283MovParKU = DecimalUtil.ZERO ;
      A2279MovParSit = "" ;
      A2285MovParLoc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubilab__default(),
         new Object[] {
             new Object[] {
            P00FR2_A396EmprCod, P00FR2_A2272MovParULi, P00FR2_n2272MovParULi, P00FR2_A252CliCod, P00FR2_A2268MovParCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short AV19Conos ;
   private short A2272MovParULi ;
   private short A2276MovParLin ;
   private short A2284MovParCU ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV17Albaran ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS308 ;
   private int A2278MovParAlb ;
   private java.math.BigDecimal AV18Kilos ;
   private java.math.BigDecimal A2283MovParKU ;
   private String A396EmprCod ;
   private String AV15PartCod ;
   private String AV20Locali ;
   private String scmdbuf ;
   private String A2268MovParCod ;
   private String W2268MovParCod ;
   private String A2277MovParLiT ;
   private String A2279MovParSit ;
   private String A2285MovParLoc ;
   private String Gx_emsg ;
   private java.util.Date A2280MovParFec ;
   private java.util.Date Gx_date ;
   private boolean n2272MovParULi ;
   private boolean n2277MovParLiT ;
   private boolean n2278MovParAlb ;
   private boolean n2280MovParFec ;
   private boolean n2283MovParKU ;
   private boolean n2284MovParCU ;
   private boolean n2279MovParSit ;
   private boolean n2285MovParLoc ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00FR2_A396EmprCod ;
   private short[] P00FR2_A2272MovParULi ;
   private boolean[] P00FR2_n2272MovParULi ;
   private int[] P00FR2_A252CliCod ;
   private String[] P00FR2_A2268MovParCod ;
}

final  class pubilab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FR2", "SELECT EmprCod, MovParULi, CliCod, MovParCod FROM TXPCMOVPD WHERE EmprCod = ? and MovParCod = ? and CliCod = ? ORDER BY EmprCod, MovParCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00FR3", "INSERT INTO TXPLMOVPD(EmprCod, MovParCod, CliCod, MovParLin, MovParLiT, MovParAlb, MovParSit, MovParFec, MovParKU, MovParCU, MovParLoc, MovParKE, MovParCE, MovParExL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
         ,new UpdateCursor("P00FR4", "UPDATE TXPCMOVPD SET MovParULi=?  WHERE EmprCod = ? AND MovParCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMOVPD")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 10);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

