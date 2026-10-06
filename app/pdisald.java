package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisald extends GXProcedure
{
   public pdisald( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisald.class ), "" );
   }

   public pdisald( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 )
   {
      pdisald.this.aP3 = new short[] {0};
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
      pdisald.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisald.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisald.this.AV19UniMed = aP2[0];
      this.aP2 = aP2;
      pdisald.this.AV21Peso = aP3[0];
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
      pdisald.this.AV38FlagMfR = GXv_int1[0] ;
      /* Using cursor P00TQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A350DisArtRdt = P00TQ2_A350DisArtRdt[0] ;
         A384DisPieMet = P00TQ2_A384DisPieMet[0] ;
         A382DisPieKil = P00TQ2_A382DisPieKil[0] ;
         A380DisPieCod = P00TQ2_A380DisPieCod[0] ;
         A44AlbRecCod = P00TQ2_A44AlbRecCod[0] ;
         A350DisArtRdt = P00TQ2_A350DisArtRdt[0] ;
         AV37Rdto = A350DisArtRdt ;
         if ( GXutil.strcmp(AV19UniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            if ( AV38FlagMfR == 1 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37Rdto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A384DisPieMet)==0) )
               {
                  A384DisPieMet = A382DisPieKil.multiply(AV37Rdto) ;
               }
            }
         }
         else
         {
            if ( AV21Peso != 0 )
            {
               A382DisPieKil = A384DisPieMet.multiply(DecimalUtil.doubleToDec(AV21Peso)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         /* Using cursor P00TQ3 */
         pr_default.execute(1, new Object[] {A384DisPieMet, A382DisPieKil, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisald.this.A396EmprCod;
      this.aP1[0] = pdisald.this.A361DisCod;
      this.aP2[0] = pdisald.this.AV19UniMed;
      this.aP3[0] = pdisald.this.AV21Peso;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisald");
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
      P00TQ2_A396EmprCod = new String[] {""} ;
      P00TQ2_A361DisCod = new int[1] ;
      P00TQ2_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TQ2_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TQ2_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TQ2_A380DisPieCod = new String[] {""} ;
      P00TQ2_A44AlbRecCod = new int[1] ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A380DisPieCod = "" ;
      AV37Rdto = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisald__default(),
         new Object[] {
             new Object[] {
            P00TQ2_A396EmprCod, P00TQ2_A361DisCod, P00TQ2_A350DisArtRdt, P00TQ2_A384DisPieMet, P00TQ2_A382DisPieKil, P00TQ2_A380DisPieCod, P00TQ2_A44AlbRecCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38FlagMfR ;
   private byte GXv_int1[] ;
   private short AV21Peso ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal AV37Rdto ;
   private String A396EmprCod ;
   private String AV19UniMed ;
   private String scmdbuf ;
   private String A380DisPieCod ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00TQ2_A396EmprCod ;
   private int[] P00TQ2_A361DisCod ;
   private java.math.BigDecimal[] P00TQ2_A350DisArtRdt ;
   private java.math.BigDecimal[] P00TQ2_A384DisPieMet ;
   private java.math.BigDecimal[] P00TQ2_A382DisPieKil ;
   private String[] P00TQ2_A380DisPieCod ;
   private int[] P00TQ2_A44AlbRecCod ;
}

final  class pdisald__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TQ2", "SELECT T1.EmprCod, T1.DisCod, T2.DisArtRdt, T1.DisPieMet, T1.DisPieKil, T1.DisPieCod, T1.AlbRecCod FROM (TXPDISALD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod, T1.DisPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00TQ3", "UPDATE TXPDISALD SET DisPieMet=?, DisPieKil=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

