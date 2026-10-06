package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdt011 extends GXProcedure
{
   public pdt011( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdt011.class ), "" );
   }

   public pdt011( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      pdt011.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      pdt011.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdt011.this.AV14Procod = aP1[0];
      this.aP1 = aP1;
      pdt011.this.AV15Pronumlin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Proceso Eliminacion Tablas, Dt002,Dt0021,Prolin...", "") );
      /* Using cursor P03752 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV14Procod, Short.valueOf(AV15Pronumlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7897Dtp_Ordl = P03752_A7897Dtp_Ordl[0] ;
         A774ProNumLin = P03752_A774ProNumLin[0] ;
         A758ProCod = P03752_A758ProCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P03753 */
         pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
         /* End optimized DELETE. */
         /* Using cursor P03754 */
         pr_default.execute(2, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdt011.this.A396EmprCod;
      this.aP1[0] = pdt011.this.AV14Procod;
      this.aP2[0] = pdt011.this.AV15Pronumlin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdt011");
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
      P03752_A396EmprCod = new String[] {""} ;
      P03752_A7897Dtp_Ordl = new short[1] ;
      P03752_A774ProNumLin = new short[1] ;
      P03752_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdt011__default(),
         new Object[] {
             new Object[] {
            P03752_A396EmprCod, P03752_A7897Dtp_Ordl, P03752_A774ProNumLin, P03752_A758ProCod
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

   private short AV15Pronumlin ;
   private short A7897Dtp_Ordl ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV14Procod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03752_A396EmprCod ;
   private short[] P03752_A7897Dtp_Ordl ;
   private short[] P03752_A774ProNumLin ;
   private String[] P03752_A758ProCod ;
}

final  class pdt011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03752", "SELECT EmprCod, Dtp_Ordl, ProNumLin, ProCod FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03753", "DELETE FROM TXPDT0021  WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0021")
         ,new UpdateCursor("P03754", "DELETE FROM TXPDT002  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT002")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

