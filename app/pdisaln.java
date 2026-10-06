package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisaln extends GXProcedure
{
   public pdisaln( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisaln.class ), "" );
   }

   public pdisaln( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 )
   {
      pdisaln.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      pdisaln.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisaln.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisaln.this.AV19UniMed = aP2[0];
      this.aP2 = aP2;
      pdisaln.this.AV21Peso = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38FlagMfR = (byte)(0) ;
      GXv_int1[0] = AV38FlagMfR ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSRDO", ""), GXv_int1) ;
      pdisaln.this.AV38FlagMfR = GXv_int1[0] ;
      GXv_int1[0] = AV39FlagGm2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSGM2", ""), GXv_int1) ;
      pdisaln.this.AV39FlagGm2 = GXv_int1[0] ;
      /* Using cursor P00TR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A350DisArtRdt = P00TR2_A350DisArtRdt[0] ;
         A595Kilos = P00TR2_A595Kilos[0] ;
         A631Metros = P00TR2_A631Metros[0] ;
         A334DisArtAnh = P00TR2_A334DisArtAnh[0] ;
         A1906DisGraAca = P00TR2_A1906DisGraAca[0] ;
         A44AlbRecCod = P00TR2_A44AlbRecCod[0] ;
         A350DisArtRdt = P00TR2_A350DisArtRdt[0] ;
         A334DisArtAnh = P00TR2_A334DisArtAnh[0] ;
         A1906DisGraAca = P00TR2_A1906DisGraAca[0] ;
         AV37Rdto = A350DisArtRdt ;
         if ( GXutil.strcmp(AV19UniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            if ( AV38FlagMfR == 1 )
            {
               A631Metros = A595Kilos.multiply(AV37Rdto) ;
            }
            else
            {
               if ( AV39FlagGm2 == 1 )
               {
                  AV40Ancho = DecimalUtil.doubleToDec(A334DisArtAnh/ (double) (100)) ;
                  if ( (DecimalUtil.doubleToDec(A1906DisGraAca).multiply(AV40Ancho)).doubleValue() > 0 )
                  {
                     AV41MetrosT = (A595Kilos.divide((DecimalUtil.doubleToDec(A1906DisGraAca).multiply(AV40Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
                  }
                  else
                  {
                     AV41MetrosT = DecimalUtil.doubleToDec(0) ;
                  }
                  A631Metros = AV41MetrosT ;
               }
               else
               {
                  A631Metros = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
         else
         {
            A595Kilos = A631Metros.multiply(DecimalUtil.doubleToDec(AV21Peso)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         /* Using cursor P00TR3 */
         pr_default.execute(1, new Object[] {A595Kilos, A631Metros, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisaln.this.A396EmprCod;
      this.aP1[0] = pdisaln.this.A361DisCod;
      this.aP2[0] = pdisaln.this.AV19UniMed;
      this.aP3[0] = pdisaln.this.AV21Peso;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisaln");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00TR2_A396EmprCod = new String[] {""} ;
      P00TR2_A361DisCod = new int[1] ;
      P00TR2_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TR2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TR2_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TR2_A334DisArtAnh = new short[1] ;
      P00TR2_A1906DisGraAca = new short[1] ;
      P00TR2_A44AlbRecCod = new int[1] ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      AV37Rdto = DecimalUtil.ZERO ;
      AV40Ancho = DecimalUtil.ZERO ;
      AV41MetrosT = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisaln__default(),
         new Object[] {
             new Object[] {
            P00TR2_A396EmprCod, P00TR2_A361DisCod, P00TR2_A350DisArtRdt, P00TR2_A595Kilos, P00TR2_A631Metros, P00TR2_A334DisArtAnh, P00TR2_A1906DisGraAca, P00TR2_A44AlbRecCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38FlagMfR ;
   private byte AV39FlagGm2 ;
   private byte GXv_int1[] ;
   private short AV21Peso ;
   private short A334DisArtAnh ;
   private short A1906DisGraAca ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal AV37Rdto ;
   private java.math.BigDecimal AV40Ancho ;
   private java.math.BigDecimal AV41MetrosT ;
   private String A396EmprCod ;
   private String AV19UniMed ;
   private String scmdbuf ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00TR2_A396EmprCod ;
   private int[] P00TR2_A361DisCod ;
   private java.math.BigDecimal[] P00TR2_A350DisArtRdt ;
   private java.math.BigDecimal[] P00TR2_A595Kilos ;
   private java.math.BigDecimal[] P00TR2_A631Metros ;
   private short[] P00TR2_A334DisArtAnh ;
   private short[] P00TR2_A1906DisGraAca ;
   private int[] P00TR2_A44AlbRecCod ;
}

final  class pdisaln__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TR2", "SELECT T1.EmprCod, T1.DisCod, T2.DisArtRdt, T1.Kilos, T1.Metros, T2.DisArtAnh, T2.DisGraAca, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00TR3", "UPDATE TXPDISALB SET Kilos=?, Metros=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

