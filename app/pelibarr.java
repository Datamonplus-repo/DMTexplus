package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelibarr extends GXProcedure
{
   public pelibarr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelibarr.class ), "" );
   }

   public pelibarr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pelibarr.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pelibarr.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pelibarr.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pelibarr.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pelibarr.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pelibarr.this.AV19BarAgrCod = aP4[0];
      this.aP4 = aP4;
      pelibarr.this.AV20BarAgrReo = aP5[0];
      this.aP5 = aP5;
      pelibarr.this.AV21BarAgrPar = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CM2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02CM2_A130BarCodPar[0] ;
         A132BarCodReo = P02CM2_A132BarCodReo[0] ;
         A129BarCod = P02CM2_A129BarCod[0] ;
         A396EmprCod = P02CM2_A396EmprCod[0] ;
         A120BarAgrEst = P02CM2_A120BarAgrEst[0] ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         /* Using cursor P02CM3 */
         pr_default.execute(1, new Object[] {A120BarAgrEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P02CM4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P02CM5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelibarr.this.AV15EmprCod;
      this.aP1[0] = pelibarr.this.AV16BarCod;
      this.aP2[0] = pelibarr.this.AV17BarCodReo;
      this.aP3[0] = pelibarr.this.AV18BarCodPar;
      this.aP4[0] = pelibarr.this.AV19BarAgrCod;
      this.aP5[0] = pelibarr.this.AV20BarAgrReo;
      this.aP6[0] = pelibarr.this.AV21BarAgrPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelibarr");
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
      P02CM2_A130BarCodPar = new String[] {""} ;
      P02CM2_A132BarCodReo = new byte[1] ;
      P02CM2_A129BarCod = new int[1] ;
      P02CM2_A396EmprCod = new String[] {""} ;
      P02CM2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A120BarAgrEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelibarr__default(),
         new Object[] {
             new Object[] {
            P02CM2_A130BarCodPar, P02CM2_A132BarCodReo, P02CM2_A129BarCod, P02CM2_A396EmprCod, P02CM2_A120BarAgrEst
            }
            , new Object[] {
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

   private byte AV17BarCodReo ;
   private byte AV20BarAgrReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV19BarAgrCod ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV21BarAgrPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CM2_A130BarCodPar ;
   private byte[] P02CM2_A132BarCodReo ;
   private int[] P02CM2_A129BarCod ;
   private String[] P02CM2_A396EmprCod ;
   private String[] P02CM2_A120BarAgrEst ;
}

final  class pelibarr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CM2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02CM3", "UPDATE TXPBARCAD SET BarAgrEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P02CM4", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P02CM5", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

