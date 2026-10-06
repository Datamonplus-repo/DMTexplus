package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstodet extends GXProcedure
{
   public pstodet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstodet.class ), "" );
   }

   public pstodet( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pstodet.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pstodet.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pstodet.this.AV10AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pstodet.this.AV9Barpiecod = aP2[0];
      this.aP2 = aP2;
      pstodet.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P04EZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10AlbRecCod), AV9Barpiecod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P04EZ2_A44AlbRecCod[0] ;
         A200BarPieCod = P04EZ2_A200BarPieCod[0] ;
         A205BarPieMet = P04EZ2_A205BarPieMet[0] ;
         A130BarCodPar = P04EZ2_A130BarCodPar[0] ;
         A132BarCodReo = P04EZ2_A132BarCodReo[0] ;
         A129BarCod = P04EZ2_A129BarCod[0] ;
         Gx_msg = httpContext.getMessage( "Pieza en Produccion ¡¡¡. Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + GXutil.trim( A130BarCodPar) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(Gx_msg, " ") == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P04EZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10AlbRecCod), AV9Barpiecod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         /* End optimized DELETE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pstodet.this.A396EmprCod;
      this.aP1[0] = pstodet.this.AV10AlbRecCod;
      this.aP2[0] = pstodet.this.AV9Barpiecod;
      this.aP3[0] = pstodet.this.Gx_msg;
      Application.commitDataStores(context, remoteHandle, pr_default, "pstodet");
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
      P04EZ2_A396EmprCod = new String[] {""} ;
      P04EZ2_A44AlbRecCod = new int[1] ;
      P04EZ2_A200BarPieCod = new String[] {""} ;
      P04EZ2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04EZ2_A130BarCodPar = new String[] {""} ;
      P04EZ2_A132BarCodReo = new byte[1] ;
      P04EZ2_A129BarCod = new int[1] ;
      A200BarPieCod = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pstodet__default(),
         new Object[] {
             new Object[] {
            P04EZ2_A396EmprCod, P04EZ2_A44AlbRecCod, P04EZ2_A200BarPieCod, P04EZ2_A205BarPieMet, P04EZ2_A130BarCodPar, P04EZ2_A132BarCodReo, P04EZ2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV10AlbRecCod ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String AV9Barpiecod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04EZ2_A396EmprCod ;
   private int[] P04EZ2_A44AlbRecCod ;
   private String[] P04EZ2_A200BarPieCod ;
   private java.math.BigDecimal[] P04EZ2_A205BarPieMet ;
   private String[] P04EZ2_A130BarCodPar ;
   private byte[] P04EZ2_A132BarCodReo ;
   private int[] P04EZ2_A129BarCod ;
}

final  class pstodet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04EZ2", "SELECT EmprCod, AlbRecCod, BarPieCod, BarPieMet, BarCodPar, BarCodReo, BarCod FROM TXPBARPIE WHERE EmprCod = ? and AlbRecCod = ? and BarPieCod = ? ORDER BY EmprCod, AlbRecCod, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04EZ3", "DELETE FROM TXPALBDET  WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

